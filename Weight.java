/*
 * File: ArightTri.java
 * 
 * Name: Dustin Riley
 * 
 * 
 * Requirements: Given pounds convert to kilograms
 * 
 * Variables: lb, kg
 *      input: lb
 *      
 *      	calculated: kg
 *      
 * Output: kg
 *
 * Key calculations: 
 * kg = lb * 0.45359237;
 * 
 * Key design considerations
 *  
 * Tests:
 * Pounds to Kilograms Conversion Program
 * Enter pounds: 23
 * 23.0 pounds is 10.43262451 kilograms
 * 
 * Pounds to Kilograms Conversion Program
 * Enter pounds: 219.7
 * 219.7 pounds is 99.654243689 kilograms
*/
package Weight;

import java.util.Scanner;

public class Weight {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double lb, kg;
		
		System.out.println("Pounds to Kilograms Conversion Program");
		System.out.print("Enter pounds: ");
		lb = keyboard.nextDouble();
		
		kg = lb * 0.45359237;
		
		System.out.print(lb + " pounds is " + kg + " kilograms");
		
		keyboard.close();

	}

}