/*
An anagram is a type of word play, the result of rearranging the letters of a word or phrase to produce a new word or phrase,
using all the original letters exactly once; e.g., orchestra = carthorse,
A decimal point = I'm a dot in place.
Write a  program that, when started 
1) randomly picks a word w from given list of words,
2) randomly permutes w (thus creating an anagram of w),
3) presents the anagram to the user, and 
4) enters an interactive loop in which the user is invited to guess the original word.
It may be a good idea to work with (say) colour words only. The interaction with the program may look like so:

Colour word anagram: onwbr
Guess the colour word!
black
Guess the colour word!
brown
Correct!
 */

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class Exercise40 {
	
	static ArrayList<String> list = new ArrayList<String>();
	private static Scanner in;
	
	public static ArrayList<String> permutation(String str) { 
	    return permutation("", str); 
	}

	private static ArrayList<String> permutation(String prefix, String str) {
		
		
	    int n = str.length();
	    if (n == 0) list.add(prefix);
	    else {
	        for (int i = 0; i < n; i++)
	            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
	    }
	    
	    return list;
	}

	public static void anagram(String[] x) {

		Random random = new Random();

		int choice = random.nextInt(x.length) + 1;

		String computer_choice = x[choice - 1];
		
		ArrayList<String> anagrams = permutation(computer_choice);
		
		int choice_anagram = random.nextInt(anagrams.size());
		
		String computer_choice_anagram = anagrams.get(choice_anagram);
		
		System.out.println("Colour word anagram: " + computer_choice_anagram);
		
		in = new Scanner(System.in);
		
		String guess = in.next();
		
		while (  !guess.equals(computer_choice) ) {
			
			System.out.println("Guess the colour word!");
			
			in = new Scanner(System.in);
			
			guess = in.next();
		}
		
		System.out.println("Correct!");
		
		
	}

	public static void main(String[] args) {

		String[] words = { "blue", "black", "yellow", "green", "brown", "orange" };

		anagram(words);

	}
}