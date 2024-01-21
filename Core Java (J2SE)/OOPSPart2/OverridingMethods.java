package com.chapter5.OOPSPart2;


class Animal {
	void eat() {
		System.out.println("Every animal loves to eat meat");
	}
}
class Dog extends Animal{
	@Override
	void eat() {
		// TODO Auto-generated method stub
		System.out.println("Dogs love to eat meat");
	}
}
public class OverridingMethods {
	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.eat();
	}
}
