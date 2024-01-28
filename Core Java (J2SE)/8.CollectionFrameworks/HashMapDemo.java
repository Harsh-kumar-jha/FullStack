package com.Chapter7.CollectionFrameworks;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<Integer,String> mp = new HashMap<Integer,String>();
		mp.put(11,"Sachin");
		mp.put(25, "Kholi");
		mp.put(12, "Yuvaraj");
		
		System.out.println(mp);
		System.out.println(mp.size());
		
		Set<Integer> ks = mp.keySet();
		System.out.println(ks);
		
		Collection<String> cv = mp.values();
		System.out.println(cv);
		
		Set<?> entry = mp.entrySet();
		System.out.println(entry);
		
		System.out.println(mp.containsKey(12));
		
		System.out.println(mp);
	}
}
