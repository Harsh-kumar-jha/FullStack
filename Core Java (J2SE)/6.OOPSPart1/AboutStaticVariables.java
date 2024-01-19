package com.chapter5.OOPSPart1;

public class AboutStaticVariables {
	String name;
	String email;
	static String institute; // static variable
	public static void main(String[] args) {
		AboutStaticVariables.institute = "ITMVU"; //initializing static variable
		
		AboutStaticVariables s1 = new AboutStaticVariables(); // creating object
		s1.name = "Harsh";
		
		AboutStaticVariables s2 = new AboutStaticVariables();
		s2.name = "Kamal";
			
	}
}
