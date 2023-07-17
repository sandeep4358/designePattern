package com.javafruit.LLD.chainofresponsibilty;

public class DebugLogProcesser extends LogProcessor {

	DebugLogProcesser(LogProcessor nextLogProcessor) {
		super(nextLogProcessor);
	}

	@Override
	public void log(int LogLevel, String message) {
		if (LogLevel == DEBUG) {
			System.out.println("DEBUG: " + message);
		} else {
			super.log(LogLevel, message);
		}

	}

}
