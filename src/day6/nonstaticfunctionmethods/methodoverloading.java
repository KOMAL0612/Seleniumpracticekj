package day6.nonstaticfunctionmethods;

public class methodoverloading {

	public static void main(String[] args) {
		main('a');
		main(10);
	}

	public static void main(int i) {
		System.out.println("I am  main(int)");
	}
	public static void main(char i) {
		System.out.println("I am  main(char)");
	}
}