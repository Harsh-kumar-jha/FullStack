package com.Chapter6.WrapperClassesAndExceptionHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionHandler {
	public static void main(String[] args) {
		int a,b,c;
		try {
			a = 10;
			b = 0;
			c = a/b;
			System.out.println("This line will not be executed....");
		}catch(ArithmeticException e) {
			System.out.println("Catch Block : Division by zero");
		}
		System.out.println("After exception is handled");
		
//		try with resource statement)
		try (BufferedReader br = new BufferedReader(new FileReader("d:\\myfile.txt"))) {
			String str;
			while((str = br.readLine()) != null) {
				System.out.println(str);
			}
		}catch(IOException ie) {
			System.out.println("I/O Exception " + ie );
		}finally {
			System.out.println("Finally is always executed");
		}
	}
}
