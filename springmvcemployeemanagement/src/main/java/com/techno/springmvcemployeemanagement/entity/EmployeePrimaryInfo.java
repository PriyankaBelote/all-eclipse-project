package com.techno.springmvcemployeemanagement.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "Employee_Registration")
public class EmployeePrimaryInfo {
	@Id
	@Column(name = "emp_Id")
	private String empId;
	private String empName;
	private String empEmail;
	private String empPassword;
}
