/*
 * Write a function that takes a character (i.e. a string of length 1) and returns True if it is a vowel, False otherwise.
 */

public class Exercise04 {

	public static boolean vowel(char x) {

		if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {

		System.out.println(vowel('a'));
	}

}
