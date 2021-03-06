/* Imagine you are writing a program that stores a student's year (Freshman, Sophomore, Junior, or Senior), the number of courses the student is 
taking, and his or her GPA on a 4.0 scale. Declare variables with the appropriate names and types to hold this information. Write a complete 
variable declaration statement with the type, the variable name, and a semicolon.*/

package com.corejava.classwork;

public class StudentDetails
{
   private String name;
   private String[] year= {"Freshman","sophomore","Junior","Senior"};
   private int courses;
   private double gpa;
  
   public StudentDetails()
   {
       name = "Sunil Giri";
       courses = 6;
       gpa = 4.0;
   }
   
   
   public StudentDetails(String name, int courses, double gpa)
   {
       this.name = name;     
       this.courses = courses;
       this.gpa = gpa;
   }
   
   public String getName()
   {
       return name; 
   }
   public int getCourses()
   {
       return courses;
   }
   public double getGpa()
   {
       return gpa;
   }
  
   
   public void setName(String name)
   {
       this.name=name;
   }
   public void setGpa(double gpa)
   {
       this.gpa=gpa;
   }
   public void setCourses(int courses)
   {
       this.courses=courses;
   }



public static class studentReal
    {
       public static void main(String[] args)
       {
    	   StudentDetails student1= new StudentDetails("Manoj Thakur", 5, 3.7);
    	   StudentDetails student2= new StudentDetails("Tikeshwar Seth", 7, 3.8);
    	   StudentDetails student3= new StudentDetails();
           System.out.println(student1.getName() + ", Year:- " + student1.year[0]+ ", No of courses:- " + student1.getCourses() + ", GPA:- " + student1.getGpa());
           System.out.println(student2.getName() + ", Year:- " + student2.year[3]+ ", No of courses:- " + student2.getCourses() + ", GPA:- " + student2.getGpa());
           System.out.println(student3.getName() + ", Year:- " + student3.year[2]+ ", No of courses:- " + student3.getCourses() + ", GPA:- " + student3.getGpa());
       }
    }
}
