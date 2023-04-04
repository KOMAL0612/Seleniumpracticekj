package day12.This;

public class student {

	int rollno;
	float fee;
	 student(int rollno, float fee) {		
		this.rollno = rollno;
		this.fee = fee;
	}
	void display() {
		System.out.println(rollno + " " +  fee);
	}
}
class ThisKeyword1 {
	public static void main(String args[]) {
		 student s1 = new  student(111, 5000f);
		s1.display();//
		 student s2 = new  student(112, 6000f);
		s2.display();//
	}
}