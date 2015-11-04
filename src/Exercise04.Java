public class Exercise4 {

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
