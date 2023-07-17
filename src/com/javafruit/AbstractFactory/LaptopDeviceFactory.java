package com.javafruit.AbstractFactory;

public class LaptopDeviceFactory implements AbstarctDeviceFactory {

	@Override
	public Device getGadget(DeviceType type) {
		switch (type) {
		case HP:
			return new HP();
		case Mac:
			return new Mac();

		default:
			return null;
		}

	}
}
