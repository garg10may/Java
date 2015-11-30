/*
 * A hapax legomenon (often abbreviated to hapax) is a word which occurs only once in either the written record of a language,
 * the works of an author, or in a single text.
 * Define a function that given the file name of a text will return all its hapaxes. Make sure your program ignores capitalization.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Exercise36 {

	public static ArrayList<String> hapax_legomenon(String x)
			throws IOException {

		BufferedReader br = new BufferedReader(new FileReader(x));

		HashMap<String, Integer> count = new HashMap<String, Integer>();

		String line;

		String regex = "\\w+";

		Pattern p = Pattern.compile(regex);

		ArrayList<String> hapaxes = new ArrayList<String>();

		while ((line = br.readLine()) != null) {

			Matcher m = p.matcher(line);

			while (m.find()) {

				String word = m.group().toLowerCase();

				if (count.get(word) == null) {

					count.put(word, 1);

				}

				else {

					count.put(word, count.get(word) + 1);

				}
			}
		}

		for (Entry<String, Integer> entry : count.entrySet()) {

			if (entry.getValue() == 1) {

				hapaxes.add(entry.getKey());

			}
		}
		
		br.close();

		return hapaxes;
	}

	public static void main(String[] args) throws IOException {

		System.out.println(hapax_legomenon("H://Read Me.txt"));
	}
}
