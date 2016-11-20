import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// Some common implementations

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
		return -o1.compareTo(o2);
	}

}

class ReverseAlphabeticalComparator2 implements Comparator<String> {

	public int compare(String o1, String o2) {
		return o2.compareTo(o1);
	}
}

public class App {

	public static void main(String[] args) {

		/// Sorting Lists

		ArrayList<String> animal = new ArrayList<String>();

		animal.add("snake a");
		animal.add("cat b");
		animal.add("lion c");
		animal.add("mouse d");
		animal.add("elephant e ");
		animal.add("hippopotamus f");

		Collections.sort(animal);
		System.out.println(animal);

		Collections.sort(animal, new AlphabeticalComparator());
		System.out.println(animal);

		Collections.sort(animal, new ReverseAlphabeticalComparator());
		System.out.println(animal);

		Collections.sort(animal, new ReverseAlphabeticalComparator2());
		System.out.println(animal);

		Collections.sort(animal, new StringLengthComparator());
		System.out.println(animal);

		Collections.sort(animal, new Comparator<String>() {

			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		System.out.println(animal);

		// Java 8
		Collections.sort(animal, (x, y) -> x.compareTo(y));
		System.out.println(animal);

		Collections.sort(animal, (x, y) -> y.compareTo(x));
		System.out.println(animal);

		Collections.sort(animal, (x, y) -> x.length() - y.length());
		System.out.println(animal);

		Collections.sort(animal, (x, y) -> y.length() - x.length());
		System.out.println(animal);

		Collections.sort(animal, Comparator.comparing(x -> x.length()));
		System.out.println(animal);

		Collections.sort(animal, Comparator.comparing(x -> -x.length()));
		System.out.println(animal);

		Collections.sort(animal, Comparator.comparing(x -> x.split(" ", 0)[1]));
		System.out.println(animal);

		animal.sort(null);
		System.out.println(animal);

		animal.sort(Comparator.reverseOrder());
		System.out.println(animal);

		animal.sort((x, y) -> x.length() - y.length());
		System.out.println(animal);

		animal.add("pig a");
		animal.add("cheetah a");

		Comparator<String> c = Comparator.comparing(x -> ((String) x).split(" ", 0)[1]);
		Collections.sort(animal, c.thenComparing((x, y) -> x.compareTo(y)));
		System.out.println(animal);

	}

}
