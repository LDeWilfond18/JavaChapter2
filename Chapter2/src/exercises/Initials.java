package exercises;

import java.util.Scanner;

public class Initials {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int firstInitial;
		int secondInitial;
		int thirdInitial;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your first initial? ");
		firstInitial = input.nextInt();
		
		System.out.println("What is your second initial? ");
		secondInitial = input.nextInt();
		
		System.out.println("What is your third initial? ");
		thirdInitial = input.nextInt();
		
		System.out.println("Your initals are " + firstInitial + "." + secondInitial + "." 
		+ thirdInitial + ".");

	}

}
