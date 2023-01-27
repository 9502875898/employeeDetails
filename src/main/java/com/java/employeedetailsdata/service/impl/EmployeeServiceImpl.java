package com.java.employeedetailsdata.service.impl;



import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.employeedetailsdata.dto.EmployeeDto;
import com.java.employeedetailsdata.entity.Employee;
import com.java.employeedetailsdata.repo.EmployeeRepogitory;
import com.java.employeedetailsdata.service.EmployeeService;

import antlr.collections.List;

@Service

public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	public EmployeeRepogitory employeeRepogitory;

	@Override
	public Employee save(EmployeeDto employeeDto) {
		
		Employee employee = new Employee();
		employee.setName(employeeDto.getName());
		employee.setAge(employeeDto.getAge());
		employee.setAddress(employeeDto.getAddress());
		employee.setPhoneNumber(employeeDto.getPhoneNumber());
		
				return employee;

	}

}
