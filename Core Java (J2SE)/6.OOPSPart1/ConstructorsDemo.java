package com.chapter5.OOPSPart1;

public class ConstructorsDemo {
	int age;
	String name;
	public ConstructorsDemo() {
		System.out.println("Constructor is called");
	}
	public ConstructorsDemo(int a,String s) {
		age = a;
		name = s;
	}
	
	public static void main(String[] args) {
		ConstructorsDemo cd = new ConstructorsDemo();
		ConstructorsDemo user1 = new ConstructorsDemo(22,"harsh");
		System.out.println(user1.age);
		System.out.println(user1.name);
	}
}
