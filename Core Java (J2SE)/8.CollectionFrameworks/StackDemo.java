package com.Chapter7.CollectionFrameworks;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack<Double> s = new Stack<Double>();
		s.push(10.2);
		s.push(50.2);
		s.push(40.2);
		s.push(30.2);
		s.push(70.2);
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s);
		
	}
}	
