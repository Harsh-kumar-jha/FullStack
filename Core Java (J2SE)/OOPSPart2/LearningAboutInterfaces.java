package com.chapter5.OOPSPart2;

interface Language{
	public void getType(String name);
	
}

class ProgrammingLanguage implements Language{
	
	public void getType(String name) {
		System.out.println("Programming Language : "+ name);	
	}
}

public class LearningAboutInterfaces {
	public static void main(String[] args) {
		ProgrammingLanguage pl = new ProgrammingLanguage();
		pl.getType("Java");
	}
}
