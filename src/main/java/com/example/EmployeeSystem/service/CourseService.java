package com.example.EmployeeSystem.service;


import com.example.EmployeeSystem.entity.CourseEntity;
import com.example.EmployeeSystem.repository.CourseRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

    @Autowired
    CourseRepository courseRepository;

    public void saveCourse(CourseEntity courseEntity){
        courseRepository.save(courseEntity);
    }

}
