package exercises;

import java.util.Scanner;

public class MadLib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String int1;
		String int2;
		String int3;
		String int4;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a noun");
		int1 = input.nextLine();
		
		System.out.println("Please enter another noun");
		int2 = input.nextLine();
		
		System.out.println("Please enter an adjective");
		int3 = input.nextLine();
		
		System.out.println("Please enter another adjective");
		int4 = input.nextLine();
		
		System.out.println("Mary had a little " + int1 + " \nIts " + int2 + " was " + int3 
				+ " as snow \nAnd everwhere that Mary " + int4 + " \nThe " + int1 + " was sure to go");
		

	}

}
