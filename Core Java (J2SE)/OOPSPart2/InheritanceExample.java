package com.chapter5.OOPSPart2;


class Parent {
	public void p1() {
		System.out.println("Parent method");
	}
}

class Vehicle {
	String vehicleType;
}
class Car extends Vehicle {
	String modelType;
	public void showDetail() {
		vehicleType = "Car";
		modelType = "Sports";
		System.out.println(modelType + " " + vehicleType);
	}
}
public class InheritanceExample extends Parent{
	public void c1() {
		System.out.println("Child method");
	}
	public static void main(String[] args) {
		InheritanceExample cobj = new InheritanceExample();
		cobj.p1();
		cobj.c1();
		
		Car c = new Car();
		c.showDetail();
	}
}
