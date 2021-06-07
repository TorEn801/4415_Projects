/*
 * 
 * Assignment: HW-1: Coding Exercise
 * Project: 2.21: Calculate Future Investment Value
 * Group: HW-Group 5
 * Date: 6/6/2021
 * 
 */

package chapter_2;

import java.util.Scanner;

public class FutureValueCalc {

	public static void main(String[] args) {
		// Scanner input
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		// Declare variables
		double futureInvestmentValue = 0.0;
		double investmentAmount = 0.0;
		double apr = 0.0;
		double monthlyRate = 0.0;
		int numYears = 0;
		
		// Prompt user for variable amounts
		System.out.print("Enter investment amount: ");
		investmentAmount = input.nextDouble();
		
		System.out.print("Enter annual interest rate in percentage: ");
		apr = input.nextDouble();
		// APR to monthly interest rate
		monthlyRate = (apr / 100) / 12;
		
		System.out.print("Enter number of years: ");
		numYears = input.nextInt();
		
		// Calculation operation
		futureInvestmentValue = investmentAmount * (Math.pow((1 + monthlyRate), numYears * 12));
		
		// Print result
		System.out.printf("Future value is $%.2f", futureInvestmentValue);
		
	}

}
