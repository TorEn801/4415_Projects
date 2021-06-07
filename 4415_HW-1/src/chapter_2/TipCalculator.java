/*
 * 
 * Assignment: HW-1: Coding Exercise
 * Project: 2.5: Calculate Tips
 * Group: HW-Group 5
 * Date: 6/6/2021
 * 
 */

package chapter_2;

import java.util.*;

public class TipCalculator {

	public static void main(String[] args) {
		// Declare Scanner input
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		// Declare and initialize all variables
		double subtotal = 0.0;
		double gratuity = 0.0;
		double tip = 0.0;
		double total = 0.0;
		
		// Prompted the user to enter subtotal and gratuity separately
		System.out.print("Enter the subtotal: ");
		subtotal = input.nextDouble();
		// gratuity = input.nextDouble() / 100;
		
		System.out.print("Enter the gratuity rate: ");
		gratuity = input.nextDouble() / 100;
		
		// Calculated tip amount
		tip = (subtotal * gratuity);
		
		// Calculated total amount
		total = (subtotal + tip);
		
		// Used printf instead of println to specify 2 decimal points
		System.out.printf("The gratuity is $%.2f and the total is $%.2f", tip, total);

	}

}
