package com.Chapter7.CollectionFrameworks;

import java.util.LinkedList;

public class LearningLinkedList {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add("Harsh");
		ll.add(40);
		ll.add(null);
		ll.add("Harsh");
		System.out.println(ll);
		ll.add(0,"Java");
		System.out.println(ll);
		ll.add(0,"Oracle");
		System.out.println(ll);
		ll.removeLast();
		System.out.println(ll);
		ll.addFirst("C++");
		System.out.println(ll);
	}
}
