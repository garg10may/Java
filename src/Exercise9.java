public class Exercise9 {

	public static boolean is_member(char x, char[] y) {

		for (int i = 0; i < y.length; i++) {

			if (x == y[i]) {

				return true;

			}
		}
		return false;

	}

	public static void main(String[] args) {

//		int[] a = { 2, 3, 4, 8 };
		char[] b = { 'c', 'z', 'a' };

	//	System.out.println(is_member(1, a));
		System.out.println(is_member('h', b));
	}
}
