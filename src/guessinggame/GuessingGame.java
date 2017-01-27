package guessinggame;

import java.util.Random;

/**
 * Game of guessing a secret number. The Users can choose the maximum number by themselves.
 * @author Issaree Srisomboon
 *
 */

public class GuessingGame {
	private int upperBound;
	private int secret;
	private String hint;
	private int cnt;
	
	/**
	 * Initialize a new game.
	 * @param upperBound is the max value for the secret number. (>1)
	 */

	public GuessingGame(int upperBound) {
		this.upperBound = upperBound;
		this.secret = getRandomNumber(upperBound);
		this.hint = "I'm Thinking of a number between 1 and " + this.upperBound;
		this.cnt = 0;
	}
	
	/**
	 * Check if a number from user is same as the secret number or not.
	 * @param number that user guesses
	 * @return true if a number from user is same as the secret number and 
	 * return false if a number from user is not same as the secret number.
	 */
	
	public boolean guess(int number) {
		if (this.secret == number) {
			this.hint = "Right! The secret is " + this.secret + ".";
			this.cnt++;
			return true;
		} else if (this.secret < number) {
			this.hint = "Sorry, too large.";
			this.cnt++;
			return false;
		} else
			this.hint = "Sorry too small.";
		this.cnt++;
		return false;
	}
	
	/**
	 * Return a hint based on the most recent guess.
	 * @return hint based on most recent guess.
	 */
	
	public String getHint() {
		return hint;
	}
	
	/**
	 * Set hint to be current hint.
	 * @param hint based on most recent guess.
	 */
	
	public void setHint(String hint) {
		this.hint = hint;
	}
	
	/**
	 * Create a random  number between 1 and limit.
	 * @param limit is the upper limit for random number.
	 * @return a random number between 1 and limit.
	 */
	
	public int getRandomNumber(int limit) {
		long seed = System.currentTimeMillis();
		Random rand = new Random(seed);
		return rand.nextInt(limit) + 1;
	}
	
	/**
	 * Return a value of upperBound from the User.
	 * @return a value of upperBound from the User.
	 */
	
	public int getUpperBound() {
		return upperBound;
	}
	
	/**
	 * Set an upperBound
	 * @param upperBound is the maximum number from 1 that the user wants to guess.
	 */
	
	public void setUpperBound(int upperBound) {
		this.upperBound = upperBound;
	}
	
	/**
	 * Return counter of guessing for 1 game.
	 * @return counter of guessing for 1 game.
	 */
	
	public int getCount() {
		return this.cnt;
	}
}

