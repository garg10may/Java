/* Represent a small bilingual lexicon as a Python dictionary in the following fashion 
 * {"merry":"god", "christmas":"jul", "and":"och", "happy":gott", "new":"nytt", "year":"år"}
 *  and use it to translate your Christmas cards from English into Swedish.
 *  That is, write a function translate() that takes a list of English words and returns a list of Swedish words.
 */


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