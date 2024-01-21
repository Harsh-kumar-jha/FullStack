package com.chapter5.OOPSPart2;

@FunctionalInterface
interface Sayabal{
	void say(String msg);
}

class Example implements Sayabal{
	@Override
	public void say(String msg) {
		// TODO Auto-generated method stub
		System.out.println(msg);
	}
}

public class FunctionalInterfaceExample {
	public static void main(String[] args) {
		Example ex = new Example();
		ex.say("Hello there");
	}
}
