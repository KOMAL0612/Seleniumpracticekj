package day4.loop;

public class Snippet {
	public static void main(String[] args) {
	
	for (int i = 0; i < 3; ++i) {
				System.out.println("Hello i= " + i);
				for(int j=0;j<2;j++) {
					System.out.println("Bye j= "+j);
				}
			}
			
			for (int l = 0; l < 3; ++l) {
				System.out.println("Hello l= " + l);
				for(int m=0;m<2;m++) {
					System.out.println("\tHi m= "+m);
					for(int k=0;k<2;k++) {
						System.out.println("\t\tBye k= "+k);
					}
				}
			}
			
		}
	}

