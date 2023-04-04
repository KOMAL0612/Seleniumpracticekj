package day16.string;

public class string4trim {

	public static void main(String[] args) {

		String s1 = "     I am komal  jagdale from  pune      ";
		System.out.println("Actual String with spaces: " + s1);
		System.out.println("Actual String without spaces: " + s1.trim());
		s1 = s1.replace(" ", "");
		System.out.println("Actual String without all spaces:" + s1);

	}
}
