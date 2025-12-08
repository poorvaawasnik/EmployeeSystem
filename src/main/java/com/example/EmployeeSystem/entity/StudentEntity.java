package com.example.EmployeeSystem.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name="student")
@NoArgsConstructor
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;
    private String name;
    private String branch;
    private String city;

    @ManyToMany
    @JoinTable(name = "student_courses_table", joinColumns = @JoinColumn(name = "student_id"), inverseJoinColumns = @JoinColumn(name = "course_id"))

    private List<CourseEntity> courseList;

    public StudentEntity(String name, String branch, String city) {
        this.name = name;
        this.branch = branch;
        this.city = city;
       
    }


    @Override
    public String toString() {
        return "StudentEntity{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", branch='" + branch + '\'' +
                ", city='" + city + '\'' +
                
                '}';
    }



}

