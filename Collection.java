package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;


public class New {


	public static void main(String[] args) {

		ArrayList<String> s = new ArrayList<>();

		s.add("apple");
		s.add("bananna");
		s.add("orange");
		s.add("kiwi");

		System.out.println(s);

		// 1st Way - though you can't modify the collection here
		for (String i : s) {

			System.out.println(i);
		}
		
		System.out.println();

		// 2nd Way
		// If need to modify the colleciton, like if condition remove element
		ListIterator<String> i = s.listIterator();

		while (i.hasNext()) {
			
			System.out.println(i.next());
			
		}
		
		System.out.println();

		// 3rd Way
		// not so much of use, but if you want to step etc.
		for (int i1 = 0; i1 < s.size(); i1++) {

			System.out.println(s.toArray()[i1]);
		}
		
		System.out.println(s);
		
		String[] a = { "abc", "bcd", "ced" };
		
		System.out.println(a);
		
		System.out.println(Arrays.asList(a));
		
	}

}
