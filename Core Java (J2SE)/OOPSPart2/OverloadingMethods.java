package com.chapter5.OOPSPart2;

public class OverloadingMethods {
	void sum(int a, int b) {
		System.out.println(a+b);
	}
	void sum(float a, float b) {
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		OverloadingMethods o = new OverloadingMethods();
		o.sum(10, 20);
		o.sum(10.23f, 21.31f);
	}
}
