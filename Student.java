package javaDemo;

import java.util.Scanner;

public class Student {
	private	int studentId;
	public 	String name;
	public 	String collegName;
	public	String place;
	protected	String age;
	private	String position;
	
	//create Student method
		public static Student createStudent(Student student) {
			 
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Student id");
			student.studentId	=sc.nextInt();
			System.out.println("Enter Student name");
			 student.name=sc.next();
			System.out.println("Enter Student collegName ");
		     student.collegName=sc.next();
			System.out.println("Enter Student place");
		      student.place	=sc.next();
			System.out.println("Enter Student age");
			student.age=sc.next();
			System.out.println("Enter Student position");
			 student.position=sc.next();
			 
			 System.out.println("Student information successfully added");
			  
			sc.close();
			 return student;
		}
		
		//display Student
		public static void displayStudent(Student student) {
			System.out.println("Student Details");
			System.out.println("Student Id = "+student.studentId);
			System.out.println("Student Name = "+student.name);
			System.out.println("Student CollegName = "+student.collegName);
			System.out.println("Student place = "+student.place);
			System.out.println("Student age = "+student.age);
			System.out.println("Student position = "+student.position);
		}
		
		public static void main(String[] args) {
			Student student= new Student();
			   Scanner sc= new Scanner(System.in);
			   createStudent(student);
		     displayStudent(student);
		  
		     
		}  
}
