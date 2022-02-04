package com.te.springrest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.te.springrest.dao.EmployeeDao;

@Service
@Transactional
public class EmployeeServiceImpl {
	@Autowired
	EmployeeDao dao;
}
