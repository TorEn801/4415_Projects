/*
 * 
 * Assignment: HW-1: Coding Exercise
 * Project: 2.1: Celsius to Fahrenheit
 * Group: HW-Group 5
 * Date: 6/6/2021
 * 
 */

package chapter_2;

import java.util.*;

public class CelsiusToFahrenheit {

	public static void main(String[] args) {
		// Declare Scanner input
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		// Declare variable
		double celsiusInput = 0.0;
		
		// Prompt user for degree in C
		System.out.print("Enter a degree in Celsius: ");
		celsiusInput = input.nextDouble();
		
		// Conversion operation
		double fahrenheit = (9.0 / 5.0) * celsiusInput + 32;
		
		// Print result
		System.out.println(celsiusInput + " Celsius is " + fahrenheit + " Fahrenheit");

	}

}
