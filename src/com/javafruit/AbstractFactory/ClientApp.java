package com.javafruit.AbstractFactory;

public class ClientApp {
	public static void main(String args[]) {

		FactoryGenerator.getFactory(FactoryType.MobileFactory).getGadget(DeviceType.Iphone).printDeviceInfo();
		//System.out.println(gadget);
	}
}
