package com.chapter3.controlFlow;

import java.util.Scanner;

public class AssignmentOnCheckIfPrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		boolean flag = false;
		for(int i = 2 ; i < x ; i++ ) {
			if( x % i == 0) {
				flag = true;
				break;
			}
		}
		
		if(flag == false) {
			System.out.println("Given Number is prime");
		}
		sc.close();
	}
}
