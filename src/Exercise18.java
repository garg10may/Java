/* A pangram is a sentence that contains all the letters of the English alphabet at least once, for example:
 * The quick brown fox jumps over the lazy dog.
 * Your task here is to write a function to check a sentence to see if it is a pangram or not.
 */

public class Exercise18 {

	public static boolean pangram(String x) {

		x.toLowerCase();

		char[] y = x.toCharArray(); //convert to char array since method defined in Exercise 9 uses that or can change there itself to take String

		int status = 0;

		for (char c = 'a'; c <= 'z'; c++) {

			if (Exercise09.is_member(c, y)) {

				status = 1;
			} else {
				status = 0;
				break;
			}

		}
		if (status == 1) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {

		System.out.println(pangram("The quick brown fox jumps over the lazy dog"));
	}
}
