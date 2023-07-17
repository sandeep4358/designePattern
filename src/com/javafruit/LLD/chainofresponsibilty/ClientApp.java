package com.javafruit.LLD.chainofresponsibilty;

public class ClientApp {
	public static void main(String[] args) {
		InfoLogProcesser logObject = new InfoLogProcesser(new DebugLogProcesser(new ErrorLogProcesser(null)));
		logObject.log(LogProcessor.ERROR, "exception happend");
		logObject.log(LogProcessor.DEBUG, "need to debug this");
		logObject.log(LogProcessor.INFO, "just for info");
	}
}
