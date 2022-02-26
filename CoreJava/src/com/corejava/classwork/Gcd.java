package com.corejava.classwork;

import java.util.Scanner;

public class Gcd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of P: ");
		int p=sc.nextInt();
		
		System.out.println("Enter the value of Q :");
		int q=sc.nextInt();
		
		int gcd=1;
		
		for(int i=1;i<=p && i<=q;i++) {
			if(p%i==0 && q%i==0) {
				gcd=i;
			}
		}
		System.out.println(gcd);

	}

}
