package com.corejava.studentaverage;

import java.text.ParseException;
import java.util.Scanner;

public class StudentAverage {
	
	//variables
	int studentRoll;
	static int scienceMark;
	static int mathsMark;
    static int englishMark;
    static int averageMarks;
	
	
	
	Scanner sc  = new Scanner(System.in);
	//methods to access above variables
	void readStudentDetails() throws ParseException {
		System.out.println("Enter the Student data");
		System.out.println("Enter the student roll :");
		studentRoll = sc.nextInt();
		System.out.println("Enter the science marks :");
		scienceMark = sc.nextInt();
		System.out.println("Enter the maths marks :");
		mathsMark = sc.nextInt();
		System.out.println("Enter the english marks :");
		englishMark= sc.nextInt();
	
		public int averageMarksStudent() {
			System.out.println( averageMarks = ( scienceMark + mathsMark + englishMark ) / 3);
		}
	}	
		
	
	
	void displayStudentDetails(){
		System.out.println("Entered the Student data ...............");
		System.out.println("Student roll number = " + studentRoll);
		System.out.println("Student science marks = " + scienceMark);
		System.out.println("Student maths marks = " + mathsMark);
		System.out.println("Student english marks = " + englishMark);
		System.out.println("Student average marks = " + averageMarks);
	}

	
}