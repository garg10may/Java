/*
 * Write a function find_longest_word() that takes a list of words and returns the length of the longest one.
 */

public class Exercise15 {
	
	
	public static int find_longest_word ( String[] x) {
		
		return Exercise13.max_in_list(Exercise14.map(x));
	}
	
	public static void main(String[] args) {
		
		String[] a = {"hello", "how", "r"};
		
		System.out.println(find_longest_word(a));
	}

}
