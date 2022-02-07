package com.te.employeemanagementsystem.service;

import com.te.employeemanagementsystem.model.AddEmployee;

public interface ServiceInt {
	public AddEmployee addData(AddEmployee emp);
	public AddEmployee fetchData(Integer empId,AddEmployee emp);
	public AddEmployee drop(Integer empId,AddEmployee emp);
	public AddEmployee update(Integer empId,AddEmployee emp);

}
