/*
 * In English, the present participle is formed by adding the suffix -ing to the infinite form: go -> going. A simple set of heuristic rules can be given as follows:
If the verb ends in e, drop the e and add ing (if not exception: be, see, flee, knee, etc.)
If the verb ends in ie, change ie to y and add ing
For words consisting of consonant-vowel-consonant, double the final letter before adding ing
By default just add ing
Your task in this exercise is to define a function make_ing_form() which given a verb in infinitive
form returns its present participle form. Test your function with words such as lie, see, move and hug. 
However, you must not expect such simple rules to work for all cases.
 */


public class Exercise25 {

	public static String make_ing_form(String x) {

		int len = x.length();
		String s = "";

		if (x.endsWith("ie")) {

			s = x.substring(0, len - 2) + "ying";

		} else if (x.endsWith("e") && !(x.endsWith("ee")) && x.length() != 2) {

			s = x.substring(0, len - 1) + "e";

		} else if ( x.length() ==3 && Exercise04.vowel(x.charAt(1)) && !( Exercise04.vowel( x.charAt(0))) && !(Exercise04.vowel(x.charAt(2))) ) 	{
			
			s  = x + x.charAt(2) + "ing";
		} else {
			
			s = x + "ing";
		}
		return s;
	}
	
	public static void main(String[] args) {
		
		
		String test1 = "lie";
		String test2 = "see";
		String test3 = "move";
		String test4 = "hug";
		
		System.out.println(make_ing_form(test1));
		System.out.println(make_ing_form(test2));
		System.out.println(make_ing_form(test3));
		System.out.println(make_ing_form(test4));
	}
}
