package com.corejava.classwork;


import java.util.Scanner;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    	float[] marks=new float[5];
	
		Scanner sc=new Scanner(System.in);
		System.out.println("values of array: ");
		
		for(int i=0;i<marks.length;i++) {
			System.out.println(marks[i]);
		}
		
		//Arrays.sort(marks);
		
		System.out.println("values of array:");
		for(int i=0;i<marks.length;i++) {
			System.out.println(marks[i]);
		}
		sc.close();

	}

}
