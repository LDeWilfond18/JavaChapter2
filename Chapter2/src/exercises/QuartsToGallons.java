package exercises;

public class QuartsToGallons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int QTS_IN_GALLONS = 4;
		int numberOfQuartsNeeded = 18;
		int gallons;
		int numberOfQuarts;
		
		gallons = numberOfQuartsNeeded / QTS_IN_GALLONS;
		numberOfQuarts = numberOfQuartsNeeded % QTS_IN_GALLONS;
		
		System.out.println("You need " + numberOfQuartsNeeded + " quarts so you have " 
		+ gallons + " gallons and " + numberOfQuarts + " quarts.");
		
	}

}
