public class Exercise8 {

	public static boolean is_palindrome(String x) {

		if (Exercise7.reverse(x).equals(x)) {

			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		System.out.println(is_palindrome("radar"));
	}

}
