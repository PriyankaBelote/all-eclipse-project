package com.techno.springmvcemployeemanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.techno.springmvcemployeemanagement.entity.EmployeePrimaryInfo;
import com.techno.springmvcemployeemanagement.service.EmployeeService;

@Controller
public class EmployeeManagementController {
	@Autowired
	private EmployeeService service;

	@GetMapping("/register")
	public String getRegistration() {
		return "registrationForm";

	}

	@GetMapping("/login")
	public String getLogin() {
		return "loginForm";

	}

	@PostMapping("/register")
	public String register(EmployeePrimaryInfo employeePrimaryInfo, ModelMap map) {
		if (employeePrimaryInfo != null) {
			if (service.register(employeePrimaryInfo)) {
				map.addAttribute("msg", "Registration Successful!");
			} else {
				map.addAttribute("errMsg", "Something wrong");
			}
		}
		return "registrationForm";
	}

	@PostMapping("/login")
	public String authenticate(EmployeePrimaryInfo employeePrimaryInfo, ModelMap map) {
		EmployeePrimaryInfo employee2 = service.authenticate(employeePrimaryInfo);
		if (employee2 != null) {
			map.addAttribute("name", employee2.getEmpName());
			return "welcome";
		} else {
			map.addAttribute("errMsg", "Incorrect credentials");
			return "loginForm";
		}
	}

}
