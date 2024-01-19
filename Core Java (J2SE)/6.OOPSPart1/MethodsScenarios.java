package com.chapter5.OOPSPart1;

import java.util.Arrays;

public class MethodsScenarios {
	
//	scenario 1 : method without parameters and without return type
	void add() {
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println(c);
	}
	
//	scenario 2 : method with parameters and without return type
	void add(int a, int b) {
		int c = a+b;
		System.out.println(c);
	}
	
//	scenario 3 : method without parameters and with return type
	int sub() {
		int a = 20;
		int b = 10;
		int c = a-b;
		return c;
	}
	
//	scenario 4 : method with parameters and with return type
	int mul(int a, int b) {
		return a*b;
	}
	
//	Method with string return type and string parameters
	String print(String fname , String lname) {
		String name = fname + lname;
		return name;
	}
	
//	Method with array as parameter and without return type
	void print1(int[] arr) {
		System.out.println(Arrays.toString(arr));
	}
	
//	method with int as parameter and boolean as return type
	boolean check(int age) {
		if(age >= 18) {
			return true;
		}else {
			return false;
		}
	}
	
//	method with object as parameter and without return type
	void print(AboutInstanceVaribles m) {
		System.out.println(m.age);
	}
	
//	method with object as return type and without parameter
	AboutInstanceVaribles getage() {
		AboutInstanceVaribles a = new AboutInstanceVaribles();
		a.age = 112;
		return a;
	}
	
	public static void main(String[] args) {
		MethodsScenarios m1 = new MethodsScenarios();
		m1.add(); // method invocation
		m1.add(10,20);
		
		int subVal = m1.sub();
		System.out.println(subVal);
		
		int mulVal = m1.mul(10, 20);
		System.out.println(mulVal);
		
		String s = m1.print("Harsh ","Kumar Jha");
		System.out.println(s);
		
		int[] arr = {1,2,3,4,5};
		m1.print1(arr);
		
		boolean isVoter = m1.check(28);
		System.out.println(isVoter);
		
		AboutInstanceVaribles a = new AboutInstanceVaribles();
		a.age = 10;
		m1.print(a);
		
		AboutInstanceVaribles x = m1.getage();
		System.out.println(x.age);
	}
}
