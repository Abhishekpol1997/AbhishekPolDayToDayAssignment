package javaDemo;

public class StudentConstructorOverloding {
	private	int studentId;
	public 	String name;
	public 	String collegeName;
	public	String place;
	protected	String age;
	private String email;
	//ConstructorOverloading demo
	
	public StudentConstructorOverloding() {
		System.out.println("this default constructor");
	}

	// same name of constructor with diffrent parameters
	public StudentConstructorOverloding(int studentId, String name, String collegeName, String place, String age,
			String position) {
		
		this.studentId = studentId;
		this.name = name;
		this.collegeName = collegeName;
		this.place = place;
		this.age = age;
		this.email = email;
	}


	public StudentConstructorOverloding(int empid, String name, String place) {
		super();
		this.studentId = empid;
		this.name = name;
		this.place = place;
	}


	public StudentConstructorOverloding(int studentId, String name, String collegName, String place, String email) {
		
		this.studentId = studentId;
		this.name = name;
		this.collegeName = collegName;
		this.place = place;
		this.email = email;
	}
	
	
	public static void main(String[] args) {
		StudentConstructorOverloding cons = new StudentConstructorOverloding();
		System.out.println(cons);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		StudentConstructorOverloding cons1 = new StudentConstructorOverloding(12, "sourav yadhav", "Manipal", "dubai", "44", "xyz@gmail.com");
		
		System.out.println("Student 1 Details ");
		System.out.println("Student" + " Id = "+cons1.studentId);
		System.out.println("Student Name = "+cons1.name);
		System.out.println("Student CompayName = "+cons1.collegeName);
		System.out.println("Student place = "+cons1.place);
		System.out.println("Student age = "+cons1.age);
		System.out.println("Student email = "+cons1.email);
		 
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

		StudentConstructorOverloding cons2 = new StudentConstructorOverloding(34, "Nadeem", "SIT", "mumbai", "abc@gmail.com");
		System.out.println("Student 2 Details ");
		System.out.println("Student Id = "+cons2.studentId);
		System.out.println("Student Name = "+cons2.name);
		System.out.println("Student CompayName = "+cons2.collegeName);
		System.out.println("Student place = "+cons2.place);
		System.out.println("Student email = "+cons2.email);
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

		StudentConstructorOverloding cons3 = new StudentConstructorOverloding(345, "Umesh ", "bangadesh");
		System.out.println("Student 3 Details ");
		System.out.println("Student Id = "+cons3.studentId);
		System.out.println("Student Name = "+cons3.name);
		System.out.println("Student place = "+cons3.place);
	}
	
		
}
