package com.chapter3.logicalProgram;

import java.util.Scanner;

public class AssignmentOne {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String brand = sc.next();
		if(brand.equals("Nike")){
			System.out.println("Just do it");
		}else if(brand.equals("Adidas")) {
			System.out.println("Impossible is nothing");
		}else if(brand.equals("Puma")) {
			System.out.println("Forever Faster");
		}else if(brand.equals("Reebok")){
			System.out.println("I am What I am");
		}
		sc.close();
	}
}
