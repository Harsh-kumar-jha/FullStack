package com.chapter5.OOPSPart1;

public class AboutThisKeyword {
	double width,height,depth;
	public AboutThisKeyword(double width,double height, double depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	public static void main(String[] args) {
		AboutThisKeyword shape = new AboutThisKeyword(10, 20, 30);
		System.out.println("Width : "+shape.width);
		System.out.println("height : "+shape.height);
		System.out.println("depth : "+shape.depth);
	}
}
