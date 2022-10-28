package com.techno.employeemanagement;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class EmployeeEducationalInfo implements Serializable {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Integer eduId;
	
	private String qualificationType;
	
//	@Column(name = "University/Board")
	private String university;
	
//	@Column(name = "Percentage(%)")
	private Integer percentage;
	private Integer yearOfPassing;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private EmployeePrimaryInfo employeePrimaryInfo;
}
