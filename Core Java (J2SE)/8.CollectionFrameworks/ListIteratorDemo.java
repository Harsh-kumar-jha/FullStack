package com.Chapter7.CollectionFrameworks;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		
		ListIterator<Integer> litr = al.listIterator();
		while(litr.hasNext()) {
			int next = litr.next();
			System.out.println(next);
		}
	}
}
