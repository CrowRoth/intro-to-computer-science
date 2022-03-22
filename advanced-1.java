/*
 * File: advanced.java
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
 * if(tank == 2) {
 * 		sub = rent + FUEL;
 * 		fuelt += FUEL;
 * }
 * else{
 * 		sub = rent;
 * tax = sub * TAXRATE;
 * total = sub + tax;
 * rent = (week * WSEDAN) + (days * SEDAN);
 * rent = (week * WSUV) + (days * SUV);
 * 
 * 
 * totalt += total;
 * cust ++;
 * taxt += tax;
 * 
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

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class advanced {
	
	public static final double TAXRATE = 0.06;
	public static final double TOUR = 6.45;

	public static void main(String[] args) throws FileNotFoundException {
		Scanner inFile = new Scanner(new File("charges.txt"));
		Scanner keyboard = new Scanner(System.in);
		double rent, rentt, tax, sub, total, taxt, totalt, totala, fuelt, tour, tourt, ins, insc, insct, milec, milect, ECO, SEDAN, SUV, FUEL;
		int choice, days, daysc, cust, week, tank, miles, milesc, ecoc, sedanc, suvc;
		
		PrintWriter outFile = new PrintWriter(new File("results.txt"));
		
		rent = 0;
		rentt = 0;
		daysc = 0;
		tax = 0;
		cust = 0;
		totalt = 0;
		total = 0;
		totala = 0;
		fuelt = 0;
		taxt = 0;
		FUEL = 0;
		ECO = 0;
		SEDAN = 0;
		SUV = 0;
		milect = 0;
		sub = 0;
		insc = 0;
		insct = 0;
		tourt = 0;
		ecoc = 0;
		sedanc = 0;
		suvc = 0;
		milesc = 0;
		milec = 0;
		
		outFile.printf("%17s%17s%17s%17s%17s%17s%17s%17s\n\n","Rental cost","Fuel charge","Mileage charge","Insurance charge","Subtotal","Taxes","Fees","Total due");
		
		while(inFile.hasNext()){
			ECO = inFile.nextDouble();
			SEDAN = inFile.nextDouble();
			SUV = inFile.nextDouble();
			FUEL = inFile.nextDouble();
		}
	
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
			
			System.out.println("1. Yes ");
			System.out.println("2. No ");
			System.out.print("Did you purchase insurance?: ");
			ins = keyboard.nextInt();
			
			while(!(ins == 1 || ins == 2)) {
				System.out.print("Invalid entry\nDid you purchase insurance?: ");
				ins = keyboard.nextInt();
			}
			
			System.out.print("Enter the number of days you intend to rent vehicle: ");
			days = keyboard.nextInt();
			
			System.out.print("Enter the number of miles driven: ");
			miles = keyboard.nextInt();
			
			milesc += miles;
			miles = (miles - (250*days));
			tour = TOUR*days;
			daysc += days;
			week = days/7;
			days = days%7;
			
			if(days == 6) {
				week = week + 1;
				days = 0;
			}
			
			
			
			switch(choice) {
			case 1:
				rent = (week * (ECO*5)) + (days * ECO);
				insc = ECO * 2;
				ecoc++;
				break;
			case 2:
				rent = (week * (SEDAN*5)) + (days * SEDAN);
				insc = SEDAN * 2;
				sedanc++;
				break;
			case 3:
				rent = (week * (SUV*5)) + (days * SUV);
				insc = SUV * 2;
				suvc++;
				break;
			default:
				break;
			}
			
			System.out.printf("Rental cost: $%2.2f \n", rent);
			rentt += rent;
			if(tank == 2) {
				sub = rent + FUEL;
				System.out.printf("Fuel charge: $%2.2f \n", FUEL);
				fuelt += FUEL;
			}
			else{
				sub = rent;
				System.out.print("Fuel charge: $0.00 \n");
			}
			if(miles > 0) {
				milec = 0.10 * miles;
				sub = sub + milec;
				System.out.printf("Mileage charge: $%2.2f \n", milec);
				milect += milec;
			}
			else{
				System.out.print("Mileage charge: $0.00 \n");
			}
			if(ins == 1) {
				sub = sub + insc;
				System.out.printf("Insurance charge: $%2.2f \n", insc);
				insct += insc;
			}
			else {
				System.out.print("Insurance charge: $0.00 \n");
			}
			tax = sub * TAXRATE;
			total = sub + tax + tour;
			System.out.printf("Subtotal: $%2.2f \nTaxes: $%2.2f \nFees: $%2.2f \nTotal Due: $%2.2f\n", sub, tax, tour, total);
			outFile.printf("%17.2f%17.2f%17.2f%17.2f%17.2f%17.2f%17.2f%17.2f\n\n", rent, FUEL, milec, insc, sub, tax, tour, total);
			
			tourt += tour;
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
		outFile.println("Total customers: " + cust + "\nEconomy: " + ecoc + "\nSedan: " + sedanc + "\nSUV: " + suvc);
		outFile.printf("Total of rental charges: $%2.2f \n", rentt);
		outFile.print("Total days rented: " + daysc + " days \nTotal miles driven: " + milesc + " miles \n");
		outFile.printf("Total mileage charges: $%2.2f \nTotal fuel charges: $%2.2f \nTotal insurance collected: $%2.2f \nTotal taxes collected: $%2.2f \nTotal fees collected: $%2.2f \nTotal money collected: $%2.2f \nAverage bill: $%2.2f", milect, fuelt, insct, taxt, tourt, totalt, totala);
		
		keyboard.close();
		inFile.close();
		outFile.close();
		
	}
	
}


