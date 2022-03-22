/*
 * File: basic.java
 * 
 * Name: Dustin Riley
 * 
 * 
 * Requirements: Given vehicle type and days rented calculate rental cost, tax, total, # of customers and total money collected.
 * 
 * Variables:
 *      input: choice, days
 *      constant: TAXRATE, SEDAN, SUV, ECO
 *      	calculated: rent, tax, total, errors, cust, totalt
 *      
 * Output: 
 * Rental cost: 
 * Taxes::
 * Total Due:
 * Total customers:
 * Total money collected:
 * 
 * Key calculations: 
 * rent = days * ECO;
 * tax = rent * TAXRATE;
 * total = rent + tax;
 * rent = days * SEDAN;
 * rent = days * SUV;
 * errors ++;
 * totalt -= total
 * totalt += total;
 * cust ++;
 * cust = cust - errors;
 * 				
 * 
 * design:
 * enter choice
 * while(id != 0){
 * enter days
 *  
 * 
 * Test data: 
 * choice	days	rent	tax		total	errors	cust	totalt
 * 1		10		349.80	20.99	370.79	
 * 2		20		875.20	52.51	927.71		
 * 4										1		
 * 3		30		1514.70	90.88	1605.58			
 * 5										1
 * 0										2		3		2904.08
 */

import java.util.*;

public class basic {
	
	public static final double TAXRATE = 0.06;
	public static final double ECO = 34.98;
	public static final double SEDAN = 43.76;
	public static final double SUV = 50.49;

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double rent, tax, total, totalt;
		int choice, days, cust, errors;
		
		tax = 0;
		errors = 0;
		cust = 0;
		totalt = 0;
		total = 0;
	
		System.out.println("Bob's Car Rental Bill Calculator\n\n");
		System.out.println("1. Economy ");
		System.out.println("2. Sedan ");
		System.out.println("3. SUV\n ");
		System.out.print("Enter the number of your rental vehicle type from above (0 to stop): ");
		choice = keyboard.nextInt();
	
		while(choice != 0) {
						
			switch(choice) {
			case 1:
				System.out.print("Enter the number of days you intend to rent vehicle (0 to stop): ");
				days = keyboard.nextInt();
				rent = days * ECO;
				tax = rent * TAXRATE;
				total = rent + tax;
				System.out.printf("Rental cost: $%2.2f \nTaxes: $%2.2f \nTotal Due: $%2.2f\n", rent, tax, total);
				break;
			case 2:
				System.out.print("Enter the number of days you intend to rent vehicle (0 to stop): ");
				days = keyboard.nextInt();
				rent = days * SEDAN;
				tax = rent * TAXRATE;
				total = rent + tax;
				System.out.printf("Rental cost: $%2.2f \nTaxes: $%2.2f \nTotal Due: $%2.2f\n", rent, tax, total);
				break;
			case 3:
				System.out.print("Enter the number of days you intend to rent vehicle (0 to stop): ");
				days = keyboard.nextInt();
				rent = days * SUV;
				tax = rent * TAXRATE;
				total = rent + tax;
				System.out.printf("Rental cost: $%2.2f \nTaxes: $%2.2f \nTotal Due: $%2.2f\n", rent, tax, total);
				break;
			default:
				System.out.println("Incorrect choice. " + choice + " is not an option");
				errors ++;
				totalt -= total;
				break;
				
			}
			totalt += total;	
			cust ++;
			
			System.out.println("1. Economy ");
			System.out.println("2. Sedan ");
			System.out.println("3. SUV\n ");
			System.out.print("Enter the number of your rental vehicle type from above (0 to stop): ");
			choice = keyboard.nextInt();
		}
		
		
		cust = cust - errors;
		
		System.out.println("Total customers: " + cust);
		System.out.printf("Total money collected: $%2.2f", totalt);
		
		keyboard.close();
		
	}
	
}


