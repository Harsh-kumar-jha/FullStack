package com.chapter5.OOPSPart2;



public class VaraibleArguments {
//	before introduction of var args
	public int sum(int a) {
		return a;
	}
	public int sum(int a,int b) {
		return a+b;
	}
	public int sum(int a, int b,int c) {
		return a+b+c;
	}
	public int sum(int a, int b,int c,int d) {
		return a+b+c+d;
	}
	public int sum(int a, int b,int c, int d, int e) {
		return a+b+c+d+e;
	}
	
//	after introduction of var agrs
	public int mult(int... a) {
		int total = 1;
		for(int i = 0;i<a.length;i++) {
			total= total * a[i];
		}
		return total;
	}
	public static void main(String[] args) {
		VaraibleArguments v = new VaraibleArguments();
		System.out.println(v.sum(10));
		System.out.println(v.sum(10,20));
		System.out.println(v.sum(10,20,30));
		System.out.println(v.sum(10,20,30,40));
		System.out.println(v.sum(10,20,30,40,50));
		
		System.out.println(v.mult(10));
		System.out.println(v.mult(10,20));
		System.out.println(v.mult(10,20,30));
		System.out.println(v.mult(10,20,30,40));
		System.out.println(v.mult(10,20,30,40,50));
		System.out.println(v.mult(10,20,30,40,50,60));
	}
}
