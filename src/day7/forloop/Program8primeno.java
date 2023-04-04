package day7.forloop;

public class Program8primeno {

	public static void main(String[] args) {
		int i,m=0;
				int n=3;
				m=n/2;
				if(n==0||n==1)
				{
					System.out.println("number is not prime");
				}
				else
				{
					for(i=2;i<=m;i++)
					{if(n%i==0) {
						System.out.println("number is not prime");
					}
					else {
						System.out.println("number is prime");
					}
					}
				}
	}
}
				
					
				
    
