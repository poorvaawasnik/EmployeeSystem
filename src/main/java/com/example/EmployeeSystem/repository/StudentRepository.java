package com.example.EmployeeSystem.repository;

import com.example.EmployeeSystem.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository  extends JpaRepository<StudentEntity , Integer> {


}
