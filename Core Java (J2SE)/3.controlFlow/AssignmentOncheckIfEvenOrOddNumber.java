package com.chapter3.controlFlow;

import java.util.Scanner;

public class AssignmentOncheckIfEvenOrOddNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number");
		int x = sc.nextInt();
		if(x % 2 == 0) {
			System.out.println("Given number is even");
		}else {
			System.out.println("Given number is odd");
		}
		sc.close();
	}
}
