package com.Chapter4.ArraysAndString;

public class LogicalProblemOnArrays {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int sum = 0;
		for(int x : arr) {
			sum += x;
			System.out.print(x + " ");
		}
		System.out.println();
		System.out.println(sum);
		int i = 0 , j = arr.length-1;
		while(i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		for(int x : arr) {
			System.out.print(x +" ");
		}
		int minVal = arr[0];
		int maxVal = arr[0];
		int second_smallest = arr[0];
		int second_largest = arr[0];
		for(int k = 0; k<arr.length; k++) {
			if(arr[k] > maxVal) {
				second_largest = maxVal;
				maxVal = arr[k];
			}
			if(arr[k] < minVal) {
				second_smallest = minVal;
				minVal = arr[k];
			}	
		}
//		for(int k = 0; k <arr.length ; k++) {
//			if(arr[k] < second_smallest && arr[k] > minVal) {
//				second_smallest = arr[k];
//			}
//		}
		System.out.println();
		System.out.println("Min Value in array : " + minVal);
		System.out.println("Second Smallest element in array : "+ second_smallest);
		System.out.println("Max Value in array : "+ maxVal);
		System.out.println("Seconde Largest element in array : "+ second_largest);
	}
}
