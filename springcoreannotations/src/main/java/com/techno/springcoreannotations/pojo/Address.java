package com.techno.springcoreannotations.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Address {
//	@Value("H.NO.296")
	private String empHno;
//	@Value("SWAMI STREET")
	private String empStreet;
//	@Value("Maharashtra")
	private String empState;
//	@Value("INDIA")
	private String empCountry;
	
	public void m2() {
		System.out.println("address method");
	}
}
