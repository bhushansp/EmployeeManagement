package com.te.springrest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.te.springrest.service.EmployeeServiceImpl;

@RestController
@RequestMapping("/employee/")
public class EmployeeController {
	@Autowired
	EmployeeServiceImpl serviceImpl;
}
