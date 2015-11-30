/*
 * Define a function is_palindrome() that recognizes palindromes
 * (i.e. words that look the same written backwards). For example, is_palindrome("radar") should return True.
 */


public class Exercise08 {

	public static boolean is_palindrome(String x) {

		if (Exercise07.reverse(x).equals(x)) {

			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		System.out.println(is_palindrome("radar"));
	}

}
