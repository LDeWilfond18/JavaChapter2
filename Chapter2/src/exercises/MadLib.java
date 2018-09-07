package exercises;

import java.util.Scanner;

public class MadLib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int int1;
		int int2;
		int int3;
		int int4;
		int int5;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a noun");
		int1 = input.nextInt();
		
		System.out.println("Please enter another noun");
		int2 = input.nextInt();
		
		System.out.println("Please enter an adjective");
		int3 = input.nextInt();
		
		System.out.println("Please enter another adjective");
		int4 = input.nextInt();
		
		System.out.println("Please enter another noun");
		int5 = input.nextInt();
		
		System.out.println("Mary had a little " + int1 + " /nIts " + int2 + " was " + int3 + "as snow \nAnd");
		

	}

}
