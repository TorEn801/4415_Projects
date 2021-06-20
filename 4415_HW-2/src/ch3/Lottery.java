package ch3;

import java.util.*;

public class Lottery {

	public static void main(String[] args) {
		// Generate three-digit lottery number
		Random rand = new Random();
		int lottery = rand.nextInt(900) + 100;

		// Prompt the user to enter a guess
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your lottery pick (three digits): ");
		int guess = input.nextInt();
		
		int tempLottery = lottery;
		int tempGuess = guess;
		
		// Get digits from lottery
		int lotteryDigit1 = tempLottery % 10;
		tempLottery /= 10;
		int lotteryDigit2 = tempLottery % 10;
		tempLottery /=10;
		int lotteryDigit3 = tempLottery % 10;
		
		// Get the digits from guess
		int guessDigit1 = tempGuess % 10;
		tempGuess /= 10;
		int guessDigit2 = tempGuess % 10;
		tempGuess /= 10;
		int guessDigit3 = tempGuess % 10;
		
		System.out.println("The lottery number is : " + lottery);
		
		// Check the guess
		if (guess == lottery)
			System.out.println("Exact match: you win $10,000!");
		else if (Arrays.asList(lotteryDigit1, lotteryDigit2, lotteryDigit3).contains(guessDigit1)
				&& Arrays.asList(lotteryDigit1, lotteryDigit2, lotteryDigit3).contains(guessDigit2)
				&& Arrays.asList(lotteryDigit1, lotteryDigit2, lotteryDigit3).contains(guessDigit3))
			System.out.println("Match all digits: you win $3,000!");
		else if (Arrays.asList(lotteryDigit1, lotteryDigit2, lotteryDigit3).contains(guessDigit1)
				|| Arrays.asList(lotteryDigit1, lotteryDigit2, lotteryDigit3).contains(guessDigit2)
				|| Arrays.asList(lotteryDigit1, lotteryDigit2, lotteryDigit3).contains(guessDigit3))
			System.out.println("Match at least one digit: you win $1,000!");
		else
			System.out.println("Sorry, no match");
	}

}
