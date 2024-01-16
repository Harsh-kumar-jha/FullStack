package com.chapter3.controlFlow;

import java.util.Scanner;

public class AssignmentOnCheckDivisiblyByFive {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		if(x % 5 == 0) System.out.println("Given number is divisible by 5");
		else System.err.println("Given number is not divisible by 5");
		sc.close();
	}
}
