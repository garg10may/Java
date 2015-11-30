/* Define a function generate_n_chars() that takes an integer n and a character c and returns a string,
 * n characters long, consisting only of c:s. For example, generate_n_chars(5,"x") should return the string "xxxxx".
 */

public class Exercise11 {

	public static String generate_n_chars(int n, char c) {

		String s = "";

		for (int i = 0; i < n; i++) {

			s += c;
		}

		return s;
	}

	public static void main(String[] args) {

		System.out.println(generate_n_chars(5, 'x'));
	}
}
