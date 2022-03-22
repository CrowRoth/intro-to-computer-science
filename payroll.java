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

public class payroll {
	
	public static void main(String[] args) {
		double hrs, wage, pay, OT, gross, grosst, grossa, OTt;
		int id, emps, OTc;
		
		emps = 0;
		grosst = 0;
		grossa = 0;
		OTc = 0;
		OTt = 0;
		OT = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 5-digit employee ID: ");
		id = input.nextInt();
		
		while(id != 0) { 
			
			System.out.print("Enter hours worked: ");
			hrs = input.nextDouble();
			System.out.print("Enter hourly pay rate: $");
			wage = input.nextDouble();
			
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
			
			System.out.print("Enter the employee ID (0 to stop): ");
			id = input.nextInt();
		}
		
		System.out.println("# of employees: " + emps);
		System.out.printf("Total of gross pay: $%2.2f\n", grosst);
		System.out.printf("Average gross pay: $%2.2f\n", grossa);
		System.out.println("# of employees with overtime pay: " + OTc);
		System.out.printf("Total overtime pay: $%2.2f\n", OTt);
		
		input.close(); 
		
	}

}
