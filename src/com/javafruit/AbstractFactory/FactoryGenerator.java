package com.javafruit.AbstractFactory;

/**
 * 
 * @author sandeep abstract method
 */
public abstract class FactoryGenerator {

	public static AbstarctDeviceFactory getFactory(FactoryType type) {
		switch (type) {
		case LaptopFactory:
			return new LaptopDeviceFactory();
		case MobileFactory:
			return new MobileDeviceFactory();
		default:
			return null;
		}
	}
}
