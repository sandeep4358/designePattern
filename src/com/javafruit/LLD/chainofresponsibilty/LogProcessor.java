package com.javafruit.LLD.chainofresponsibilty;

public abstract class LogProcessor {

	public static int INFO = 1;
	public static int DEBUG = 2;
	public static int ERROR = 3;

	LogProcessor nextLogProcessor;

	public LogProcessor() {
		// TODO Auto-generated constructor stub
	}

	LogProcessor(LogProcessor nextLogProcessor) {
		this.nextLogProcessor = nextLogProcessor;
	}

	public void log(int LogLevel, String message) {
		if (nextLogProcessor != null)
			nextLogProcessor.log(LogLevel, message);
	};
}
