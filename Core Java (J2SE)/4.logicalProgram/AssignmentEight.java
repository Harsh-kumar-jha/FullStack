package com.chapter3.logicalProgram;

import java.util.Scanner;

public class AssignmentEight {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int revNum = 0;
		while(num > 0) {
			revNum += num%10;
			num /=10;
		}
		System.out.println(revNum);
		sc.close();
	}
}
