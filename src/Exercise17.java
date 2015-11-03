public class Exercise17 {

	public static boolean palindrome(String x) {

		x = x.toLowerCase();

		String s = "";

		for (int i = 0; i < x.length(); i++) {

			char c = x.charAt(i);

			if (Character.isLetter(c)) {

				s += c;
			}
		}

		if (Exercise8.is_palindrome(s)) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {

		System.out.println(palindrome("Was it a rat I saw?"));
	}
}
