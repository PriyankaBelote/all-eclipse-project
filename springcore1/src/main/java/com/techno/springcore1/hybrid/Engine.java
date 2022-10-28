package com.techno.springcore1.hybrid;

import java.io.Serializable;

import lombok.Data;

@Data
public class Engine implements Serializable {
	private String engineCc;
	private String engineType;

}
