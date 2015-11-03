import java.util.ArrayList;
import java.util.HashMap;

public class Exercise20 {

	public static ArrayList<String> translate(String[] x) {

		ArrayList<String> a = new ArrayList<String>();

		HashMap<String, String> map = new HashMap<String, String>();
		map.put("merry", "god");
		map.put("christmas", "jul");
		map.put("and", "och");
		map.put("happy", "gott");
		map.put("new", "nytt");
		map.put("year", "år");

		for (int i = 0; i < x.length; i++) {

			a.add(map.get(x[i]));

		}

		return a;
	}

	public static void main(String[] args) {

		String[] a = { "happy", "new", "year", "and", "merry", "christmas" };

		System.out.println(translate(a));
	}
}