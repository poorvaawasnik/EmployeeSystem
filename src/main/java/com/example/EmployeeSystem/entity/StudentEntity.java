package com.example.EmployeeSystem.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="student")
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;
    private String name;
    private String branch;
    private String city;
    @OneToMany( cascade = CascadeType.ALL)
    private List<CourseEntity> coursesList;

    public StudentEntity(String name, String branch, String city, List<CourseEntity> coursesList) {
        this.name = name;
        this.branch = branch;
        this.city = city;
        this.coursesList = coursesList;
    }

    public StudentEntity() {
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<CourseEntity> getCoursesList() {
        return coursesList;
    }

    public void setCoursesList(List<CourseEntity> coursesList) {
        this.coursesList = coursesList;
    }

    @Override
    public String toString() {
        return "StudentEntity{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", branch='" + branch + '\'' +
                ", city='" + city + '\'' +
                ", coursesList=" + coursesList +
                '}';
    }
}

