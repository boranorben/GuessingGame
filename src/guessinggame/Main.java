package guessinggame;

/**
 * Run the guessing game to guess the secret number.
 * @author Issaree Srisomboon
 *
 */
public class Main {
	
	/**
	 * Create objects and start the game.
	 * @param args
	 */
	public static void main(String[] args) {
		GuessingGame game = new GuessingGame(10);
		GameConsole ui = new GameConsole();
		ui.play(game);
	}
}
