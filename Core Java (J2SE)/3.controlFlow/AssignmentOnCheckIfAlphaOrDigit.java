package com.chapter3.controlFlow;

import java.util.Scanner;

public class AssignmentOnCheckIfAlphaOrDigit {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char inputChar = scanner.next().charAt(0);

        if ((inputChar >= 'A' && inputChar <= 'Z') || (inputChar >= 'a' && inputChar <= 'z')) {
            System.out.println("The entered character is an alphabet.");
        } else if (inputChar >= '0' && inputChar <= '9') {
            System.out.println("The entered character is a digit.");
        } else {
            System.out.println("The entered character is neither an alphabet nor a digit.");
        }

        scanner.close();
	}
}
