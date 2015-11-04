import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise23 {

	public static String correct(String x) {

		String regex2 = "[.](?=[A-Z])";

		String s = "";

		Pattern p2 = Pattern.compile(regex2);

		Matcher m2 = p2.matcher(x);

		// First add a splace after each .
		s = m2.replaceAll(". ");

		String regex = " +";

		Pattern p = Pattern.compile(regex);

		Matcher m = p.matcher(s);

		s = m.replaceAll(" ");

		return s;

	}

	public static void main(String[] args) {

		System.out.println(correct("This   is  very funny and   cool.Indeed! Pi value is 3.14"));
	}

}
