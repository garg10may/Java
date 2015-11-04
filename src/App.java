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

public class App {

	public static void main(String[] args) {

		ArrayList<String> animal = new ArrayList<String>();

		animal.add("snake");
		animal.add("catlllll");
		animal.add("lion");

		Collections.sort(animal, new StringLengthComparator());

		for (String i : animal) {

			System.out.println(i);
		}
	}

}
