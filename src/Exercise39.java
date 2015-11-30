/* 

Write a program able to play the "Guess the number"-game,
where the number to be guessed is randomly chosen between 1 and 20.
This is how it should work when run in a terminal:

Hello! What is your name?
Tanmay
Well, Tanmay, I am thinking of a number between 1 and 20.
Take a guess.
10
Your guess is too low.
Take a guess.
15
Your guess is too low.
Take a guess.
18
Good job, Tanmay! You guessed my number in 3 guesses!

 */

import java.util.Random;
import java.util.Scanner;

class Exercise39 {

	private static Scanner in;
	private static int count = 1;

	public static void playGame() {

		System.out.println("Hello! What is your name");

		in = new Scanner(System.in);

		String name = in.nextLine();

		System.out.println("Well, " + name + " , I am thinking of a number between 1 and 20");

		System.out.println("Take a guess");

		in = new Scanner(System.in);

		int guess = in.nextInt();

		Random random = new Random();

		int computer_choice = (random.nextInt(19) + 1);

		while ( guess != computer_choice) {

			if (guess < computer_choice) {

				System.out.println("Your guess is too low");

			}

			else {
				
				System.out.println("Your guess is too high");
				
			}
			
			count += 1;
			
			System.out.println("Take a guess");
			
			in = new Scanner(System.in);
			
			guess = in.nextInt();

		}
		
		System.out.format("Good job, %s! You guessed my number in %d guesses!" , name, count);

	}

	public static void main(String[] args) {

		playGame();

	}
}