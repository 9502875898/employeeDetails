package com.java.employeedetailsdata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.employeedetailsdata.dto.EmployeeDto;
import com.java.employeedetailsdata.entity.Employee;
import com.java.employeedetailsdata.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EployeeController {
	@Autowired
	public EmployeeService employeeService;
	@PostMapping("/save")
	public Employee save(@RequestBody EmployeeDto employeeDto) {
		return employeeService.save(employeeDto);
		
	}

}
