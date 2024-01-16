package com.chapter3.controlFlow;

public class ProgramOnSwitchCase {
	public static void main(String[] args) {
		int day = 3;
		String dayName;
		switch(day) {
		case 1 : dayName = "today is Monday"; break;
		case 2 : dayName = "today is Tuesday"; break;
		case 3 : dayName = "today is Wednesday"; break;
		case 4 : dayName = "today is Thursday"; break;
		case 5 : dayName = "today is Friday"; break;
		case 6 : dayName = "today is Saturday"; break;
		case 7 : dayName = "today is Sunday"; break;
		default : dayName = "Invalid Day...";
		}
		System.out.println(dayName);
	}
}
