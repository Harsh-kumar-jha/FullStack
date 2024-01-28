package com.Chapter7.CollectionFrameworks;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableDemo {
	public static void main(String[] args) {
		Hashtable<String,Integer> ht = new Hashtable<String,Integer>();
		ht.put("Sachin", 200);
		ht.put("Rohit", 264);
		ht.put("Sehwagh", 219);
		ht.put("Ganguly", 183);
		ht.put("Dhoni", 183);
		
		System.out.println(ht);
		Enumeration e = ht.keys();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
	}
}
