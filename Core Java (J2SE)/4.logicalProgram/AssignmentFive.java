package com.chapter3.logicalProgram;

import java.util.Scanner;

public class AssignmentFive {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i = 1; i<11;i++) {
			System.out.println(num + " X " + i + " = " + num*i);
		}
		
		sc.close();
	}
}
