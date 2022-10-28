package com.techno.employeejson.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.techno.employeejson.exception.EmployeeNotPresentException;


@ControllerAdvice
public class EmployeeExceptionController {

	@ExceptionHandler(EmployeeNotPresentException.class)
	public String excepHandler(HttpServletRequest request , EmployeeNotPresentException employeeNotPresentException) {
		request.setAttribute("errMsg", employeeNotPresentException.getMessage());
		return "loginForm";
	}
}

