class Exercise05 {

	public static void translate(String x) {

		String out = "";

		for (int i = 0; i < x.length(); i++) {

			if (Exercise4.vowel(x.charAt(i)) || x.charAt(i) == ' ') {

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
