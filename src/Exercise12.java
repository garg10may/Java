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
