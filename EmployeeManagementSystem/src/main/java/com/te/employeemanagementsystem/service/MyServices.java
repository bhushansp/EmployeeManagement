package com.te.employeemanagementsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.employeemanagementsystem.dao.DaoInt;
import com.te.employeemanagementsystem.model.AddEmployee;
import com.te.employeemanagementsystem.model.EmployeesResponse;

@Service
public class MyServices implements ServiceInt {
	@Autowired
	EmployeesResponse res;
	@Autowired
	DaoInt dao;

	@Override
	public AddEmployee addData(AddEmployee emp) {
		if (emp != null) {
			AddEmployee save = dao.save(emp);
			return save;
		}
		return emp;

	}

	@Override
	public AddEmployee fetchData(Integer empId, AddEmployee emp) {
		if (empId == null) {
			res.setError(false);
		}

		AddEmployee findAddEmployeeById = dao.findByEmpId(empId);
		return findAddEmployeeById;
	}

	@Override
	public AddEmployee drop(Integer empId, AddEmployee emp) {
		if (empId != null) {
			dao.deleteById(empId);
		}
		return null;
	}

	@Override
	public AddEmployee update(Integer empId, AddEmployee emp) {
		if (empId != null) {
			AddEmployee findByEmpId = dao.findByEmpId(empId);
			findByEmpId.setFullName(emp.getFullName());
			findByEmpId.setDesignation(emp.getDesignation());
			findByEmpId.setSalary(emp.getSalary());
			findByEmpId.setAge(emp.getAge());

			return dao.save(findByEmpId);
		}
		return null;
	}

}
