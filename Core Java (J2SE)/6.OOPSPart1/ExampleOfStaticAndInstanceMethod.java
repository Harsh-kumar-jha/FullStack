package com.chapter5.OOPSPart1;

public class ExampleOfStaticAndInstanceMethod {
//	Instance Method
	void sayHello() {
		System.out.println("Hello My Friend...");
	}
	
//	Static Method 
	static void greet() {
		System.out.println("Good Morning...");
	}
	
	public static void main(String[] args) {
		ExampleOfStaticAndInstanceMethod d = new ExampleOfStaticAndInstanceMethod();
		d.sayHello();
		ExampleOfStaticAndInstanceMethod.greet();
		greet();
	}
}
