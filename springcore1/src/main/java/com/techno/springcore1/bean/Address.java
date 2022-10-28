package com.techno.springcore1.bean;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
@AllArgsConstructor
@ToString
@Data
public class Address implements Serializable {
	private String addressHno;
	private String addressStreetName;

	public void addressMethod() {
		System.out.println("address class method");
	}
}
