/*
 * Write a function translate() that will translate a text into "rövarspråket" (Swedish for "robber's language"). 
 * That is, double every consonant and place an occurrence of "o" in between. 
 * For example, translate("this is fun") should return the string "tothohisos isos fofunon".
 */

class Exercise05 {

	public static void translate(String x) {

		String out = "";

		for (int i = 0; i < x.length(); i++) {

			if (Exercise04.vowel(x.charAt(i)) || x.charAt(i) == ' ') {

				out += x.charAt(i);

			} else {

				out += x.charAt(i) + "o" + x.charAt(i);
			}

		}

		System.out.println(out);
	}

	public static void main(String[] args) {

		translate("this is fun");
	}
}
