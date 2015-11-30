/*The function max() from exercise 1) and the function max_of_three() from exercise 2) will only work for two and three numbers, respectively.
 *But suppose we have a much larger number of numbers, or suppose we cannot tell in advance how many they are?
 *Write a function max_in_list() that takes a list of numbers and returns the largest one.
 */


public class Exercise13 {

	public static int max_in_list(int[] a) {

		int m = 0;

		for (int i = 0; i < a.length; i++) {

			if (a[i] > m) {

				m = a[i];
			}

		}

		return m;
	}

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 89, 65 };

		System.out.println(max_in_list(a));
	}

}
