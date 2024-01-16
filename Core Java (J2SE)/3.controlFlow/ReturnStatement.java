package com.chapter3.controlFlow;

public class ReturnStatement {
	public static void main(String[] args) {
		System.out.println("Hi");
		if(10 > 2) {
			return;
		}
		System.out.println("Bye !!"); // dead code
	}
}
