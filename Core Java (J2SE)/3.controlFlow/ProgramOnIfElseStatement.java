package com.chapter3.controlFlow;

import java.util.Scanner;

public class ProgramOnIfElseStatement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number");
		int num = sc.nextInt();
		if(num % 2 == 0) {
			System.out.println("We are inside if block");
			System.out.println("Given number " + num + " is even");
		} else {
			System.out.println("We are inside else block");
			System.out.println("Given number " + num + " is odd");
		}
		System.out.println("We are outside if-else block");
		sc.close();
	}
}
