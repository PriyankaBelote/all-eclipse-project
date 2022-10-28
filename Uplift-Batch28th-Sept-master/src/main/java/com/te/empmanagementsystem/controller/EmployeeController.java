package com.te.empmanagementsystem.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

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
	public String authenticate(Employee employee, ModelMap map, HttpServletRequest request) {
		if (employee != null && (!employee.getEmpId().isEmpty() || !employee.getPassword().isEmpty())) {
			Employee employee2 = service.authenticate(employee);
			if (employee2 != null) {
				HttpSession session = request.getSession();
				session.setAttribute("loggedIn", employee2);
//				session.setMaxInactiveInterval(2);
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

	@GetMapping("/delete")
	public String getDeleteForm(ModelMap map,
			@SessionAttribute(name = "loggedIn", required = false) Employee employee) {
		if (employee != null) {
			map.addAttribute("empId", employee.getEmpId());
			return "deleteForm";
		}
		map.addAttribute("errMsg", "Please login first");
		return "loginForm";
	}

	@PostMapping("/delete")
	public String deleteEmployee(ModelMap map,
			@SessionAttribute(name = "loggedIn", required = false) Employee employee) {
		if (employee != null) {
			service.deleteEmployee(employee.getEmpId());
			map.addAttribute("errMsg", "Account deleted!");
			return "registrationForm";
		}
		map.addAttribute("errMsg", "Please login first");
		return "loginForm";
	}

	@GetMapping("/logout")
	public String logout(ModelMap map, HttpSession session) {
		session.invalidate();
		map.addAttribute("errMsg", "Logged out successfully!");
		return "loginForm";
	}

	@GetMapping("/update")
	public String update(ModelMap map, @SessionAttribute(name = "loggedIn", required = false) Employee employee) {
		
			map.addAttribute("empEmpId", employee.getEmpId());
//			map.addAttribute("empEmpName", employee.getEmpName());
////			map.addAttribute("empEmpPassword", employee.getPassword());
//			map.addAttribute("empEmpEmailId", employee.getEmailId());
			return "update";
		
	
	}

	@PostMapping("/update1")
	public String update1(ModelMap map, @SessionAttribute(name = "loggedIn", required = false) Employee employee,
			Employee employee2) {
		if (employee2 != null) {
			if (service.updateEmployee(employee2, employee)) {
				map.addAttribute("errMsg", "Account updated!");
				return "update";
			}
		}
		return "loginForm";
	}

//	@GetMapping("/seeDetails")
//	public String seeDetails1(ModelMap map) {
//		return "seeEmployee";
//
//	}

	@GetMapping("/seeDetails")
	public String seeDetails(ModelMap map) {
		List<Employee> employee2 = service.seeDetails();
		map.addAttribute("list", employee2);
		return "seeEmployee";

	}
	@GetMapping("/seeOne")
	public String name(@SessionAttribute(name = "loggedIn" , required = false)Employee employee,ModelMap map) {
		map.addAttribute("name",employee);
		return "seeOne";
	}
}
