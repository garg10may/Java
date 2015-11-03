public class Exercise10 {

	public static boolean overlapping(char[] x, char[] y) {

		for (int i = 0; i < x.length; i++) {

			if (Exercise9.is_member(x[i], y)) {

				return true;
			}
		}
		return false;
	}

	public static boolean overlapping2(char[] x, char[] y) {

		for (int i = 0; i < x.length; i++) {

			for (int j = 0; j < y.length; j++) {

				if (x[i] == y[j]) {
					return true;
				}
			}
		}
		return false;

	}

	public static void main(String[] args) {
		
		char[] a = { 'a', 'b', 'c' };
		char[] b = { 'z', 'b', 'y' };
		
		System.out.println(overlapping(a, b));

		System.out.println(overlapping2(a, b));
	}
}
