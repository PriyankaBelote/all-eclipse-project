package com.te.empmanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.empmanagementsystem.dao.EmployeeDao;
import com.te.empmanagementsystem.entity.Employee;
import com.te.empmanagementsystem.exception.EmployeeNotPresentException;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao dao;

	@Override
	public boolean register(Employee employee) {
		if (employee.getEmpId().startsWith("TYC")) {
			return dao.register(employee);

		}
		return false;
	}

	@Override
	public Employee authenticate(Employee employee) {
		if (employee.getEmpId().startsWith("TYC")) {
			return dao.authenticate(employee);

		}
		throw new EmployeeNotPresentException("Your employee Id should start with TYC!");
	}

	@Override
	public boolean deleteEmployee(String id) {
		return dao.deleteEmployee(id);

	}

	@Override
	public List<Employee> seeDetails() {

		List<Employee> seeDetails = dao.seeDetails();
		System.out.println("----------->" + "service" + seeDetails);
		return seeDetails;
	}

	@Override
	public boolean updateEmployee(Employee employee2, Employee employee) {
		return dao.updateEmployee(employee2, employee);
	}
}
