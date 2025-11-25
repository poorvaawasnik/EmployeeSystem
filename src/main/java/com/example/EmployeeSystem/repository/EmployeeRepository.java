package com.example.EmployeeSystem.repository;

import com.example.EmployeeSystem.entity.EmployeeEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer> {

    @Modifying
    @Transactional
    @Query(value = "INSERT INTO employeestable(id, name, gender, job, joindate, salary) VALUES(?1,?2,?3,?4,?5,?6)", nativeQuery = true)
    void saveCustomEmp(int id, String name, String gender, String job, LocalDate joindate, int salary);

    @Query("SELECT e FROM EmployeeEntity e ORDER BY e.name")
    List<EmployeeEntity> getEmployeeByName();

    @Query("SELECT e FROM EmployeeEntity e ORDER BY e.job")
    List<EmployeeEntity> getEmployeeByJob();
}

