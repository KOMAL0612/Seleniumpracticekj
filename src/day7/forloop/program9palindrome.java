package day7.forloop;

public class program9palindrome {

	public static void main(String[] args) {
		int num=121,rev=0,rem=0;
		int temp=num;
		
for(;num>0;) {//num=123/10=12 | num=12/10=1 | num=1/10=0
	rem=num%10;//123%10=3 | 12%10=2  | 1%10=1
	rev=rev*10+rem;//0*10+3=3 |3*10+2=32 | 32*10+1=321
	num=num/10;
}
if(temp==rev) {
	System.out.println("Given number is palindrome- "+temp);
}else {
	System.out.println("Given number is not a palindrome- "+temp);
}
}}