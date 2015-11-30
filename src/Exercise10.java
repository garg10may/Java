/*
 * Define a function overlapping() that takes two lists and returns True
 * if they have at least one member in common, False otherwise. You may use your is_member() function,
 * but for the sake of the exercise, you should (also) write it using two nested for-loops.
 */

public class Exercise10 {

	/// Using is_member() function
	public static boolean overlapping(char[] x, char[] y) {

		for (int i = 0; i < x.length; i++) {

			if (Exercise09.is_member(x[i], y)) {

				return true;
			}
		}
		return false;
	}

	/// Using two nested for loops
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
