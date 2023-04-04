package day6.nonstaticfunctionmethods;

public class nonstaticmethod {

	public static void main(String[] args) {
		nonstaticmethod v1 = new nonstaticmethod();
		v1.Quotientandremainder(100, 50);
		v1.Swaptwono(20, 30);
		System.out.println("AScii value of 'f': " + v1.getasciivalue('f'));

	}

	void Quotientandremainder(int n1, int n2) {
		System.out.println("Number1 : " + n1);
		System.out.println("Number2 : " + n2);
		int quotient = n1 / n2;
		int remainder = n1 % n2;
		System.out.println("Number1 : " + quotient);
		System.out.println("Number2 : " + remainder);

	}

	void Swaptwono(int n1, int n2) {
		System.out.println("Number1 : " + n1);
		System.out.println("Number2 : " + n2);
		n1 = n1 + n2;
		n2 = n1 - n2;
		n1 = n1 - n2;
		System.out.println("Number1 : " + n1);
		System.out.println("Number2 : " + n2);
	}

	int getasciivalue(char c) {
		return c;
	}
}