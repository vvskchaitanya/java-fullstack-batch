package com.triveni.fullstack.employees.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.triveni.fullstack.employees.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

    public List<Employee> findByDepartment(String department);

}
