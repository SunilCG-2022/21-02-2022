package com.corejava.studentaverage;




public class StudentMain {
	public static void main(String[] args) throws Throwable{
	
				StudentAverage[] sa = new StudentAverage[8];
				StudentAverage student;
				
				//creating and adding student objects in the above array
				for(int i=0;i<sa.length;i++) {
					student = new StudentAverage();
					student.readStudentDetails();
					sa[i] = student;
				}
				
				for(int i=0;i<sa.length;i++) {
				
					sa[i].displayStudentDetails();
				}
				
	}
}
