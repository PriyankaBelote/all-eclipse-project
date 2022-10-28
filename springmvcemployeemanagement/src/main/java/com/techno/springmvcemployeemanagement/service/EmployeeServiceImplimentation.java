package com.techno.springmvcemployeemanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techno.springmvcemployeemanagement.dao.EmployeeDao;
import com.techno.springmvcemployeemanagement.entity.EmployeePrimaryInfo;

@Service
public class EmployeeServiceImplimentation implements EmployeeService {

	@Autowired
	private EmployeeDao dao;

	@Override
	public boolean register(EmployeePrimaryInfo employeePrimaryInfo) {
		if (employeePrimaryInfo.getEmpId().startsWith("TYC")) {
			return dao.register(employeePrimaryInfo);

		}
		return false;
	}

	@Override
	public EmployeePrimaryInfo authenticate(EmployeePrimaryInfo employeePrimaryInfo) {
		if (employeePrimaryInfo.getEmpId().startsWith("TYC")) {
			return dao.authenticate(employeePrimaryInfo);

		}
		return null;
	}

}
