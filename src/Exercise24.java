/*
 * The third person singular verb form in English is distinguished by the suffix -s,
 *  which is added to the stem of the infinitive form: run -> runs.
 *  A simple set of rules can be given as follows:
If the verb ends in y, remove it and add ies
If the verb ends in o, ch, s, sh, x or z, add es
By default just add s
Your task in this exercise is to define a function make_3sg_form() which given a verb
in infinitive form returns its third person singular form. Test your function with words like
try, brush, run and fix. Note however that the rules must be regarded as heuristic,
in the sense that you must not expect them to work for all cases.
Tip: Check out the string method endswith().
 */


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
