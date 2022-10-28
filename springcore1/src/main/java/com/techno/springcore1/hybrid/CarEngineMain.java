package com.techno.springcore1.hybrid;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarEngineMain {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("hybrid.xml");
		Car car = applicationContext.getBean(Car.class);
		System.out.println(car);
	}
}
