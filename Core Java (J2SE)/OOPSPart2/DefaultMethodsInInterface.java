package com.chapter5.OOPSPart2;

interface Vehicle12 {
	void cleanVehicle();
	default void startVehicle() {
		System.out.println("Vehicle is starting....");
	}
	static void speedUp() {
		System.out.println("Vehicle speed is up...");
	}
}

class Bus implements Vehicle12{
	@Override
	public void cleanVehicle() {
		System.out.println("Cleaning the bus");
	}
}

public class DefaultMethodsInInterface {
	public static void main(String[] args) {
		Bus b = new Bus();
		b.cleanVehicle();
		b.startVehicle();
		Vehicle12.speedUp();
	}
}
