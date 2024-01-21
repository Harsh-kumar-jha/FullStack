package com.chapter5.OOPSPart2;

public final class FinalKeyword {
	final int a = 10; 
//	a = 20; invalid
//	final int c; invalid
	final void m1() {
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		FinalKeyword f = new FinalKeyword();
		f.m1();
	}
}

//class demo extend FinalKeyword{} invalid