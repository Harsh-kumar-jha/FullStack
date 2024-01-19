package com.chapter5.OOPSPart1;

public class HashCodeMethod {
	public static void main(String[] args) {
		HashCodeMethod hcm1 = new HashCodeMethod();
		System.out.println(hcm1.hashCode());
		
		HashCodeMethod hcm2 = new HashCodeMethod();
		System.out.println(hcm2.hashCode());
		
		HashCodeMethod hcm3 = new HashCodeMethod();
		System.out.println(hcm3.hashCode());
	}
}
