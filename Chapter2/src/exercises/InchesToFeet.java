package exercises;

public class InchesToFeet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int INCHES_IN_FEET = 12;
		int feet;
		int inches;
		int startingInches = 63;
		
		feet = startingInches / INCHES_IN_FEET;
		inches = startingInches % INCHES_IN_FEET;
		
		System.out.println("You have " + startingInches + " inches so your total length is " 
		+ feet + " foot " + inches + " inches ");

	}

}
