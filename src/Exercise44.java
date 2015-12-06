import java.util.ArrayList;
import java.util.Random;

/*
Generate a string with N opening brackets ("[") and N closing brackets ("]"), in some arbitrary order.
Determine whether the generated string is balanced; that is,
whether it consists entirely of pairs of opening/closing brackets (in that order),
none of which mis-nest.

Examples:

   []        OK   ][        NOT OK
   [][]      OK   ][][      NOT OK
   [[][]]    OK   []][[]    NOT OK
*/

public class Exercise44 {

	public static ArrayList<String> constructBrackets(Integer n) {

		ArrayList<String> brackets = new ArrayList<String>();

		Random random = new Random();

		String[] choices = { "[", "]" };

		int choice = choices.length;

		for (int i = 0; i < n; i++) {

			Integer randInt = random.nextInt(choice);

			brackets.add(choices[randInt]);

		}

		return brackets;
	}

	public static String find_balanced(Integer n) {

		int count_left = 0;
		int count_right = 0;

		ArrayList<String> brackets = constructBrackets(n);

		for (String bracket : brackets) {

			if (count_left == count_right) {

				if (bracket.equals("]")) {

					return brackets.toString() + " not balanced";

				}

				if (bracket.equals("[")) {

					count_left += 1;
				}

				else {

					count_right += 1;
				}
			}

		}

		if (count_left == count_right) {

			return brackets.toString() + " balanced";
		} else {

			return brackets.toString() + " not balanced";

		}

	}

	public static void main(String[] args) {

		System.out.println(find_balanced(2));
	}
}