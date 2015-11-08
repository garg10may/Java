public class Exercise24 {

	public static String make_3sg_form(String x) {

		String s = "";

		if (x.endsWith("y")) {

			s = x.substring(0, x.length()-1 ) + "ies";

		} else if (x.endsWith("o") || x.endsWith("ch") || x.endsWith("s")
				|| x.endsWith("sh") || x.endsWith("x") || x.endsWith("z")) {

			s = x + "es";

		} else if (x.endsWith("sh") || x.endsWith("ch")) {

			s = x + "es";
		} else {

			s = x + "s";
		}

		return s;
	}

	public static void main(String[] args) {

		String test1 = "try";
		String test2 = "brush";
		String test3 = "run";
		String test4 = "fix";

		System.out.println(make_3sg_form(test1));
		System.out.println(make_3sg_form(test2));
		System.out.println(make_3sg_form(test3));
		System.out.println(make_3sg_form(test4));
	}
}
