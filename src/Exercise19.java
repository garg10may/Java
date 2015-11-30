//It's a very simple program but is the only program in the world that is written in every programming language ever coined.
//That's more than 400+, http://www.99-bottles-of-beer.net/lyrics.html

/* "99 Bottles of Beer" 
 * It is a traditional song in the United States and Canada.
 * It is popular to sing on long trips, as it has a very repetitive format which is easy to memorize, and can take a long time to sing.
 * The song's simple lyrics are as follows:
 
 	99 bottles of beer on the wall, 99 bottles of beer.
  	Take one down, pass it around, 98 bottles of beer on the wall
  	
 * The same verse is repeated, each time with one fewer bottle. 
 * The song is completed when the singer or singers reach zero.
 * Write a program to generate all the verses of the song.

*/
public class Exercise19 {

	public static void song() {

		System.out.println("99 bottles of beer on the wall, 99 bottles of beer.");

		for (int i = 98; i >= 0; i--) {

			System.out.println("Take one down, pass it around, " + i + " bottles of beer on the wall");
		}
	}

	public static void main(String[] args) {

		song();
	}
}
