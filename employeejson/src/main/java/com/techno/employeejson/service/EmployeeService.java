package com.techno.employeejson.service;

import java.util.List;

import com.techno.employeejson.entity.Employee;

public interface EmployeeService {

	public boolean register(Employee employee);

	public Employee authenticate(Employee employee);

	public boolean deleteEmployee(String id);

	public List<Employee> seeDetails();

	public boolean updateEmployee(Employee employee2, Employee employee);

}