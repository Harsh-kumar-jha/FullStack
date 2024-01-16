package com.chapter2.operators;

public class MiscOperators {
	public static void main(String[] args) {
		int a,b;
		a = 20;
		
//		1. Conditional/Ternary Operator
		b = (a == 1) ? 30 : 40;
		System.out.println("b : "+ b);
		
		b = (a == 20) ? 30 : 40;
		System.out.println("b : "+ b);
		
//		2. InstanceOf Operator
		String s = "Harsh";
		boolean t = s instanceof String;
		System.out.println("t : " + t);
		
//		3. new Operator
		MiscOperators mo = new MiscOperators(); // declaration of Object
		
//		4. dot Operator
		System.out.println(mo.toString());
	}
}
