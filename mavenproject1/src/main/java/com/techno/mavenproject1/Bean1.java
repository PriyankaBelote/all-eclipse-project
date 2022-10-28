package com.techno.mavenproject1;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.NonNull;
//@Data
//@Getter
//@Setter
//@NoArgsConstructor
@AllArgsConstructor
@NonNull
public class Bean1 implements Serializable {
	
	private String name;
	private int age;

}
