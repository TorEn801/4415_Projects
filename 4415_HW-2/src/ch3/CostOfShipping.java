package ch3;

import java.util.Scanner;

public class CostOfShipping {

	public static void main(String[] args) {
		// Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt
		System.out.print("Enter the weight of your package: ");
		int weight = input.nextInt();
	
		// Cost variable
		double cost = 0.0;
		
		// If statements to determine valid input or cost
		if (weight <= 0)
			System.out.println("Invalid input");
		else if (weight > 0 && weight <= 1)
			cost = 3.5;
		else if (weight > 1 && weight <= 3)
			cost = 5.5;
		else if (weight > 3 && weight <= 10)
			cost = 8.5;
		else if (weight > 10 && weight <= 20)
			cost = 10.5;
		else
			System.out.println("The package cannot be shipped");
		
		// Prints cost to ship if cost variable changes
		if (!(cost == 0.0))
			System.out.println("The cost to ship the package is: " + cost);

	}

}
