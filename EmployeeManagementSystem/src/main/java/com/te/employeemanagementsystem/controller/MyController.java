package com.te.employeemanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.te.employeemanagementsystem.model.AddEmployee;
import com.te.employeemanagementsystem.model.EmployeesResponse;
import com.te.employeemanagementsystem.service.MyServices;

@RestController
@RequestMapping("/api/v1")
public class MyController {
	@Autowired
	MyServices services;
	@PostMapping("/employees")
	public ResponseEntity<EmployeesResponse> insert(@RequestBody AddEmployee emp){
		AddEmployee addData = services.addData(emp);
		EmployeesResponse employeesResponse = new EmployeesResponse();
		employeesResponse.setData(addData);
		employeesResponse.setError(false);
		return new ResponseEntity<>(employeesResponse,HttpStatus.OK);
		
		
	}
	@GetMapping("/fetch")
	public ResponseEntity<EmployeesResponse>fetch(@RequestBody  AddEmployee emp){
		Integer empId = emp.getEmpId();
		AddEmployee fetchData = services.fetchData(empId,emp);
		EmployeesResponse employeesResponse = new EmployeesResponse();
		employeesResponse.setData(fetchData);
		employeesResponse.setError(false);
		
		return new ResponseEntity<EmployeesResponse>(employeesResponse,HttpStatus.OK);
		
	}
	@DeleteMapping("/delete")
	public ResponseEntity<EmployeesResponse> delete(@RequestBody AddEmployee emp){
		Integer empId = emp.getEmpId();
		AddEmployee drop = services.drop(empId, emp);
		EmployeesResponse employeesResponse = new EmployeesResponse();
		employeesResponse.setError(false);
		return new ResponseEntity<>(employeesResponse,HttpStatus.ACCEPTED);
		
	}
	@PutMapping("/update")
	public ResponseEntity<EmployeesResponse> update(@RequestBody AddEmployee emp){
		Integer empId = emp.getEmpId();
		AddEmployee update = services.update(empId, emp);
		EmployeesResponse employeesResponse = new EmployeesResponse();
		employeesResponse.setData(update);
		employeesResponse.setError(false);
		return new ResponseEntity<>(employeesResponse,HttpStatus.OK);
		
	}

}
