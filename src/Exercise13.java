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
