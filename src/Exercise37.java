import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/* Write a program that given a text file will create a new text file in which all
 *  the lines from the original file are numbered from 1 to n (where n is the number of lines in the file).
 */

class Exercise37 {

	public static void numberFile(String filename) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader(filename));

		BufferedWriter bw = new BufferedWriter(new FileWriter("Exercise37.out"));

		String line;
		int count = 1;
		
		while ((line = br.readLine()) != null) {
			
			bw.write(count + " " + line + "\n");
			
			count ++;
		}
		
		br.close();
		bw.close();

	}

	public static void main(String[] args) {
		
		try {
			numberFile("Exercise37.in");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}