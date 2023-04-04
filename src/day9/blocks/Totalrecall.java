package day9.blocks;

public class Totalrecall {
	
	static int age;
	double salary;
	static {
		age=32;
				System.out.println("I am static initialization Block");
	}
	{
		salary=36719.3;
		System.out.println("I am non-static initialization Block");
	}
	public static void main(String[] args) {
	}
Totalrecall()
{ System.out.println("I am zero parameterized constructor");
}
static void display() {
System.out.println("I am static functionmethod");
}
void print()
{ System.out.println("I am nonstatic functionmethod");

}

}