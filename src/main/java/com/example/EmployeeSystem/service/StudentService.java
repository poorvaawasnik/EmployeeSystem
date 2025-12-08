package com.example.EmployeeSystem.service;

import com.example.EmployeeSystem.entity.StudentEntity;
import com.example.EmployeeSystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    public void saveStudent(StudentEntity entity)
    {
        studentRepository.save(entity);

    }

    public StudentEntity getStudentById(int id)
    {
        return studentRepository.findById(id).orElse(null);
    }
    public  void studentDelete(int id){
        studentRepository.deleteById(id);
    }
}
