package com.chapter3.logicalProgram;

import java.util.Scanner;

public class AssignmentNine {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int dummy = num;
		int revNum = 0;
		while(dummy > 0) {
			revNum = revNum * 10 + dummy%10;
			dummy /=10;
		}
		if(revNum == num ) System.out.println("It an Armstrong Number");
		sc.close();
	}
}
