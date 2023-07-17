package com.javafruit.AbstractFactory;

public class MobileDeviceFactory implements AbstarctDeviceFactory {
	@Override
	public Device getGadget(DeviceType type) {
		switch (type) {
		case OnePlus:
			return new OnePlus();
		case Iphone:
			return new Iphone();

		default:
			return null;
		}

	}

}
