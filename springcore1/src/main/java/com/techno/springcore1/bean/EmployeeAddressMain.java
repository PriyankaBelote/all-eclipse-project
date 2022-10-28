package com.techno.springcore1.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeAddressMain {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("bean.xml");
		Employee employee = (Employee) applicationContext.getBean("employee");
		employee.empMethod();
		System.out.println(employee.getEmpId());
		System.out.println(employee.getEmpName());
		System.out.println(employee);
		
//		Address address = (Address) applicationContext.getBean("address");
//		address.addressMethod();
		
	}
}
