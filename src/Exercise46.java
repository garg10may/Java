/*	
An alternate is a word in which its letters, taken alternatively in a strict sequence, and used in the same order as the original word,
make up at least two other words. All letters must be used, but the smaller words are not necessarily of the same length.
For example, a word with seven letters where every second letter is used will produce a four-letter word and a three-letter word.
Here are two examples:
  "board": makes "bad" and "or".
  "waists": makes "wit" and "ass".
Using the word list at http://www.puzzlers.org/pub/wordlists/unixdict.txt,
write a program that goes through each word in the list and tries to make two smaller words using every second letter.
The smaller words must also be members of the list. Print the words to the screen in the above fashion.
*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashSet;

public class Exercise46 {

	public static void alternate(String x) throws IOException {

		URL url = new URL(x);
		URLConnection conn = url.openConnection();

		InputStreamReader in = new InputStreamReader(conn.getInputStream());

		BufferedReader br = new BufferedReader(in);

		HashSet<String> set = new HashSet<String>();

		while (br.readLine() != null) {

			set.add(br.readLine());

		}

		for (String word : set) {

			String alternate = "";

			String alternate2 = "";

			for (int i = 0; i < word.length(); i += 2) {

				alternate += word.charAt(i);

			}

			for (int i = 1; i < word.length(); i += 2) {

				alternate2 += word.charAt(i);

			}

			if (set.contains(alternate2) && alternate.length() > 2 && set.contains(alternate)
					&& alternate.length() > 2) {

				System.out.printf("%s: makes %s and %s\n", word, alternate, alternate2);
			}
		}

	}

	public static void main(String[] args) {

		try {
			alternate("http://www.puzzlers.org/pub/wordlists/unixdict.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}