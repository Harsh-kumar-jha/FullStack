package com.Chapter7.CollectionFrameworks;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedListHashSetDemo {
	public static void main(String[] args) {
		LinkedHashSet<Integer> ll = new LinkedHashSet<Integer>();
		ll.add(27);
		ll.add(17);
		ll.add(47);
		ll.add(37);
		ll.add(null);
		System.out.println(ll.size());
		for(Integer s : ll) {
			System.out.println(s);
		}
		Iterator<Integer> it = ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
