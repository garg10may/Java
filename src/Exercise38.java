/* Write a program that will calculate the average word length of a text stored in a file
 * (i.e the sum of all the lengths of the word tokens in the text, divided by the number of word tokens).
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;



class Exercise38 {

	private static double total_words;
	private static double total_characters;

	public static void calculateAverageWordLength(String filename) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader(filename));

		String line;

		total_words = 0;

		total_characters = 0;

		while ((line = br.readLine()) != null) {

			String[] words = line.split("\\s");

			total_words += words.length;

			for (String word : words) {

				total_characters += word.length();
			}

		}

		br.close();

		System.out.format("Average word length is %f ", (total_characters / total_words));

	}

	public static void main(String[] args) {

		try {
			calculateAverageWordLength("Exercise38.in");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}