package day7.forloop;

public class Program5reverseno {

	public static void main(String[] args) {
	//	int num=123,rev=0,temp;
//		System.out.println("Actual number: "+num);
//		for(;num>0;) {
//			temp=num%10;
//			rev=rev*10+temp;
//			num=num/10;
//		}
//		System.out.println("Reverse number is: "+rev);
				//or
		int rev=0,temp;
		System.out.println("Actual number: "+123);
		for(int num=123;num>0;num=num/10) {
			temp=num%10;
			rev=rev*10+temp;
		}
		System.out.println("Reverse number is: "+rev);

	}

}
