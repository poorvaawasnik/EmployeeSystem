package com.example.EmployeeSystem.controller;

import com.example.EmployeeSystem.entity.AddressEntity;
import com.example.EmployeeSystem.entity.EmployeeEntity;
import com.example.EmployeeSystem.entity.UserEntity;
import com.example.EmployeeSystem.service.EmployeeService;
import com.example.EmployeeSystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MyController {
    @Autowired
    EmployeeService employeeService;
    @Autowired
    UserService userService;

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
    @RequestMapping("listempsearchsubmit")
            public String listempsearchsubmit(@RequestParam("search") String name , Model model)
    {
        List<EmployeeEntity> emplist=employeeService.searchEmployeeByName(name);
        if(emplist.size() > 0)
        {
            model.addAttribute("emplist",emplist);
        }else {
            model.addAttribute("emplist",null);
        }
        return "listemp";
    }

    @RequestMapping("useraddresssave")
    @ResponseBody
    public String useraddresssave(){
        AddressEntity addressEntity=new AddressEntity("Rajapeth","Amaravti",444601);
        UserEntity userEntity=new UserEntity("Amit Jain",addressEntity);
        AddressEntity addressEntity1=new AddressEntity("gadge nagar","Amravati",444601);
        UserEntity userEntity1=new UserEntity("Puja patil",addressEntity1);
        userService.saveUser(userEntity);
        userService.saveUser(userEntity1);
        return "User Address Save";

    }
    @RequestMapping("useraddressget")
    @ResponseBody
    public String useraddressget(@RequestParam("id") int id){
        UserEntity userEntity = userService.getUserById(id);

        if (userEntity == null) {
            return "User not found with id " + id;
        }

        AddressEntity address = userEntity.getAddress();

        return "Name: " + userEntity.getName() +
                " Address: " + address.getArea() + ", " +
                address.getCity() + " - " + address.getPincode();
    }

}
