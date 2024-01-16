package com.chapter1.basic;

import java.util.Scanner;

public class TakingStringAsInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Name : ");
		String fname = sc.next();
		System.out.print("Enter Last Name : ");
		String lname = sc.next();
		String fullName = fname + " " + lname;
		System.out.println(fullName);
		sc.close();
	}
}
