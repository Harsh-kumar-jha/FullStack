package com.chapter3.controlFlow;

import java.util.Scanner;

public class ProgramOnNestedIfStatement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number : ");
		int num = sc.nextInt();
		if(num < 100) {
			System.out.println("Given number is less than 100");
			if(num % 2 == 0) System.out.println("and it is even");
			else System.out.println("and it is odd");
		}else {
			System.out.println("Given number is greater than 100");
		}
		System.out.println("We are outside of nested if-else block");
		sc.close();
	}
}
