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
