package day12.This;

public class Student3 {

	int x;
	// Constructor with a parameter
	public Student3(int x) {
		this.x = x;
	}
	// Call the constructor
	public static void main(String[] args) {
		Student3 myObj = new Student3(5);
		System.out.println("Value of x = " + myObj.x);//
	}

}
