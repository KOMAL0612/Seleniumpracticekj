package day19.collection;

	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Iterator;
	public class Arraylistduplicateelement {


		public static void main(String args[]) {
			ArrayList list = new ArrayList();// Creating arraylist
			list.add("a");// auto-upcasting from String to Object class object
			list.add("b");
			list.add("c");
			list.add("d");
			// Printing the arraylist object
			System.out.println("size of list: " + list.size());
			System.out.println("Elements of list: " + list);
			// accessing particular element
			System.out.println(list.get(3));

		}

	}

