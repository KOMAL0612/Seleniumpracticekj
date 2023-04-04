package day9.blocks;

public class Program1{
	/* static block or static initialization block or SIB */
	static {
		System.out.println("******** Running static-block1 of class Blocks1..");
	}
	public static void main(String[] args) {
		System.out.println("main() Starts");
		System.out.println("I am main() of Blocks1 class...");
		System.out.println("main() ends");
	}
}
/**
 * SIB- as its doesn't have any name to call for execution, hence it gets executed before main()
 * if you have multiple SIB in the program dn all the SIB will be executed in sequential order
 * its used to provide mandatory information before you gets into actual logic
 */