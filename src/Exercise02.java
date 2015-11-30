/*
 * Define a function max_of_three() that takes three numbers as arguments and returns the largest of them.
 */


public class Exercise02 {
	
	
	public static int max(int a, int b , int c) {
		
		if ( a > b && a > c) {
			
			return a;
		} else if ( b > c ) {
			return b;
		} else {
			return c;
		}
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(max(-12,45,9));
		
	}

}
