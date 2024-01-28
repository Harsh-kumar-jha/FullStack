package com.Chapter7.CollectionFrameworks;

import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		v.add("Sachin");
		v.add(new String("Sehwagh"));
		v.add("Kholi");
		v.add("Dhoni");
		v.add("Suresh");
		System.out.println(v);
		System.out.println(v.size());
	}
}
