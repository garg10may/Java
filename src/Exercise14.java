import java.util.Arrays;

/*
import java.util.ArrayList;

public class Exercise14 {

	private static ArrayList<Integer> a = new ArrayList<Integer>();
	
	public static ArrayList<Integer> map(String[] x) {

		for (int i = 0; i < x.length; i++) {

			a.add(x[i].length());

		}

		return a;
	}

	public static void main(String[] args) {

		String[] string = { "hello", "how", "r", "you" };

		System.out.println(map(string));
	}

}
 */

//alter
public class Exercise14 {

	public static int[] map(String[] x) {

		// initialize with size equal to length, since for array size is fixed
		int[] a = new int[x.length];

		for (int i = 0; i < x.length; i++) {
			
			a[i] = x[i].length();
		}

		return a;
	}

	public static void main(String[] args) {

		String[] a = { "hello", "how", "r", "you" };

		System.out.println(Arrays.toString(map(a)));
	}

}
