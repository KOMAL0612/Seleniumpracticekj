package day3.andoroperator;

public class unaryoperator2 {

	public static void main(String[] args) {
		int a = 0, b;
		b = a++ + ++a + ++a + a;//0+2+3+3=8
		
		System.out.println("a: "+a);// 3
		System.out.println("b: "+b);// 8
		System.out.println("**********************");
		a = -5;
		b = a-- + --a + --a + a;//(-5-7-8-8)=(12+16)=-28
	 
		System.out.println("a: "+a);//  -8
		System.out.println("b: "+b);// -28 

		a = 21;
		b = --a + --a + --a + a + ++a + a++;//(20+19+18+18+19+19)=113

		System.out.println(a);// 20
		System.out.println(b);// 113

		a = -2;
		b = a-- + a + ++a + a++ + ++a + a++ + a;//(-2-3-2-2+0+0+1)-5-4+1=-9+1=-8
		System.out.println(a);//1
		System.out.println(b);//-8
		

	}

}
