package com.Chapter4.ArraysAndString;

public class TraversingArrays {
	public static void main(String[] args) {
		int[] arr = new int[5];
		for(int x : arr) {
			System.out.println(x);
		}
		System.out.println("----------");
		int[] arr1 = {10,20,30,40,50};
		for(int x : arr1) {
			System.out.println(x);
		}
		System.out.println("----------");
		for(int i = 0;i<arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		arr1[1] = 105;
		
		System.out.println("Element at first index : "+ arr1[1]);
		System.out.println("Size of the given array : "+ arr1.length);
 	}
}
