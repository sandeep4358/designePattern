package com.javafruit.LLD.chainofresponsibilty;

public class InfoLogProcesser extends LogProcessor {

	InfoLogProcesser(LogProcessor nextLogProcessor) {
		super(nextLogProcessor);
	}

	@Override
	public void log(int LogLevel, String message) {
		if (LogLevel == INFO) {
			System.out.println("INFO: " + message);
		} else {
			super.log(LogLevel, message);
		}

	}

}
