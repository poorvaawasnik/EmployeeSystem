package com.example.EmployeeSystem.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="employees")
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "emp_seq")
    @SequenceGenerator(name = "emp_seq", sequenceName = "emp_sequence", initialValue = 1000,allocationSize = 1)
    private int id;
    @Column(name="name",length = 255)
    private String name;
    @Column(name="gender",length = 255)
    private String gender;
    @Column(name="job",length = 255)
    private String job;
    @Column(name="joindate")
    private LocalDate joindate;
    @Column(name="salary")
    private int salary;


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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public LocalDate getJoindate() {
        return joindate;
    }

    public void setJoindate(LocalDate joindate) {
        this.joindate = joindate;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public EmployeeEntity() {
    }

    public EmployeeEntity(int id, String name, String gender, String job, LocalDate joindate, int salary) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.job = job;
        this.joindate = joindate;
        this.salary = salary;
    }
}
