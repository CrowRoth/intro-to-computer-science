/*
 * File: VolCyl.java
 * 
 * Name: Dustin Riley
 * 
 * 
 * Requirements: calculate volume of a cylinder based on radius and length
 * 
 * Constants: PI (3.1416)
 * 
 * Variables: radius, length, volume
 *      input: radius, length
 *      
 *      	calculated: volume
 *      
 * Output: volume
 *
 * Key calculations: 
 * volume = (PI * radius * radius) * length;
 * 
 * Key design considerations
 *  
 * Test data: 
 * Enter the radius of the base: 2
 * Enter the length: 1
 * Volume: 12.57
 * 
 * Enter the radius of the base: 8.3
 * Enter the length: 25
 * Volume: 5410.62
 */
package VolCyl;

import java.util.Scanner;

public class VolCyl {

	public static final double PI = 3.1416;
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double radius, length, volume;
		
		System.out.print("Enter the radius of the base: ");
		radius = keyboard.nextDouble();
		
		System.out.print("Enter the length: ");
		length = keyboard.nextDouble();
		
		volume = (PI * radius * radius) * length;
		
		System.out.printf("Volume: %2.2f", volume);
		
		keyboard.close();
	}

}