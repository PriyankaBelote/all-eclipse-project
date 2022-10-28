package com.techno.employeejson.dao;

import java.util.List;

import com.techno.employeejson.entity.Employee;


public interface EmployeeDao {

	public boolean register(Employee employee);

	public Employee authenticate(Employee employee);

	public boolean deleteEmployee(String id);

	public boolean updateEmployee(Employee employee, Employee employee2);

	public List<Employee> seeDetails();

}
