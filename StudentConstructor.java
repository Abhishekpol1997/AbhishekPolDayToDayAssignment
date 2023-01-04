package javaDemo;

public class StudentConstructor {
	
	private	int studentId;
	public 	String name;
	public 	String collegeName;
	public	String place;
	protected	String age;
	private String email;

	// creating constructor
	public StudentConstructor(int studentId, String name, String collegeName, String place, String age, String email) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.collegeName = collegeName;
		this.place = place;
		this.age = age;
		this.email = email;
	}


	public static void main(String[] args) {
		// passing value to parameter constructor
		StudentConstructor emp= new StudentConstructor(12, "Abhishek pol", "BWC" , "mumbai","23"," abc@gmail.com");
		StudentConstructor emp1= new StudentConstructor(14, "Abhishek pol", "BWC" , "Baner","23"," xyz@gmail.com");
		
		System.out.println("Student 1 Details ");
		System.out.println("Student Id = "+emp.studentId);
		System.out.println("Student Name = "+emp.name);
		System.out.println("Student CompayName = "+emp.collegeName);
		System.out.println("Student place = "+emp.place);
		System.out.println("Student age = "+emp.age);
		System.out.println("Student position = "+emp.email);
		 
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("Student 2 Details ");
		System.out.println("Student Id = "+emp1.studentId);
		System.out.println("Student Name = "+emp1.name);
		System.out.println("Student CompayName = "+emp1.collegeName);
		System.out.println("Student place = "+emp1.place);
		System.out.println("Student age = "+emp1.age);
		System.out.println("Student position = "+emp1.email);
		

	}

}
