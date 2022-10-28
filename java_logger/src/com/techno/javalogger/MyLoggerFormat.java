package com.techno.javalogger;

import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class MyLoggerFormat extends Formatter { 

	@Override
	public String format(LogRecord record) {
		return record.getMillis()+" :: "+record.getLoggerName()+" :: "+record.getClass()+" :: "+record.getSourceMethodName()+" :: \n"+record.getMessage();
	}

}
