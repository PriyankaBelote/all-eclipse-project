package com.techno.employeemanagement;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class EmployeePrimaryInfo implements Serializable {
	@Id
	private Integer empId;
	private Integer empAge;
	private String empName;
	private String empDesignation;
	private String empBloodGroup;
	private String empEmailId;
	private String empDOB;
	private String empMaritalStatus;
	private String empGender;
	private Integer empDeptNo;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "employeePrimaryInfo")
	private List<EmployeeAddressInfo> addressInfo;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "employeePrimaryInfo")
	private List<EmployeeEducationalInfo> educationalInfo;

}
