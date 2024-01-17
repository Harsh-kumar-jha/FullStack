package com.chapter3.logicalProgram;

import java.util.Scanner;

public class AssignmentThree {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		long sal = sc.nextLong();
		
		if(age < 30 && sal > 1000000) {
			System.out.println("Eligible for Marriage...");
		}
		sc.close();
	}
}
