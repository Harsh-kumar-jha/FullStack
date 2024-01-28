package com.Chapter7.CollectionFrameworks;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(27);
		hs.add(null);
		hs.add(10);
		hs.add(12);
		hs.add(9);
		System.out.println(hs.size());
		for(Integer s : hs) {
			System.out.println(s);
		}
		Iterator<Integer> itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
