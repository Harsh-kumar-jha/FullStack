package com.Chapter7.CollectionFrameworks;

import java.util.ArrayList;

public class LearningArrayList {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		
		al.add("Harsh");
		al.add(101);
		al.add(202.5);
		System.out.println(al); 
		al.remove(1);
		System.out.println(al);
		al.add("brc");
		al.add("Java");
		System.out.println(al);
	}
}
