/*
 * File: Tip.java
 * 
 * Name: Dustin Riley
 * 
 * 
 * Requirements: calculate tip based on a constant percentage of amount
 * 
 * Variables: amount, tip, total
 *      input: amount
 *      
 *      	calculated: tip, total
 *      
 * Output: 15% tip and overall total
 *
 *
 * Key calculations: 
 * if tip = amount * 0.15;
 * else tip = 5.00
 * total = amount + tip;
 * 
 * design:
 * enter amount
 * if amount >= 100/3 15% tip
 * else $5 tip
 * 
 * Test data: 
 * amount	tip		total
 * 20		500		25.00
 * amount	tip		total
 * 34		5.10	39.10
 */
import java.util.Scanner;

public class Tip {

		public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		double amount, tip, total;
		
		System.out.print("Enter the sales amount: $");
		amount = keyboard.nextDouble();
		
		if(amount >= 100/3) {
			tip = amount * 0.15;
		}
		else {
			tip = 5.00;
		}
		
		
		total = amount + tip;
		
		System.out.println("Sales amount: $" + amount);
		System.out.printf("Tip of: $%2.2f", tip);
		System.out.println();
		System.out.printf("Total due: $%2.2f", total);
		
		keyboard.close();
	}

}
