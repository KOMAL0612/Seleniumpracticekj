package day2.variables;

public class swapnumberwithouttemp {

	public static void main(String[] args) {
		int num1=25,num2=30;
		System.out.println("num1" +num1);
		System.out.println("num2" +num2);
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
	    System.out.println("num1" +num1);
	    System.out.println("num2" +num2);

	}

}
