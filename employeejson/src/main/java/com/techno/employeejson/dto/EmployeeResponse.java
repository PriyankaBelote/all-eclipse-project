package com.techno.employeejson.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EmployeeResponse {
	private String msg;
	private String statusCode;
	private String desc;
	private Object object;
}
