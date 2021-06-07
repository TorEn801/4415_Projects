/*
 * 
 * Assignment: HW-1: Coding Exercise
 * Project: 2.6: Sum digits in an integer
 * Group: HW-Group 5
 * Date: 6/6/2021
 * 
 */

package chapter_2;

import java.util.*;

public class SumDigits {

	public static void main(String[] args) {
		// Create Scanner
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		// Declare variables
		int userNum = 0;
		int sumDigit = 0;
		
		// Prompt user for number
		System.out.print("Enter a number between 0 and 1000: ");
		userNum = input.nextInt();
		
		// Operation that extracts and adds end digit and modifies userNum
		for (int i = 0; i < 4; i++) {
			sumDigit += userNum % 10;
			userNum /= 10;
		}
		
		// Result
		System.out.println("The sum of the digits is " + sumDigit);
	}

}
