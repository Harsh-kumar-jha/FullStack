package com.Chapter6.WrapperClassesAndExceptionHandling;

public class ExampleOfThrowAndThrows {
	public static void main(String[] args) throws Exception{
		System.out.println("First line in main()");
		int a , b , c = 0;
		a = Integer.parseInt(args[0]);
		b = Integer.parseInt(args[1]);
		try {
			if(b == 0) {
				ArithmeticException ae1 = new ArithmeticException("Division by 0 is not possible");
				throw ae1;
			}
			c = a / b;
			System.out.println("Division = "+ c);
		}catch(ArithmeticException ae) {
			System.out.println(ae.getMessage());
		}
		System.out.println("last line in main()");
	}
}
