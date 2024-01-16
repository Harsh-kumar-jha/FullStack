package com.chapter1.basic;

import java.util.Scanner;

public class SumOfTwoNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter both numbers : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int sum = num1 + num2;
		System.out.println("Sum : " + sum);
		sc.close();
	}
}
