package com.techno.mavenproject1;

import org.apache.log4j.LogManager;// always import from org.apache.log4j.logmanager
import org.apache.log4j.Logger;

public class App {
	private static final Logger LOGGER = LogManager.getLogger(App.class);

	public static void main(String[] args) {
		LOGGER.info("info");
	}
}
