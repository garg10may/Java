/*Write a version of a palindrome recognizer that also accepts phrase palindromes such as
 *  "Go hang a salami I'm a lasagna hog.", "Was it a rat I saw?", 
 *  "Step on no pets", "Sit on a potato pan, Otis", "Lisa Bonet ate no basil",
 *  "Satan, oscillate my metallic sonatas", "I roamed under it as a tired nude Maori", 
 *  "Rise to vote sir", or the exclamation "Dammit, I'm mad!". 
 * Note that punctuation, capitalization, and spacing are usually ignored.
 */

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

		if (Exercise08.is_palindrome(s)) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {

		System.out.println(palindrome("Was it a rat I saw?"));
	}
}
