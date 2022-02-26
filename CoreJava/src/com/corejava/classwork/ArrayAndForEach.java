package com.corejava.classwork;

import java.util.Scanner;

public class ArrayAndForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int[] values=new int[6];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values...");
		for(int i=0;i<values.length;i++) {
			values[i] = sc.nextInt();
		}
		System.out.println("values of array...");
		for(int arrayValue : values) {
			System.out.println(arrayValue);
		}
	}

}
