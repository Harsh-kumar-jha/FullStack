package com.chapter5.OOPSPart1;

public class AboutInstanceVaribles {
	int age; // instance Variable
	public static void main(String[] args) {
		AboutInstanceVaribles user1 = new AboutInstanceVaribles();
		user1.age = 20;
		System.out.println(user1.age);
		
		AboutInstanceVaribles user2 = new AboutInstanceVaribles();
		user2.age = 22;
		System.out.println(user2.age);
		
		AboutInstanceVaribles user3 = new AboutInstanceVaribles();
		user3.age = 30;
		System.out.println(user3.age);
	}
}
