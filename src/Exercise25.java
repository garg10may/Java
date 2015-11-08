
public class Exercise25 {

	public static String make_ing_form(String x) {

		int len = x.length();
		String s = "";

		if (x.endsWith("ie")) {

			s = x.substring(0, len - 2) + "ying";

		} else if (x.endsWith("e") && !(x.endsWith("ee")) && x.length() != 2) {

			s = x.substring(0, len - 1) + "e";

		} else if ( x.length() ==3 && Exercise4.vowel(x.charAt(1)) && !( Exercise4.vowel( x.charAt(0))) && !(Exercise4.vowel(x.charAt(2))) ) 	{
			
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
