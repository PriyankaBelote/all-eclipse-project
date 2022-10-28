package com.techno.mavenproject2hibernatedummy;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "Employee_Details")

public class Employee implements Serializable {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	@Column(name = "Emp_Id")
	private int empId;
	@Column(name = "Emp_Name")
	private String empName;
}
