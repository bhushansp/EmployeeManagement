package com.te.employeemanagementsystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.te.employeemanagementsystem.model.AddEmployee;

public interface DaoInt extends JpaRepository<AddEmployee, Integer>{

}
