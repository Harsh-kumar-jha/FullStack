package com.Chapter6.WrapperClassesAndExceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class AgeException extends Exception{
	public AgeException(String msg) {
		super(msg);
	}
}

public class UserDefineExceptionCreation {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your age : ");
		int age = Integer.parseInt(br.readLine());
		try {
			if(age < 18) {
				AgeException ar = new AgeException("Sorry your have to wait for "+ (18-age) + " Years");
				throw ar;
			}
			System.out.println("Congo your eligible for votion...");
		}catch(AgeException ae) {
			System.out.println(ae);
		}
	}	
}
