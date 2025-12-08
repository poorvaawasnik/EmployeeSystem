package com.example.EmployeeSystem.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@Entity
@Table(name="courses")
public class CourseEntity {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO )
    private int id;
    private String name;
    private String fees;
    @ManyToMany
    private List<StudentEntity> studentEntityList;

    public CourseEntity(){
    }
    public CourseEntity(String name, String fees){
        this.name = name;
        this.fees = fees;
    }

    public void setStudentEntity(StudentEntity studentEntity) {
    }
}