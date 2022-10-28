package com.techno.springcore1.bean;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Data
public class Employee implements Serializable {
	private Integer empId;
	private String empName;
	private Address address;

	public void empMethod() {
		System.out.println("employee class method");
	}
}
