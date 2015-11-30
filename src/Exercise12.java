/*
 * Define a procedure histogram() that takes a list of integers and prints a histogram to the screen.
 * For example, histogram([4, 9, 7]) should print the following:
 *		****
 *		*********
 * 		*******
 */

public class Exercise12 {

	public static void histogram(int[] l) {

		for (int i = 0; i < l.length; i++) {

			System.out.println(Exercise11.generate_n_chars(l[i], '*'));
		}
	}

	public static void main(String[] args) {

		int[] a = { 4, 9, 7 };

		histogram(a);
	}
}
