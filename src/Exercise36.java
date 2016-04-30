
/*
 * A hapax legomenon (often abbreviated to hapax) is a word which occurs only once in either the written record of a language,
 * the works of an author, or in a single text.
 * Define a function that given the file name of a text will return all its hapaxes. Make sure your program ignores capitalization.
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Exercise36 {

	// using HashMap
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

	// Using Set and Scanner
	public static Set<String> hapax_legomenon2(String x) throws FileNotFoundException {

		Scanner file = new Scanner(new File(x)).useDelimiter("[^a-zA-Z]");

		Set<String> s = new HashSet<String>();

		Set<String> s2 = new HashSet<String>();

		while (file.hasNext()) {

			String word = file.next().trim().toLowerCase();

			if (s.contains(word)) {

				s2.add(word); // words which are more than once

			} else {

				s.add(word);
			}

		}

		file.close();

		s.removeAll(s2);

		return s;

	}

	public static void main(String[] args) throws IOException {

		System.out.println(hapax_legomenon("D://Read Me.txt"));

		System.out.println(hapax_legomenon2("D://Read Me.txt"));
	}
}
