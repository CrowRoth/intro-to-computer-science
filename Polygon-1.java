/*
 * File Name: Polygon.java
 * 
 * Name: Edited by Dustin Riley
 * 
 * Req: given the number of sides of a polygon and the length calculate the area
 * 
 * Variables:
 * 	input: sides, length, choice
 * 
 * 	calc: areaP
 * 
 * Output: With %ld sides all with length %2.2f a regular polygon has an area of %2.2f\n"
 * 
 * Design:
 * Enter the number of sides:
 * Enter the length of one side: 
 * With %1d sides all with length %2.2f a regular polygon has an area of %2.2f\n
 * Do again? (y or n):
 * 
 * 
 * Tests:
 * sides  length  areaP   choice
 *  4       1       1       y
 *  5       17    497.22    n
*/
import java.util.*;


public class Polygon {

	public static void main(String[] args)  {
		double length, areaP;
		int sides;
		char choice;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Polygon area program\n\n");
		
		do{
			System.out.print("Enter the number of sides: ");
		
			sides = input.nextInt();;
			System.out.print("Enter the length of one side: ");
			length = input.nextDouble();;
	
			areaP = area(sides,length);
					
			System.out.printf("With %1d sides all with length %2.2f a regular polygon has an area of %2.2f\n",sides, length, areaP);
			System.out.print("Do again? (y or n): ");
			choice = input.next().charAt(0);
		}while (choice == 'y' || choice == 'Y');
		input.close();
	}
	
	public static double area(int sides, double length) {
            double areaP;
            areaP = (sides*length*length)/(4*Math.tan(Math.PI/sides));
        return areaP;
        }
        

}
