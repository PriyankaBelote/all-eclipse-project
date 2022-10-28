package com.techno.springmvcemployeemanagement.service;

import org.springframework.stereotype.Service;

import com.techno.springmvcemployeemanagement.entity.EmployeePrimaryInfo;


@Service
public interface EmployeeService {
	public boolean register(EmployeePrimaryInfo employeePrimaryInfo);

	public EmployeePrimaryInfo authenticate(EmployeePrimaryInfo employeePrimaryInfo);

}
