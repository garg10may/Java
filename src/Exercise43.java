
/*
An anagram is a type of word play, the result of rearranging the letters of a word
or phrase to produce a new word or phrase, using all the original letters exactly once;
e.g., orchestra = carthorse. Using the word list at http://www.puzzlers.org/pub/wordlists/unixdict.txt,
write a program that finds the sets of words that share the same characters that contain the most words in them.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Exercise43 {

	private static String[] words;

	public static String sortString(String string) {

		char[] charArray = string.toCharArray();

		Arrays.sort(charArray);

		String sorted = new String(charArray);

		return sorted;
	}

	public static HashMap<String, ArrayList<String>> makeEmptyHashMap(String text) {

		words = text.split(" ");

		HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();

		for (String word : words) {

			map.put(sortString(word), new ArrayList<String>());
		}

		return map;
	}

	public static HashMap<String, ArrayList<String>> makeHashMap(HashMap<String, ArrayList<String>> map2) {

		for (String word : words) {

			map2.get(sortString(word)).add(word);

		}

		return map2;

	}

	public static String getUrlContents(String theUrl) throws IOException {

		URL url = new URL(theUrl);

		URLConnection urlConnection = url.openConnection();

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));

		String line;
		String text = "";

		while ((line = bufferedReader.readLine()) != null) {

			text += line + " ";
		}

		bufferedReader.close();

		return text;
	}
	
	public static Integer findMaxKey(HashMap<String, ArrayList<String>> map) {

		ArrayList<Integer> contentSize = new ArrayList<Integer>();

		for (Map.Entry<String, ArrayList<String>> entry : map.entrySet()) {

			contentSize.add(entry.getValue().size());
		}

		return Collections.max(contentSize);
	}

	public static ArrayList<ArrayList<String>> findMaxAnagram(Integer i, HashMap<String, ArrayList<String>> map) {

		ArrayList<ArrayList<String>> maxAnagram = new ArrayList<ArrayList<String>>();

		for (Map.Entry<String, ArrayList<String>> entry : map.entrySet()) {

			if (entry.getValue().size() == i) {

				maxAnagram.add(entry.getValue());
			}

		}
		return maxAnagram;
	}

	public static void main(String[] args) {

		try {
			String text = getUrlContents("http://www.puzzlers.org/pub/wordlists/unixdict.txt");

			HashMap<String, ArrayList<String>> map = makeEmptyHashMap(text);

			HashMap<String, ArrayList<String>> map1 = makeHashMap(map);
			
			Integer i = findMaxKey(map1);
			
			ArrayList<ArrayList<String>> result = findMaxAnagram(i, map1);
			
			for ( ArrayList<String> out : result) {
				
				System.out.println(out);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
