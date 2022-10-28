package com.techno.springcore1.hybrid;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.Data;

@Data
public class Car implements Serializable {
	private String carBrand;
	private String carColor;
	@Autowired
	@Qualifier("engine1")
	private Engine engine;
}
