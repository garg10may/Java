/*
In a game of Lingo, there is a hidden word, five characters long.
The object of the game is to find this word by guessing, and in return receive two kinds of clues:
1) the characters that are fully correct, with respect to identity as well as to position, and
2) the characters that are indeed present in the word, but which are placed in the wrong position.
Write a program with which one can play Lingo. Use square brackets to mark characters correct in the sense of 1),
and ordinary parentheses to mark characters correct in the sense of 2). 
Assuming, for example, that the program conceals the word "tiger", you should be able to interact with it in the following way:

Guess the five letter word!
snake
Clue: snak(e)
fiest
Clue: f[i](e)s(t)
times
Clue: [t][i]m[e]s
tiger
You guessed it correct!


*/

import java.util.Scanner;

class Exercise41 {

	public static void lingo(String x) {

		System.out.println("Guess the five letter word!");

		String out = "";

		Scanner in = new Scanner(System.in);

		String word = in.next();

		while (!word.equals(x)) {

			out = "Clue: ";

			for (int i = 0; i < word.length(); i++) {

				if (x.charAt(i) == word.charAt(i)) {

					out += "[" + x.charAt(i) + "]";

				} else if (x.contains(String.valueOf(word.charAt(i)))) {

					out += "(" + word.charAt(i) + ")";
				} else {

					out += word.charAt(i);
				}

			}

			System.out.println(out);

			in = new Scanner(System.in);

			word = in.next();

		}

		System.out.println("You guessed it correct!");

		in.close();
	}

	public static void main(String[] args) {

		lingo("boxer");
	}
}