package com.techno.springmvcemployeemanagement.dao;

import com.techno.springmvcemployeemanagement.entity.EmployeePrimaryInfo;

public interface EmployeeDao {
	public boolean register(EmployeePrimaryInfo employeePrimaryInfo);

	public EmployeePrimaryInfo authenticate(EmployeePrimaryInfo employeePrimaryInfo);
}
