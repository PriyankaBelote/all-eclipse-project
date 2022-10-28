package com.te.empmanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.te.empmanagementsystem.entity.Employee;
import com.te.empmanagementsystem.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@GetMapping("/register")
	public String getRegistrationForm() {
		return "registrationForm";
	}

	@GetMapping("/login")
	public String getLoginForm() {
		return "loginForm";
	}

	@PostMapping("/register")
	public String register(Employee employee, ModelMap map) {
		if (employee != null) {
			if (service.register(employee)) {
				map.addAttribute("msg", "Registration Successful!");
			} else {
				map.addAttribute("errMsg", "Something went wrong");
			}
		}
		return "registrationForm";
	}

	@PostMapping("/login")
	public String authenticate(Employee employee, ModelMap map) {
		if (employee != null && (!employee.getEmpId().isBlank() || !employee.getPassword().isBlank())) {
			Employee employee2 = service.authenticate(employee);
			if (employee2 != null) {
				map.addAttribute("name", employee2.getEmpName());
				return "welcome";
			} else {
				map.addAttribute("errMsg", "Invalid credentials");
			}
		} else {
			map.addAttribute("errMsg", "Please enter something!");
		}
		return "loginForm";
	}

}
