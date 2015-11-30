/*
 * Define a function that computes the length of a given list or string. It's true there a built in length method but write it yourself. 
 */


public class Exercise03 {

	public static int length(String x) {
		
		int count = 0;
		
		try {
			while (true) {				
				x.charAt(count);
				count ++;		
			}} 
		catch (Exception e) {
			
			//pass
			}
			
		return count;
					
	}

	public static void main(String[] args) {

		System.out.println(length("abxf456hfghcd"));
	}

}
