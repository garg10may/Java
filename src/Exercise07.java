/*
 * Define a function reverse() that computes the reversal of a string.
 * For example, reverse("I am testing") should return the string "gnitset ma I".
 */

public class Exercise07 {

	public static String reverse(String x) {

		String s = "";

		for (int i = x.length() - 1; i >= 0; i--) {

			s += x.charAt(i);

		}

		return s;
	}

	public static void main(String[] args) {

		System.out.println(reverse("I am testing"));
	}
}
