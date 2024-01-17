package com.Chapter4.ArraysAndString;

public class StringBufferClass {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Harsh");
		System.out.println(sb);
		
//		1.append()
		sb.append(" Kumar Jha");
		System.out.println(sb);
		
//		diff b/w String and StringBuffer
		String str = "Harsh";
		str.concat(" Kumar Jha");
		System.out.println(str);
		
//		2.insert()
		StringBuffer s = new StringBuffer("Test");
		s.insert(2, 123);
		System.out.println(s);
		
//		3.reverse()
		StringBuffer sb1 = new StringBuffer("Harsh");
		sb1.reverse();
		System.out.println(sb1);
	
//		4.replace()
		StringBuffer str1 = new StringBuffer("Hello World");
		str1.replace(6,11,"Java");
		System.out.println(str1);
		
//		5.capacity()
		StringBuffer sbf = new StringBuffer();
		System.out.println(sbf.capacity());
		
//		StringBuilder class
		StringBuilder strBul = new StringBuilder("Hello Folks...");
		System.out.println(strBul);
		
//		CMD arguments
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		int result = num1 + num2;
		System.out.println(result);
	}
}
