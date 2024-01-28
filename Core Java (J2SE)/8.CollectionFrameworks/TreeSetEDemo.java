package com.Chapter7.CollectionFrameworks;

import java.util.TreeSet;

public class TreeSetEDemo {
	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("Java");
		ts.add("Programming");
		ts.add("Language");
//		ts.add(10); not valid
		System.out.println(ts);
		
//		Null acceptance
		TreeSet ts1 = new TreeSet();
		ts1.add(new StringBuffer("Java"));
		ts1.add(new StringBuffer("DevOps"));
		ts1.add(new StringBuffer("MySql"));
		ts1.add(new StringBuffer("Python"));
		System.out.println(ts1);
		
	}
}
