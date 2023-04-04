package day19.collection;
import java.util.Iterator;
import java.util.TreeSet;

public class Arrayascnsort {

	public static void main(String[] args) {
		TreeSet<String> al = new TreeSet<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ravi");
		al.add("Ajay");
		System.out.println("TreeSet elements are: "+al);
		// Traversing elements
		
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("Traversing element through Iterator in descending order");

		Iterator i = al.descendingIterator();
		while (i.hasNext()) {
			System.out.println(i.next());

		}
	}
}
	