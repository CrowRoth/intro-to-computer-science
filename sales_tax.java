/*
 * File: sales_tax.java
 * 
 * Name: Dustin Riley
 * 
 * Requirements: loop and summarize data from transactions
 * 
 * Variables: 
 * 		Input: amount
 * 
 * 		calculated: tax, total, salest, taxt, salesa, transactions
 * 
 * Output: 
 * Sales amount:
 * Sales Tax at 6.00 %:
 * Total due :
 * 
 * Transactions:
 * Total of all sales:
 * Amount of tax collected:
 * Average of the sales:
 * 
 * Key calculations: 
 * tax = amount * TAXRATE;
 * total = amount + tax;
 * salest += amount;
 * taxt += tax;
 * transactions++;
 * salesa = salest/transactions;
 * 
 * Design: 
 * enter amount:
 * enter amount again or 0 to exit
 * 
 * 
 * Test data:
 * 	amount	tax	total	salest	taxt	salesa			transactions
 * 	7		.42	7.42	
 * 	4		.24	4.24	20.0	1.2						
 * 	9		.54	9.54
 *  0									6.66666666667	3
 */

import java.util.*;

public class sales_tax {
	
	public static final double TAXRATE = 0.06; // note how I declared a constant outside of main. 

	public static void main(String[] args) {
		double amount, tax, total, salest, taxt, salesa;
		int transactions;
		
		salest = 0;
		taxt = 0;
		salesa = 0;
		transactions = 0;
		
		Scanner input = new Scanner(System.in);

		System.out.println("Sales tax calculator at " + TAXRATE*100 + "%"); // a title for the whole program. Note how we can calculate a value in an output statement
	
		// input amount
		System.out.print("Enter the sales amount: $");
		amount = input.nextDouble();
		
		while(amount != 0.0){
			
		
		//calculate tax and total 
		tax = amount * TAXRATE;
		total = amount + tax;
		
		//output amount, TAXRATE, tax, and total
		System.out.println();
		System.out.println("Sales amount: $" + amount);
		System.out.printf("Sales Tax at %2.2f %%: $%2.2f", TAXRATE * 100, tax); // %% prints just one %
		System.out.println();
		System.out.printf("Total due : $%2.2f", total);
		
		salest += amount;
		taxt += tax;
		transactions++;
		salesa = salest/transactions;
		
		System.out.println();
		System.out.print("\nEnter the sales amount (0 to stop): $\n");
		amount = input.nextDouble();
		
		}
		
		System.out.println("Transactions: " + transactions);
		System.out.println("Total of all sales: " + salest);
		System.out.println("Amount of tax collected: " + taxt);
		System.out.println("Average of the sales: " + salesa);
		
		input.close(); 
	}

}
