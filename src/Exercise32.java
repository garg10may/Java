/*
 * Write a version of a palindrome recognizer that accepts a file name from the user, reads each line,
 * and prints the line to the screen if it is a palindrome.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercise26 {
	
	public static void palindrome( String x ) throws IOException {
		
		String line;
		
		FileReader fr  = new FileReader(x);
		
		BufferedReader br = new BufferedReader( fr);
		
		while ( ( line = br.readLine() )!= null ) {
			
			
			if (Exercise08.is_palindrome(line)) {
				
				System.out.println(line);
			}
		}
		
		br.close();
	}

	public static void main(String[] args) throws IOException {
		
		palindrome("H:\\Read Me.txt");
	}
}
