package com.example.EmployeeSystem.repository;

import com.example.EmployeeSystem.entity.CourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<CourseEntity, Integer> {
}
