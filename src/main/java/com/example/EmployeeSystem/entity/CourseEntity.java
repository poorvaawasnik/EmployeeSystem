package com.example.EmployeeSystem.entity;

import jakarta.persistence.*;

@Entity
@Table(name="courses")
public class CourseEntity {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO )
    private int id;
    private String name;
    private String fees;
    @ManyToOne
    @JoinColumn(name = "studentid")
    private StudentEntity studentEntity;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFees() {
        return fees;
    }

    public void setFees(String fees) {
        this.fees = fees;
    }

    public StudentEntity getStudentEntity() {
        return studentEntity;
    }

    public void setStudentEntity(StudentEntity studentEntity) {
        this.studentEntity = studentEntity;
    }

    public CourseEntity(String name, String fees, StudentEntity studentEntity) {
        this.name = name;
        this.fees = fees;
        this.studentEntity = studentEntity;
    }

    public CourseEntity() {
    }

    @Override
    public String toString() {
        return "CourseEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", fees='" + fees + '\'' +
                ", studentEntity=" + studentEntity +
                '}';
    }
}
