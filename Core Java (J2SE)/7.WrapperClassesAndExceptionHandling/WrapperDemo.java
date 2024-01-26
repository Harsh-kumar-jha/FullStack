package com.Chapter6.WrapperClassesAndExceptionHandling;

import static java.lang.System.*; // statically importing System class
public class WrapperDemo {
	public static void main(String[] args) {
		out.println("Hello");
		
//		Example of Wrapper classes
		int a = 10;
		Integer x = new Integer(a); // boxing
		out.println(x);
		
		String s = "120";
		Integer y = new Integer(s);
		out.println(y);
		
//		Methods of Wrapper classes
		Integer q = Integer.valueOf(a); 
		out.println(q);
		
		Integer p = Integer.valueOf(y);
		out.println(p);
		
		int v1 = x.intValue(); // unboxing
		byte v2 = x.byteValue(); // unboxing
		
		out.println(v1);
		out.println(v2);
	}
}
