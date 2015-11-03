public class Exercise7 {

	public static String reverse(String x) {

		String s = "";

		for (int i = x.length() - 1; i >= 0; i--) {

			s += x.charAt(i);

		}

		return s;
	}

	public static void main(String[] args) {

		System.out.println(reverse("I am testing"));
	}
}
