package exercises;

import java.util.Scanner;

public class Eggs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double DOZEN_EGGS = 12;
		double numberOfEggsNeeded;
		double extraEggs;
		int totalDozen;
		double extEggPrice = .45;
		double dozenEggPrice = 3.25;
		double totalPrice;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many eggs do you want? ");
		numberOfEggsNeeded = input.nextInt();
		
		extraEggs = numberOfEggsNeeded % DOZEN_EGGS;
		totalDozen = (int) (numberOfEggsNeeded / DOZEN_EGGS);
		totalPrice = extEggPrice * extraEggs + dozenEggPrice * totalDozen;
		
		System.out.println("You want " + numberOfEggsNeeded + " which is " + totalDozen + " Dozen and " 
		+ extraEggs + " extra eggs for " + totalPrice + "$");

	}

}
