package com.chapter3.controlFlow;

import java.util.Scanner;

public class ProgramOnSimpleIfStatement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number : ");
		int num = sc.nextInt();
		if(num % 5 == 0) {
			System.out.println("we are inside if block");
			System.out.println("Given Number " + num + " is divisible by 5");
		}
		System.out.println("we are outside of if block");
		
		sc.close();
	}
}
