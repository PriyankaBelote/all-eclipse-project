package com.techno.employeemanagement;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class EmployeeAddressInfo implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer empAddressId;
	private String empAddressType;
	private String empHno;
	private String empStreetName;
	private String empLocalityName;
	private String empDistrictName;
	private String empStateName;
	private String empCountry;
	private Integer empPincode;
	@ManyToOne(cascade = CascadeType.ALL)
	private EmployeePrimaryInfo employeePrimaryInfo;

}
