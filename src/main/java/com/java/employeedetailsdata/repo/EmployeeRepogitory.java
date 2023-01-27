package com.java.employeedetailsdata.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.employeedetailsdata.entity.Employee;
@Repository

public interface EmployeeRepogitory extends JpaRepository<Employee,Long> {

}
