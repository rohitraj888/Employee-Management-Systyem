package com.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.entity.Employee;

public interface EmpRepositroy extends JpaRepository<Employee,Integer>{

}
