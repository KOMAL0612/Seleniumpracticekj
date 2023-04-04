package day19.collection;

import java.util.TreeSet;

public class Arraysetlist {

	public static void main(String[] args) {

		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(24);
		set.add(66);
		set.add(12);
		set.add(15);
		System.out.println("TreeSet elements are: " + set);
		System.out.println("first element Value: " + set.pollFirst());
		System.out.println("After pollFirst(),TreeSet elements are: " + set);
		System.out.println("last element Value: " + set.pollLast());
		System.out.println("After pollLast(), TreeSet elements are: " + set);

		TreeSet<String> set2 = new TreeSet<String>();
		set2.add("A");
		set2.add("B");
		set2.add("C");
		set2.add("D");
		set2.add("E");
		System.out.println("Initial Set: " + set2);

	}

}
