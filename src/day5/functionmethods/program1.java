package day5.functionmethods;

public class program1 {

	public static void main(String[] args) {
		System.out.println("Hi am shailesh");
		System.out.println("Hi am your automation trainer");
		System.out.println("Hi am from UP");
		displaypersonalinfo();
		displaypersonalinfo("Amar","API","Bangalore");
		int num=65345;
		int i=num;
		calling(i);
				
		
	}
public static void displaypersonalinfo() {
	System.out.println("Hi am jay");
	System.out.println("Hi am your manual trainer");
	System.out.println("Hi am from pune");

}	


	public static void displaypersonalinfo(String name,String prof,String location)
	{
		System.out.println("Hi am "+name);
		System.out.println("Hi am your" +prof+"trainer");
		System.out.println("Hi am from "+location);

	}
	public static void calling(int num )
	{System.out.println("Hi am is xyz");
	System.out.println("my no.is"+num);
}
}