package com.techno.javalogger;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LoggerDemo {
private static final Logger LOGGER=Logger.getLogger(LoggerDemo.class.getName());
public static void main(String[] args) {
	ConsoleHandler consoleHandler=new ConsoleHandler();
	consoleHandler.setLevel(Level.ALL);
	
//	SimpleFormatter formatter=new SimpleFormatter();
//	consoleHandler.setFormatter(formatter);
	
	MyLoggerFormat myLoggerFormat=new MyLoggerFormat();
	consoleHandler.setFormatter(myLoggerFormat);
	
	LOGGER.addHandler(consoleHandler);
	LOGGER.setLevel(Level.ALL);
	LOGGER.severe("severe");
	LOGGER.warning("warning");
	LOGGER.info("info");
	LOGGER.config("config");
	LOGGER.fine("fine");
	LOGGER.finer("finer");
	LOGGER.finest("finest");
}
}
