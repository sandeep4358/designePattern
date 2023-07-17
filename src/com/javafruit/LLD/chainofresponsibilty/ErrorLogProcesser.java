package com.javafruit.LLD.chainofresponsibilty;

public class ErrorLogProcesser extends LogProcessor {

	ErrorLogProcesser(LogProcessor nextLogProcessor) {
		super(nextLogProcessor);
	}

	@Override
	public void log(int LogLevel, String message) {
		if (LogLevel == ERROR) {
			System.out.println("ERROR: " + message);
		} else {
			super.log(LogLevel, message);
		}

	}

}
