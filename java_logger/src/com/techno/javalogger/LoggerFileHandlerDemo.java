package com.techno.javalogger;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LoggerFileHandlerDemo {
	private static final Logger LOGGER=Logger.getLogger(LoggerFileHandlerDemo.class.getName());
	public static void main(String[] args) throws SecurityException, IOException {
		FileHandler fileHandler =new FileHandler("C:\\Users\\91963\\OneDrive\\Desktop\\logger_files\\firstlogger.txt");
		fileHandler.setLevel(Level.ALL);
		
		SimpleFormatter formatter=new SimpleFormatter();
		fileHandler.setFormatter(formatter);
		
//		MyLoggerFormat myLoggerFormat=new MyLoggerFormat();
//		fileHandler.setFormatter(myLoggerFormat);
		
		LOGGER.addHandler(fileHandler);
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
