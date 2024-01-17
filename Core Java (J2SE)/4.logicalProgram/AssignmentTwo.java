package com.chapter3.logicalProgram;

import java.util.Scanner;

public class AssignmentTwo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sal = sc.nextInt();
		double PF = sal * 0.12;
		System.out.println("Provident Fund : " + PF);
		sc.close();
	}
}
