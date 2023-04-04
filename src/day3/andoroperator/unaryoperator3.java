package day3.andoroperator;

public class unaryoperator3 {

	public static void main(String[] args) {
		int a = 0, b;
		b = a++ + ++a + ++a + a;//(0+2+3+3)
		
		System.out.println("a: "+a);// 3
		System.out.println("b: "+b);// 8
		System.out.println("**********************");
		a = -5;
		b = a-- + --a + --a + a;//(-5-6-7-7)=-24
	 
		System.out.println("a: "+a);//  -70
		System.out.println("b: "+b);//  -24

		a = 21;
		b = --a + --a + --a + a + ++a + a++;//(20+19+18+18+19+19)

		System.out.println(a);// 20
		System.out.println(b);//113

		a = -2;
		b = a-- + a + ++a + a++ + ++a + a++ + a;
		System.out.println(a);//
		System.out.println(b);//
	}

}
