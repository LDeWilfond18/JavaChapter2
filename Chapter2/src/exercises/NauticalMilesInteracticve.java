package exercises;

import java.util.Scanner;

public class NauticalMilesInteracticve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double NM_IN_MILES = 1.150779;
		double NM_IN_KLICKS = 1.852;
		double nauticalMiles;
		double miles;
		double kilometers;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many Nautical Miles?");
		nauticalMiles = input.nextDouble();
		
		miles = nauticalMiles * NM_IN_MILES;
		kilometers = nauticalMiles * NM_IN_KLICKS;
		
		System.out.println("In " + nauticalMiles + " Nautical Miles there are " 
				+ miles + " Miles and " + kilometers + " Kilometers.");
	}

}
