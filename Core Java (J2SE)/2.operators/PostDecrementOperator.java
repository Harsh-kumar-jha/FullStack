package com.chapter2.operators;

public class PostDecrementOperator {
	public static void main(String[] args) {
		int a = 5;
		int b = 7;
		int c = a-- + b;
		// here 'a' will not decremented immediately, a-- will still return 5
		System.out.println("c : " + c);
		System.out.println("a : " + a);
		System.out.println("b : "+ b);
	}
}
