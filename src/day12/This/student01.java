package day12.This;

public class student01 {

	int rollno;
	float fee;
	student01(int rollno, float fee) {		
		System.out.println("Local varibale: "+rollno);
		System.out.println("Local varibale: "+fee);
		System.out.println("Global varibale: "+this.rollno);
		System.out.println("Global varibale: "+this.fee);
		//global variable = local variable	
		this.rollno = rollno;
		this.fee = fee;
		System.out.println("Local varibale: "+rollno);
		System.out.println("Local varibale: "+fee);
		System.out.println("Global varibale: "+this.rollno);
		System.out.println("Global varibale: "+this.fee);
	}
	void display() {
		System.out.println(rollno + " " +  fee);	
	}
}
class ThisKeyword01 {
	public static void main(String args[]) {
		
		student01 s1 = new student01(111, 5000f);
		s1.display();//
		System.out.println("********************************");
		student01 s2 = new student01(112, 6000f);
		s2.display();//
	}
}
/**
 * this keyword is predefined keyword, also known as instance of current class
 * ideally used to differentiate local and global variable(NSGV) when they are having same name
 * this should be used only for non-static member and inside non-static 
 */