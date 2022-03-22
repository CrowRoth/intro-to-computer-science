/*
 * File: payroll.java
 * 
 * Name: Dustin Riley
 * 
 * 
 * Requirements: Given employee id, hours worked, and hourly rate calculate regular pay, overtime pay, and gross pay. summarize data
 * 
 * Variables:
 *      input: id, hrs, wage
 *      
 *      	calculated: pay, OT, gross, emps, grosst, grossa, OTc, OTt
 *      
 * Output: 
 * employee id worked hrs hours at wage an hour. 
 * regular pay:
 * overtime pay:
 * gross pay:
 * # of employees:
 * Total of gross pay:
 * Average gross pay:
 * # of employees with overtime pay:
 * Total overtime pay:
 *
 * Key calculations: 
 * pay = hrs * wage;
 * pay = wage * 40.00;
 * OT = wage * 1.5 * (hrs - 40);
 * OTc++;
 * gross = pay + OT;
 * emps++;
 * grosst += gross;
 * grossa += grosst/emps;
 * OTt += OT;
 * 
 * design:
 * enter id
 * while(id != 0){
 * enter hrs, wage
 *  
 * 
 * Test data: 
 * id		hrs		wage	pay		OT		gross	emps	grosst	grossa		OTc		OTt
 * 54879	53		15		600		292.50	892.50	
 * 12345	46		10		400		90		490		
 * 0												2		1382.50	1583.75		382.50	2
 */

import java.util.*;
import java.io.*;

public class payroll {
	
	public static void main(String[] args) throws FileNotFoundException {
		double hrs, wage, pay, OT, gross, grosst, grossa, OTt;
		int id, emps, OTc;
		
		Scanner inFile = new Scanner(new File("employees.txt"));
		PrintWriter outFile = new PrintWriter(new File("results.txt"));
		
		emps = 0;
		grosst = 0;
		grossa = 0;
		OTc = 0;
		OTt = 0;
		OT = 0;
		
		outFile.print("   ID");
		outFile.printf("%8s%8s%8s%8s%8s\n___________________________________________________\n","Hours","Wage","Pay","OT Pay","Gross");
		
		while(inFile.hasNext()) { 
			id = inFile.nextInt();
			hrs = inFile.nextDouble();
			wage = inFile.nextDouble();
			
			if (hrs <= 40.00) {
				pay = hrs * wage;
			}
			else {	
				pay = wage * 40.00;
				OT = wage * 1.5 * (hrs - 40);
				OTc++;
			}
			
			gross = pay + OT;
			
			System.out.print("employee " + id); 
			System.out.printf(" worked %2.2f hours at $%2.2f an hour.\n", hrs, wage);
			System.out.printf("regular pay: $%2.2f\n", pay);
			System.out.printf("overtime pay: $%2.2f\n", OT);
			System.out.printf("gross pay: $%2.2f\n", gross);
			
			emps++;
			grosst += gross;
			grossa += grosst/emps;
			OTt += OT;
			
			outFile.print(id);
			outFile.printf("%8.2f%8.2f%8.2f%8.2f%8.2f\n", hrs,wage,pay,OT,gross);
			
		}
		
		System.out.println("# of employees: " + emps);
		System.out.printf("Total of gross pay: $%2.2f\n", grosst);
		System.out.printf("Average gross pay: $%2.2f\n", grossa);
		System.out.println("# of employees with overtime pay: " + OTc);
		System.out.printf("Total overtime pay: $%2.2f\n", OTt);
		
		outFile.println("# of employees: " + emps);
		outFile.printf("Total of gross pay: $%2.2f\n", grosst);
		outFile.printf("Average gross pay: $%2.2f\n", grossa);
		outFile.println("# of employees with overtime pay: " + OTc);
		outFile.printf("Total overtime pay: $%2.2f\n", OTt);
		
		inFile.close(); 
		outFile.close();
		
	}

}
