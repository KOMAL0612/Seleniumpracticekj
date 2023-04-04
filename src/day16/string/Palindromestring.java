package day16.string;

public class Palindromestring {

	public static void main(String[] args) {
		String  s1= "LEVEL";
		String temp="";
		for(int i=s1.length()-1;i>=0;--i)
		temp=temp+s1.charAt(i);
		System.out.println("original string"+s1);
		System.out.println("Reverse string"+temp);
		
		if(temp.equals(s1))
		{System.out.println("Given string is palindrome");
		}else {
			System.out.println("Given string is not palindrome");
		}

	}

}
