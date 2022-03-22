/*
 * File: intermediate.java
 * 
 * Name: Dustin Riley edited by Dustin Riley
 * 
 * 
 * Requirements: Given vehicle type, full tank?, and days rented calculate rental cost, fuel charge, subtotal, tax, total, # of customers, total taxes, total fuel charges, total money collected, and average bill.
 * 
 * Variables:
 *      input: choice, days, tank
 *      constant: TAXRATE, SEDAN, SUV, ECO, WSEDAN, WSUV, WECO, FUEL
 *      	calculated: rent, sub, tax, total, week, cust, taxt, totalt, totala, fuelt
 *      
 * Output: 
 * Rental cost: 
 * Fuel charge:
 * Subtotal:
 * Taxes:
 * Total Due:
 * Total customers:
 * Total fuel charges:
 * Total taxes collected:
 * Total money collected:
 * Average bill:
 * 
 * Key calculations: 
 * week = days/7;
 * days = days%7;
 * if(days == 6) {
 * 		week = week + 1;
 * 		days = 0;
 * }
 * rent = (week * WECO) + (days * ECO);
 * rent = (week * WSEDAN) + (days * SEDAN);
 * rent = (week * WSUV) + (days * SUV);
 * if(tank == 2) {
 * 		sub = rent + FUEL;
 * 		fuelt += FUEL;
 * }
 * else{
 * 		sub = rent;
 * tax = sub * TAXRATE;
 * total = sub + tax;
 * totalt += total;
 * cust ++;
 * taxt += tax;
 * totala = totalt/cust;
 * 				
 * 
 * design:
 * enter choice
 * enter full tank?
 * enter days
 * 
 * 
 * Test data: 
 * choice	fuel	days	rent	fuel	sub		tax		total	cust	fuelt	taxt	totalt	totala
 * 1		1		10		279.84	0		279.84	16.79	296.63
 * 2		2		20		656.40	40.00	696.40	41.78	738.18
 * 4																		
 * 3		2		30		1110.78	40.00	1150.78	69.05	1219.83				
 * 5																
 * 0																3		80.00	127.62	2254.64	751.55
 */

import java.util.*;

public class intermediate {
	
	public static final double TAXRATE = 0.06;
	public static final double ECO = 34.98;
	public static final double SEDAN = 43.76;
	public static final double SUV = 50.49;
	public static final double WECO = ECO*5;
	public static final double WSEDAN = SEDAN*5;
	public static final double WSUV = SUV*5;
	public static final double FUEL = 40.00;

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double rent, tax, sub, total, taxt, totalt, totala, fuelt;
		int choice, days, cust, week, tank;
		
		rent = 0;
		tax = 0;
		cust = 0;
		totalt = 0;
		total = 0;
		totala = 0;
		fuelt = 0;
		taxt = 0;
	
		System.out.println("Bob's Car Rental Bill Calculator\n\n");
		System.out.println("1. Economy ");
		System.out.println("2. Sedan ");
		System.out.println("3. SUV\n ");
		System.out.print("Enter the number of your rental vehicle type from above (0 to stop): ");
		choice = keyboard.nextInt();
		
		while(choice < 0 || choice > 3) {
			System.out.print("Invalid entry\nEnter the number of your rental vehicle type from above (0 to stop): ");
			choice = keyboard.nextInt();
		}

		
	
		while(choice != 0) {
			
			System.out.println("1. Yes ");
			System.out.println("2. No ");
			System.out.print("Did you fill the tank?: ");
			tank = keyboard.nextInt();
		
			while(!(tank == 1 || tank == 2)) {
			System.out.print("Invalid entry\nDid you fill the tank?: ");
			tank = keyboard.nextInt();
			}
						
			System.out.print("Enter the number of days you intend to rent vehicle: ");
			days = keyboard.nextInt();
			
			week = days/7;
			days = days%7;
			
			if(days == 6) {
				week = week + 1;
				days = 0;
			}
			
			switch(choice) {
			case 1:
				rent = (week * WECO) + (days * ECO);				
				break;
			case 2:
				rent = (week * WSEDAN) + (days * SEDAN);				
				break;
			case 3:
				rent = (week * WSUV) + (days * SUV);				
				break;
			default:
				break;
				
			}
			
			System.out.printf("Rental cost: $%2.2f \n", rent);
			if(tank == 2) {
				sub = rent + FUEL;
				System.out.printf("Fuel charge: $%2.2f \n", FUEL);
				fuelt += FUEL;
			}
			else{
				sub = rent;
				System.out.print("Fuel charge: $0.00 \n");
			} 
			tax = sub * TAXRATE;
			total = sub + tax;
			System.out.printf("Subtotal: $%2.2f \nTaxes: $%2.2f \nTotal Due: $%2.2f\n", sub, tax, total);
			
			taxt += tax;
			totalt += total;	
			cust ++;
			
			System.out.println("\n1. Economy ");
			System.out.println("2. Sedan ");
			System.out.println("3. SUV\n ");			
			System.out.print("Enter the number of your rental vehicle type from above (0 to stop): ");
			choice = keyboard.nextInt();
			
			while(choice < 0 || choice > 3) {
				System.out.print("Invalid entry\nEnter the number of your rental vehicle type from above (0 to stop): ");
				choice = keyboard.nextInt();
			}
			
		}
		
		totala = totalt/cust;
		
		System.out.println("Total customers: " + cust);
		System.out.printf("Total fuel charges: $%2.2f \nTotal taxes collected: $%2.2f \nTotal money collected: $%2.2f \nAverage bill: $%2.2f ", fuelt, taxt, totalt, totala);
		
		keyboard.close();
		
	}
	
}


