package com.techno.springcoreannotations.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

//@Component()
@Data
public class Employee {
//	@Value("priya")
	private String empName;
//	@Value("1")
	private Integer empId;
//	@Value("20")
	private Integer empAge;
	@Autowired
//	@Qualifier("address1")
	private Address address;

	public void m1() {
		System.out.println("emp method");
	}
}
