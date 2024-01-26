package com.Chapter6.WrapperClassesAndExceptionHandling;

import java.io.FileReader;

public class ExampleOfExceptions {
	public static void main(String[] args) {
//		checked Exception or Compile time exception
		FileReader file = new FileReader("SomeFile.txt");
		
//		unchecked exception or runtime exception
		int i = 10;
		int j = 0;
		int c = i/j; 
		System.out.println(c);
	}
}
