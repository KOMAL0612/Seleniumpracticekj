package day5.functionmethods;

public class program3swapnum {
			
	public static void main(String[] args) {
		
	       Swaptwono(20,30);

	}
		  static void Swaptwono(int n1, int n2) {
				System.out.println("Number1 : "+n1);
				System.out.println("Number2 : "+n2);
				 n1=n1+n2;
				 n2=n1-n2;
				 n1=n1-n2;
				System.out.println("Number1 : "+n1);
				System.out.println("Number2 : "+n2);
			
			

	}
}
