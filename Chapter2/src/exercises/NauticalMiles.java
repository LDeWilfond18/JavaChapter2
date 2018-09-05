package exercises;

public class NauticalMiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double NM_IN_MILES = 1.150779;
		double NM_IN_KLICKS = 1.852;
		double nauticalMiles = 5;
		double miles;
		double kilometers;
		
		miles = nauticalMiles * NM_IN_MILES;
		kilometers = nauticalMiles * NM_IN_KLICKS;
		
		System.out.println("In " + nauticalMiles + " Nautical Miles there are " 
		+ miles + " Miles and " + kilometers + " Kilometers.");
	}

}
