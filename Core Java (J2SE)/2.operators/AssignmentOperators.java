package com.chapter2.operators;

public class AssignmentOperators {
	public static void main(String[] args) {
		int a = 30;
		int b = 10;
		int c = 0;
		
		c = a + b;
		System.out.println(c);
		
		c += a;
		System.out.println(c);
		
		c -= a;
		System.out.println(c);
		
		c *= a;
		System.out.println(c);
		
		a = 20;
		c = 25;
		c /= a;
		System.out.println(c);
		
		a = 20;
		c = 25;
		c %= a;
		System.out.println(c);
	}
}
