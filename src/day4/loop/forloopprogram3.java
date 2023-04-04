package day4.loop;

public class forloopprogram3 {

	public static void main(String[] args) {
		for (int i = 0; i < 3; i++)
			System.out.println("i=" + i);
		{
			for (int j = 0; j < 2; j++)
				System.out.println("j" + j);
			{
				for (int k = 0; k < 3; k++)
					System.out.println("k=" + k);
			}
		}

	}
}
