/*
 * File: ArightTri.java
 * 
 * Name: Dustin Riley
 * 
 * 
 * Requirements: calculate area of a right triangle based on height and length
 * 
 * Variables: a, b, area
 *      input: a, b
 *      
 *      	calculated: area
 *      
 * Output: area
 *
 * Key calculations: 
 * area = (a*b)/2.0;
 * 
 * Key design considerations
 *  
 * Test data: 
 * Enter the height: 5
 * Enter the length: 2
 * Area: 5.0
 * 
 * Enter the height: 7.6
 * Enter the length: 5.44
 * Area: 20.7
 */
import java.util.Scanner;

public class ArightTri {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double a, b, area;
		
		System.out.print("Enter the height: ");
		a = keyboard.nextDouble();
		
		System.out.print("Enter the length: ");
		b = keyboard.nextDouble();
		
		area = (a*b)/2.0;
		
		System.out.printf("Area: %2.1f", area);
		
		keyboard.close();
	}

}
