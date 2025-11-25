package com.example.EmployeeSystem.controller;

import com.example.EmployeeSystem.entity.EmployeeEntity;
import com.example.EmployeeSystem.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MyController {
    @Autowired
    EmployeeService employeeService;

    @RequestMapping("")
    public String index()
    {
        return "index";
    }
    @RequestMapping("createemp")
    public String createempform(Model model)
    {
        EmployeeEntity entity=new EmployeeEntity();
        model.addAttribute("entity",entity);
        return "createempform";
    }
    @RequestMapping("createempsubmit")
    @ResponseBody
    public String createempsubmit( @ModelAttribute("entity") EmployeeEntity entity)
    {
        employeeService.saveEmployee(entity);
        return "createempsubmit";
    }
    @RequestMapping("listemp")
    public String listemp(Model model){
        List<EmployeeEntity> emplist=employeeService.getAllEmployee();
        model.addAttribute("emplist",emplist);
        return "listemp";
    }
    @RequestMapping("listempbyname")
    public String listempbyname(Model model){
        List<EmployeeEntity> emplist=employeeService.getEmployeeByName();
        model.addAttribute("emplist",emplist);
        return "listemp";
    }
    @RequestMapping("listempbyjob")
    public String listempbyjob(Model model){
        List<EmployeeEntity> emplist=employeeService.getEmployeeByJob();
        model.addAttribute("emplist",emplist);
        return "listemp";
    }
}
