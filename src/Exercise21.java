/*
 * Write a function char_freq() that takes a string and builds a frequency listing of the characters contained in it.
 * Try it with something like char_freq("abbabcbdbabdbdbabababcbcbab").
 */


import java.util.HashMap;
import java.util.Map;

public class Exercise21 {

	public static Map<Character, Integer> initialize_map(String x, Map<Character, Integer> m) {

		for (int i = 0; i < x.length(); i++) {
			
			char c = x.charAt(i);

			if (m.get(c) == null) {

				m.put(c, 0);
			}

		}
		
		return m;

	}

	public static Map<Character, Integer> char_freq(String x) {

		Map<Character, Integer> m = new HashMap<Character, Integer>();

		m = initialize_map(x, m);

		for (int i = 0; i < x.length(); i++) {

			char c = x.charAt(i);

			if (m.get(c) != null) {

				m.put(c, m.get(c) + 1);
			}
		}

		return m;
	}

	public static void main(String[] args) {

		System.out.println(char_freq("abbabcbdbabdbdbabababcbcbab"));
	}
}
