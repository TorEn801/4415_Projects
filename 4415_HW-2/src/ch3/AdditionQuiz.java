package ch3;

import java.util.*;

public class AdditionQuiz {

	public static void main(String[] args) {
		// Create Scanner instance
		Scanner input = new Scanner(System.in);
		
		// Create Random instance
		Random rand = new Random();
		
		/* Create three int variables and assign random number
		 * the rand.nextInt(10) generates a random number between 0-9
		 * to generate a random number between 0-999 use rand.nextInt(1000)
		 * to exclude 0 and include 1000, you would use:
		 * rand.nextInt(1000)+1
		 */
		int number1 = rand.nextInt(10);
		int number2 = rand.nextInt(10);
		int number3 = rand.nextInt(10);

		// Prompt the user to answer the question
		System.out.printf("What is %d + %d + %d? ", number1, number2, number3);
		int userAnswer = input.nextInt();
		
		// Display if they were wrong or right
		System.out.printf("\n%d + %d + %d = %d is " + (number1 + number2 + number3 == userAnswer),
				number1, number2, number3, userAnswer);
	}

}
