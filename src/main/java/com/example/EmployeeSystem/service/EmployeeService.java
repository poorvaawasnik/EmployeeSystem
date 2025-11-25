package com.example.EmployeeSystem.service;

import com.example.EmployeeSystem.entity.EmployeeEntity;
import com.example.EmployeeSystem.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public void saveEmployee(EmployeeEntity entity)
    {
        employeeRepository.save(entity);
    }
    public List<EmployeeEntity> getAllEmployee(){
        return employeeRepository.findAll();
    }
    public List<EmployeeEntity> getEmployeeByName(){
        return employeeRepository.getEmployeeByName();
    }
    public  List<EmployeeEntity> getEmployeeByJob(){
        return employeeRepository.getEmployeeByJob();
    }
}
