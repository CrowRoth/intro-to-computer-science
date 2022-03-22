/*
 * File: switchconv.java
 * 
 * Name: Dustin Riley
 * 
 * 
 * Requirements: choose conversion type then convert to chosen units.
 * 
 * Variables:
 *      input: feet, meters, celsius, fahrenheit, choice
 *      
 *      	calculated: feet, meters, celsius, fahrenheit
 *      
 * Output: feet, meters, celsius, fahrenheit converted value
 *
 *
 * Key calculations: 
 * meters = feet/3.281;
 * feet = meters * 3.281;
 * fahrenheit = (9.0/5.0) * celsius + 32;
 * celsius = (fahrenheit - 32)/1.8;
 * 
 * design:
 * enter choice
 * enter feet, meters, celsius, fahrenheit
 * calculate feet, meters, celsius, fahrenheit
 * 
 * Test data: 
 * choice	feet	meters	celsius	fahrenheit default
 * 6											yes
 * 1		25		7.62
 * 2		52.5	16
 * 3						32		89.6			
 * 4						26.667	80
 *
 */
import java.util.*;

public class switchconv {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double feet, meters, celsius, fahrenheit;
		int choice;
		
		System.out.println("\nChoose from the following:\n********************\n");
		System.out.println("1. Feet to Meters");
		System.out.println("2. Meters to Feet");
		System.out.println("3. Celsius to Fahrenheit");
		System.out.println("4. Fahrenheit to Celsius");
		System.out.print("\nEnter the number of your choice: ");
		
		choice = keyboard.nextInt();
		
		switch(choice) {
		case 1:
			System.out.print("Enter Feet: ");
			feet = keyboard.nextDouble();
			meters = feet/3.281;
			System.out.printf("Feet: %1.2f\nMeters: %1.2f\n",feet, meters);
			break;
		case 2:
			System.out.print("Enter Meters: ");
			meters = keyboard.nextDouble();
			feet = meters * 3.281;
			System.out.printf("Feet: %1.2f\nMeters: %1.2f\n",feet, meters);
			break;
		case 3:
			System.out.print("Enter degrees Celsius: ");
			celsius = keyboard.nextDouble();
			fahrenheit = (9.0/5.0) * celsius + 32;
			System.out.printf("%2.3f degrees Celsius is %2.3f degrees Fahrenheit", celsius, fahrenheit);
			break;
		case 4:
			System.out.print("Enter degrees Fahrenheit: ");
			fahrenheit = keyboard.nextDouble();
			celsius = (fahrenheit - 32)/1.8;
			System.out.printf("%2.3f degrees Fahrenheit is %2.3f degrees Celsius", fahrenheit, celsius);
			break;
		default:
			System.out.println("Incorrect choice. " + choice + " is not an option");
		}
		keyboard.close();

	}

}