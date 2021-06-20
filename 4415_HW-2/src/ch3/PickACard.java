package ch3;

import java.util.Random;

public class PickACard {

	public static void main(String[] args) {
		// Random instance
		Random rand = new Random();
		
		// Randomly generate values
		int rankNum = rand.nextInt(13) + 1;
		int suitNum = rand.nextInt(4) + 1;
		
		// Assign a String variable to the Values
		String rank = "";
		String suit = "";
		
		/*
		 * Switch operation where the numeric value of the int rankNum
		 * corresponds to a String value. For 1, and 11-13 they get word
		 * values instead of their numerical value.
		 */
		switch (rankNum) {
		case 1:
			rank = "Ace";
			break;
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
			rank = String.valueOf(suitNum);
			break;
		case 11:
			rank = "Jack";
			break;
		case 12:
			rank = "Queen";
			break;
		case 13:
			rank = "King";
			break;
		default: 
			System.out.println("Error");
		}
		
		// Same as above except numerical value corresponds to a suit
		switch (suitNum) {
		case 1:
			suit = "Spades";
			break;
		case 2:
			suit = "Hearts";
			break;
		case 3: 
			suit = "Clubs";
			break;
		case 4:
			suit = "Diamonds";
			break;
		default:
			System.out.println("Error");
		}
		
		// Print result
		System.out.printf("The card you picked is the %s of %s", rank, suit);

	}

}
