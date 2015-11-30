/* Write a function filter_long_words() that takes a list of words and an integer n and returns the list of words that are longer than n.
 */

import java.util.ArrayList;


public class Exercise16 {

	
	public static ArrayList<String> filter_long_words(int n, String[] x) {
		
		ArrayList<String> a = new ArrayList<String>();
		
		for (int i=0; i<x.length; i++) {
			
			if ( x[i].length() > n) {
				
				a.add(x[i]);
			}
			
		}
		return a;
	}
	
	public static void main(String[] args) {
		
		String[] a = {"how", "r", "u", "beautiful" };
		
		System.out.println(filter_long_words(3, a));
	}
}


