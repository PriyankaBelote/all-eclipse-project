package com.techno.springcoreannotations.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.techno.springcoreannotations.configuration.EmployeeAddressConfiguration;
import com.techno.springcoreannotations.pojo.Address;
import com.techno.springcoreannotations.pojo.Employee;

public class EmployeeAddressMain {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				EmployeeAddressConfiguration.class);
		Employee employee = applicationContext.getBean("employee1",Employee.class);
		System.out.println(employee);
		employee.m1();
		
//		Address address=applicationContext.getBean(Address.class);
//		System.out.println(address);
//		address.m2();
	}
}
