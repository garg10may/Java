
public class Exercise6 {
	
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
