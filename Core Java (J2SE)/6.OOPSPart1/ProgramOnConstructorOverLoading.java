package com.chapter5.OOPSPart1;

public class ProgramOnConstructorOverLoading {
	int age;
	String name;
	
	public ProgramOnConstructorOverLoading(int a,String n) {
		age = a;
		name = n;
	}
	public ProgramOnConstructorOverLoading(String n) {
		name = n;
	}
	public static void main(String[] args) {
		ProgramOnConstructorOverLoading user1 = new ProgramOnConstructorOverLoading(22,"Harsh");
		System.out.println("Age : "+ user1.age);
		System.out.println("Name : "+ user1.name);
		
		ProgramOnConstructorOverLoading user2 = new ProgramOnConstructorOverLoading("Ajay");
		System.out.println("Age : "+ user2.age);
		System.out.println("Name : "+ user2.name);
		
		
	}
}
