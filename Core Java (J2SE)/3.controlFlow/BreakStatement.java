package com.chapter3.controlFlow;

public class BreakStatement {
	public static void main(String[] args) {
		for(int i = 0 ; i<10 ; i++) {
			if(i == 8) break;
			
			System.out.println(i);
		}
	}
}
