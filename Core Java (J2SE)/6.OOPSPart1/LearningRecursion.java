package com.chapter5.OOPSPart1;

public class LearningRecursion {
//	java program to find factorial of a given number
	static int factorial(int n) {
		if(n!=0) {
			return n * factorial(n-1);
		} else return 1;
	}
	
// java program to check if number is palindrome
	static int rev(int num,int temp) {
		if(num == 0) {
			return temp;
		}
		temp = temp*10 + num%10;
		return rev(num/10,temp);
		
	}

//	reversing a string 
	static void reverse(String s) {
		if(s==null || s.length() <= 1) {
			System.out.println(s);
		}else {
			System.out.print(s.charAt(s.length()-1));
			reverse(s.substring(0,s.length()-1));
		}
	}
	
	public static void main(String[] args) {
		int number = 4;
		int result = factorial(number);
		System.out.println(result);
		
		int num = 121;
		int revNum = rev(num,0);
		if(num == revNum) System.out.println("YES");
		else System.out.println("NO");
		
		reverse("HARSH");
	}
}
