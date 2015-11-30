/*
 * Define a function max() that takes two numbers as arguments and returns the largest of them.
 */


public class Exercise01 {

	public static int max(int a, int b) {

		if (a > b) {
			return a;
		} else {
			return b;
		}
	}

	public static void main(String[] args) {

		System.out.println(max(232, 3));

	}

}
