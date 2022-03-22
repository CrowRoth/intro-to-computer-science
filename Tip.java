import java.util.Scanner;

public class Tip {
/*
 * File: Tip.java
 * 
 * Name: Dustin Riley
 * 
 * 
 * Requirements: calculate tip based on a constant percentage of amount
 * 
 * Constants: TIPRATE (0.15)
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
 * tip = amount * TIPRATE;
 * total = amount + tip;
 * 
 * Key design considerations
 * changed a bunch of spacing and println
 * 
 * Test data: 
 * Enter the sales amount: $250
 * Sales amount: $250.0
 * Tip at 15.00%: $37.50
 * Total due: $287.50
 * 
 * Enter the sales amount: $214.56
 * Sales amount: $214.56
 * Tip at 15.00%: $32.18
 * Total due: $246.74
 */
	public static final double TIPRATE = 0.15;
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		double amount, tip, total;
		
		System.out.print("Enter the sales amount: $");
		amount = keyboard.nextDouble();
		
		tip = amount * TIPRATE;
		total = amount + tip;
		
		System.out.println("Sales amount: $" + amount);
		System.out.printf("Tip at %2.2f%%: $%2.2f", TIPRATE * 100, tip);
		System.out.println();
		System.out.printf("Total due: $%2.2f", total);
		
		keyboard.close();
	}

}
