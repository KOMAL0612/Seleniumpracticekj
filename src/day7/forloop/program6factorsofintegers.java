package day7.forloop;

public class program6factorsofintegers {

	public static void main(String[] args) {
		int number = 60;
		System.out.println("factors of integers" + number + "are");
		for (int i = 1; i <= number; i++) {
			if (number % i == 0)
			System.out.println(i + "");
		}

	}
}