package com.chapter5.OOPSPart2;

class SuperClass {
	String name;
	
	public SuperClass(String n) {
		name = n;
	}
	void details() {
		System.out.println(name.toUpperCase());
	}
}

class subClass extends SuperClass{
	String name;
	public subClass(String n1 , String n2) {
		super(n1);
		this.name = n2;
	}
	public void details() {
//		super.name = "Parent";
//		this.name = "Child";
		System.out.println(super.name +" and "+ name);
//		super.details();
	}
}

public class SuperKeyWord {
	public static void main(String[] args) {
		subClass child = new subClass("Harsh","Ajay");
		child.details();
		
	}
}
