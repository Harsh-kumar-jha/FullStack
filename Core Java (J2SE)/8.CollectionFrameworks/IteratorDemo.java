package com.Chapter7.CollectionFrameworks;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Java");
		al.add("JS");
		al.add("Spring Boot");
		
		Iterator<String> itr = al.iterator();
		
		while(itr.hasNext()) {
			String next = itr.next();
			System.out.println(next);
		}
		
	}
}
