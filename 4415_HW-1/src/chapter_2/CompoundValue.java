/*
 * 
 * Assignment: HW-1: Coding Exercise
 * Project: 2.13: Compound Value
 * Group: HW-Group 5
 * Date: 6/6/2021
 * 
 */

package chapter_2;

import java.util.*;

public class CompoundValue {

	public static void main(String[] args) {
		// Declare Scanner input
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		// Declare variables
		double userSavings = 0.0;
		double compoundSavings = 0.0;
		final double RATE = 0.00417;
		
		// Prompt user to enter monthly savings deposit amount
		System.out.print("Enter the monthly savings amount: ");
		userSavings = input.nextDouble();
		
		// Annuity due formula to calculate amount after 6 months
		compoundSavings = userSavings * ((Math.pow((1 + RATE),6) - 1 ) / RATE) * (1 + RATE);
		
		// Result, in printf to get 2 decimal points
		System.out.printf("After the sixth month, the account value is $%.2f", compoundSavings);
	}

}
