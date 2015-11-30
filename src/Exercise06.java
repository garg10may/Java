/*
 * Define a function sum() and a function multiply() that sums and multiplies (respectively) all the numbers in a list of numbers.
 * For example, sum([1, 2, 3, 4]) should return 10, and multiply([1, 2, 3, 4]) should return 24.
 */

public class Exercise06 {
	
	public static int multiply(int[] l) {
		int m = 1;
		
		for ( int i =0; i < l.length; i++) {
			
			m *= l[i];
		}
		
		return m;
	}

	public static int sum(int[] l) {

		int s = 0;

		for (int i = 0; i < l.length; i++) {

			s += l[i];

		}
		return s;
	}

	public static void main(String[] args) {

		int[] a = { 2, 3, 4, 5 };

		System.out.println(sum(a));
		System.out.println(multiply(a));
	}
}
