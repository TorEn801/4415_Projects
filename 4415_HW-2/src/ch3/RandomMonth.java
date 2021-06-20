package ch3;

import java.util.Random;

public class RandomMonth {

	public static void main(String[] args) {
		// Create Random instance
		Random rand = new Random();
		
		// Generate random number between 1-12
		int monthNum = rand.nextInt(12) + 1;
		
		// Create String variable for month name
		String monthName = "";
		
		// Create switch 
		switch (monthNum) {
		case 1: 
			monthName = "January";
			break;
		case 2:
			monthName = "February";
			break;
		case 3:
			monthName = "March";
			break;
		case 4:
			monthName = "April";
			break;
		case 5:
			monthName = "May";
			break;
		case 6:
			monthName = "June";
			break;
		case 7:
			monthName = "July";
			break;
		case 8:
			monthName = "August";
			break;
		case 9:
			monthName = "September";
			break;
		case 10:
			monthName = "October";
			break;
		case 11:
			monthName = "November";
			break;
		case 12:
			monthName = "December";
			break;
		default:
			System.out.println("Error");			
		}
		
		// Print result
		System.out.println("The month is " + monthName);

	}

}
