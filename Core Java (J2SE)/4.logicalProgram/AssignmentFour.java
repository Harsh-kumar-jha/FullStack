package com.chapter3.logicalProgram;

import java.util.Scanner;

public class AssignmentFour {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int fact = 1;
		for(int i = num ;i > 1 ; i-- ) {
			fact *= i;
		}
		System.out.println("Factorial is :" + fact);
		sc.close();
	}
}
