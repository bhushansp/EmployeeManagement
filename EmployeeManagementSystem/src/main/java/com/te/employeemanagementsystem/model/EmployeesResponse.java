package com.te.employeemanagementsystem.model;

import org.springframework.stereotype.Service;

@Service
public class EmployeesResponse {
	private boolean error;
	private Object data;
	public boolean isError() {
		return error;
	}
	public void setError(boolean error) {
		this.error = error;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "EmployeesResponse [error=" + error + ", data=" + data + "]";
	}
	
	

}
