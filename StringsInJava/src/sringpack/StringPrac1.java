/* Write a program to accept string from the keyboad and split the entered string in to 
words and count number of words in the string?   */

package sringpack;

import java.util.Scanner;

public class StringPrac1 {

	public static void main(String[] args) {
		System.out.println("Enter the String : ");
		Scanner sc= new Scanner (System.in);
		String msg = sc.nextLine();
		System.out.println(msg);
	
		
		  String words[] =msg.split(" ");
		  System.out.println("String is divided into words: ");
		  for(String W : words) { 
			  System.out.println(W);
			  }
		  
		  int count=0;
		  
		  for(int i=0; i < msg.length()-1;i++) {
			  if((msg.charAt(i) == ' ') && (msg.charAt(i+1)!=' ')) {
				  count++;
			  }
		  }
		  System.out.println("number of Words in a String : "+count);	 
		
	}

}
