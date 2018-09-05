package exercises;

import java.util.Scanner;

public class QuartsToGallonsInteractive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int QTS_IN_GALLONS = 4;
		int numberOfQuartsNeeded;
		int gallons;
		int numberOfQuarts;
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many quarts do you need? ");
		numberOfQuartsNeeded = input.nextInt();
		
		gallons = numberOfQuartsNeeded / QTS_IN_GALLONS;
		numberOfQuarts = numberOfQuartsNeeded % QTS_IN_GALLONS;
		
		System.out.println("You need " + numberOfQuartsNeeded + " quarts so you have " 
				+ gallons + " gallons and " + numberOfQuarts + " quarts.");
	}

}
