package com.chapter5.OOPSPart2;

class SupperClass1 {
	void show() {
		System.out.println("this is a parent class method");
	}
}

class DerivedClass1 extends SupperClass1 {
	void show() {
		System.out.println("this is a child class method");
	}
}




public class TypeCasing {
	public static void main(String[] args) {
//		int num = 10;
//		System.out.println("The integer value : "+ num);
//		
////		converting int type to double type (widening)
//		double d = num;
//		System.out.println("The double value : "+ d);
//		
//		double data = 10.99d;
//		System.out.println("The data value : " + data);
//		
//		int data1 = (int)data;
//		System.out.println("The data value : "+ data1);
		
		SupperClass1 p = new SupperClass1();
		p.show();
		
		//upcasting
		p = (SupperClass1) new DerivedClass1(); 
		p.show();
		
		DerivedClass1 c = new DerivedClass1();
		c.show();
		
//		downcasting
		c = (DerivedClass1) p;
		c.show();
	}
}
