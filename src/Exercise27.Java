/*
 * According to Wikipedia, a semordnilap is a word or phrase that spells a different word or phrase backwards. 
 * ("Semordnilap" is itself "palindromes" spelled backwards.) Write a semordnilap recogniser that accepts a 
 * file name (pointing to a list of words) from the user and finds and prints all pairs of words that are
 * semordnilaps to the screen. For example, if "stressed" and "desserts" is part of the word list, 
 * the the output should include the pair "stressed desserts". Note, by the way, that each pair by itself forms a palindrome!
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Exercise27 {

	public static void semordnilap(String x) throws IOException {

		ArrayList<String> list = new ArrayList<>();

		String line = "";

		FileReader fr = new FileReader(x);

		BufferedReader br = new BufferedReader(fr);

		while ((line = br.readLine()) != null) {

			list.add(line);

		}

		for (int i = 0; i < list.size(); i++) {
			
			String line2 = list.get(i);
			
			list.remove(i);
			
			String reversed_line = Exercise07.reverse( line2);

			//System.out.println(Exercise07.reverse( list.get(i) ) );

			if ( list.contains( reversed_line ) ) {
				
				System.out.println(line2);
				
				System.out.println( reversed_line) ;
			}
		}
	}

	public static void main(String[] args) throws IOException {

		semordnilap("H:\\Read Me.txt");
	}
}
