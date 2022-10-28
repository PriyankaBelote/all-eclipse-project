package com.techno.springcoreannotations.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.techno.springcoreannotations.pojo.Address;
import com.techno.springcoreannotations.pojo.Employee;

@Configuration
@ComponentScan(basePackages = "com.techno.springcoreannotations")
public class EmployeeAddressConfiguration {
	@Bean
	
	public Employee employee1() {
		Employee employee = new Employee();
		employee.setEmpId(2);
		employee.setEmpName("kiran");
		employee.setEmpAge(24);
		return employee;
	}

	@Bean
	
	public Address address1() {
		Address address = new Address();
		address.setEmpHno("12/A");
		address.setEmpStreet("new street");
		address.setEmpState("Maharashtra");
		address.setEmpCountry("INDIA");
		return address;
	}

	@Bean
	@Primary
	public Address address2() {
		Address address = new Address();
		address.setEmpHno("1222/A");
		address.setEmpStreet("new OLD street");
		address.setEmpState("Maharashtra");
		address.setEmpCountry("INDIA");
		return address;
	}

}
