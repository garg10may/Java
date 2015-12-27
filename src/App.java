import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class StringLengthComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		// TODO Auto-generated method stub

		int len1 = s1.length();
		int len2 = s2.length();

		if (len1 > len2) {

			return 1;

		} else if (len1 < len2) {

			return -1;
		}
		return 0;
	}

}

class AlphabeticalComparator implements Comparator<String> {

	@Override
	public int compare(String arg0, String arg1) {
		return arg0.compareTo(arg1);
	}

}

class ReverseAlphabeticalComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return -o1.compareTo(o2);
	}

}

public class App {

	public static void main(String[] args) {
		
		///Sorting Lists

		ArrayList<String> animal = new ArrayList<String>();

		animal.add("snake");
		animal.add("catlllll");
		animal.add("lion");
		animal.add("mouse");
		animal.add("elephant");

		Collections.sort(animal, new ReverseAlphabeticalComparator());

		for (String i : animal) {

			System.out.println(i);
		}
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(-34);
		numbers.add(23432);
		numbers.add(923472);
		
		Collections.sort(numbers, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return -o1.compareTo(o2);
			}
		});
		
		for ( Integer i : numbers) {
			
			System.out.println(i);
		}
		
	}

}
