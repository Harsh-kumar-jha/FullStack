package com.chapter3.logicalProgram;



public class AssignmentTen {
	public static void main(String[] args) {
		AssignmentTen AT = new AssignmentTen();
		for(int i = 2; i<101; i++) {
			if(AT.isPrime(i)) {
				System.out.println(i);
			}
		}
	}
	
	boolean isPrime(int num) {
		for(int i = 2; i<num ; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
