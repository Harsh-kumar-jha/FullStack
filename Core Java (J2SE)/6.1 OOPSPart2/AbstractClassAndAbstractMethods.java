package com.chapter5.OOPSPart2;

abstract class Vehicle1 {
	public abstract void engine();
}

class Car1 extends Vehicle1{
	@Override
	public void engine() {
		System.out.println("Car Engine");		
	}
}

public class AbstractClassAndAbstractMethods {
	public static void main(String[] args) {
		Vehicle1 v = new Car1();
		v.engine();
	}
}
