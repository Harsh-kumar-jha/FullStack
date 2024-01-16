package com.chapter3.controlFlow;

public class ContinueStatement {
	public static void main(String[] args) {
		for(int i = 1; i<11 ; i++) {
			if(i == 5) continue;
			System.out.println(i);
		}
	}
}
