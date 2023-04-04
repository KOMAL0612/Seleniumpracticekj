package day3.andoroperator;

public class operator {

	public static void main(String[] args) {
    int num1=-5,num2=0;
		
		// Logical AND
		System.out.println("bool1 && bool2 = " + ((num1==num2) && (num1>num2)));//F&&F=F

		// Logical OR
		System.out.println("bool1 || bool2 = " + ((num1==num2) || (num1>num2))); // F||F=F

		// Logical Not
		System.out.println("!(bool1 && bool2) = " + !((num1==num2) && (num1>num2)));//!(F&&F)==T


	}

}
