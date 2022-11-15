/*
 * File Name: ftmetersif.java
 * 
 * Name: Dustin Riley
 * 
 * Req: choose to enter feet or meters. Given feet or meters convert to the other.
 * 
 * Analysis
 * 	Variables:
 * 		input: feet, meters
 * 
 * 		calc: feet, meters
 * 
 * Output: Feet:, Meters:
 * 
 * Design:
 * choose feet to meters or meters to feet 
 * 
 * calculate feet = meters * 3.281
 * calculate meters = feet/3.281
 * 
 * Tests:
 * feet		meters
 * 76		23.16
 * meters	feet
 * 69		226.39
*/
import java.util.*;

public class ftmetersif {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double feet, meters;
		int choice;
		
		System.out.println("Feet/Meters Conversion Program\n\n");
		System.out.println("1. Convert Feet to Meters ");
		System.out.println("2. Convert Meters to Feet\n ");
		System.out.print("Enter the number of your choice from above: ");
		choice = keyboard.nextInt();
		
		if(choice == 1) {
			System.out.print("Enter Feet: ");
			feet = keyboard.nextDouble();
			meters = feet/3.281;
		}
		else {
			System.out.print("Enter Meters: ");
			meters = keyboard.nextDouble();
			feet = meters * 3.281;
		}
		System.out.printf("Feet: %1.2f\nMeters: %1.2f\n",feet, meters);
		
		keyboard.close();

	}

}
