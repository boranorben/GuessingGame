package guessinggame;

import java.util.Scanner;

/**
 * For performing input and output of the game.
 * @author Issaree Srisomboon
 *
 */
public class GameConsole {
	
	/**
	 * The play method plays a game using input from a user.
	 * @param game that I want to play.
	 * @return the correct number from guessing.
	 */
	public int play(GuessingGame game) {
		Scanner input = new Scanner(System.in);
		System.out.println("Guessing Game");
		System.out.println(game.getHint());
		int number = 0;
		while (!game.getHint().substring(0, 1).equals("R")) {
			System.out.print("What is your guess? ");
			number = input.nextInt();
			game.guess(number);
			System.out.println(game.getHint());
		}
		return number;
	}
}
