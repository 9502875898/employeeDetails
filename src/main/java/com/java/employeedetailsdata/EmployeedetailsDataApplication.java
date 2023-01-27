package com.java.employeedetailsdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan
@SpringBootApplication
public class EmployeedetailsDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeedetailsDataApplication.class, args);
	}

}
