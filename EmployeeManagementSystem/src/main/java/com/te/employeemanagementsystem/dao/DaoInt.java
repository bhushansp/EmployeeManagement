package com.te.employeemanagementsystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.te.employeemanagementsystem.model.AddEmployee;
@Repository
public interface DaoInt extends JpaRepository<AddEmployee, Integer>{
	public AddEmployee findByEmpId(Integer empId);

}
