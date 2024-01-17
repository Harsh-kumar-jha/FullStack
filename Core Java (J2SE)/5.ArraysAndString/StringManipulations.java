package com.Chapter4.ArraysAndString;

public class StringManipulations {
	public static void main(String[] args) {
		String str = "Harsh";
		
//		1.length()
		System.out.println(str.length());
		
//		2.concatenation()
		String str1 = " Kumar Jha";
		String str2 = str.concat(str1);
		System.out.println(str2);
		
//		3.String to charArray()
		char[] charArr = str.toCharArray();
		System.out.println(charArr);
		
//		4.charAt()
		char charAt = str.charAt(4);
		System.out.println(charAt);

//		5.compareTo()
		int compareTo = str.compareTo(str2);
		System.out.println(compareTo);
		
//		6.contains
		System.out.println(str2.contains(str));
		System.out.println(str1.contains(str));
		
//		7.split()
		String str3 ="Thisxyzwebsitexyzisxyzforxyzbloggers";
		String[] split = str3.split("xyz");
		for(String s : split) {
			System.out.print(s + " ");
		}
		System.out.println();
		
//		8.indexOf() and lastIndexOf()
		String str4 = "he...Will learn...Java and will lead anywhere!!...";
		System.out.println(str4.indexOf("a"));
		System.out.println(str4.lastIndexOf("a"));
		
//		9.toString()
		String string = str4.toString();
		System.out.println(string);
		
//		10.replace()
		String s1 = "Hello World";
		String replace = s1.replace("World","Java");
		System.out.println(replace);
		
//		11.substring()
		String substring = str2.substring(0,6);
		System.out.println(substring);
	}
}
