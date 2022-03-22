/*
 * File: switchconvloop.java
 * 
 * Name: Dustin Riley
 * 
 * 
 * Requirements: choose conversion type then convert to chosen units. summarize data
 * 
 * Variables:
 *      input: feet, meters, celsius, fahrenheit, choice
 *      
 *      	calculated: feet, meters, celsius, fahrenheit, loops, errors
 *      
 * Output: feet, meters, celsius, fahrenheit converted value
 *	loops:
 *	errors:
 *
 * Key calculations: 
 * meters = feet/3.281;
 * feet = meters * 3.281;
 * fahrenheit = (9.0/5.0) * celsius + 32;
 * celsius = (fahrenheit - 32)/1.8;
 * errors++
 * loops++
 * 
 * design:
 * enter choice
 * enter feet, meters, celsius, fahrenheit
 * calculate feet, meters, celsius, fahrenheit, loops, errors
 * enter choice again or 0 to exit:
 * loops:
 * errors:
 * 
 * Test data: 
 * choice	feet	meters	celsius	fahrenheit default	loops	errors
 * 5											yes		
 * 1		17		5.18
 * 2		78.74	24
 * 3						10		50			
 * 4						-7.778	18
 * 0													6		1
 */
import java.util.*;

public class switchconvloop {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double feet, meters, celsius, fahrenheit;
		int choice, loops, errors;
		
		loops = 0;
		errors = 0;
		
		do {
		System.out.println("\nChoose from the following:\n********************\n");
		System.out.println("1. Feet to Meters");
		System.out.println("2. Meters to Feet");
		System.out.println("3. Celsius to Fahrenheit");
		System.out.println("4. Fahrenheit to Celsius");
		System.out.println("0. Exit program");
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
		case 0:
			System.out.print("\nGoodbye!\n");
			break;
		default:
			System.out.println("Incorrect choice. " + choice + " is not an option");
			errors++;
		}
		
		loops++;
		
		}while(choice != 0);
		
		System.out.println("Total loops: " + loops);
		System.out.println("Total errors: " + errors);
		
		keyboard.close();

	}

}