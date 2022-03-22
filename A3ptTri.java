/*
 * File Name: A3ptTri.java
 * 
 * Name: Dustin Riley
 * 
 * Req: Given 3 points (x,y), determine the area of the triangle they make when connected
 * 
 * Analysis
 * 	Variables:
 * 		input: x1,x2,x3,y1,y2,y3
 * 
 * 		calc: side1,side2,side3,s
 * 
 * Output: points and the area
 * 
 * Design:
 * determine the length of the three sides: 
 * side1 is the distance from (X1,Y1) to (X2,Y2)
 * side2 is the distance from (X2,Y2) to (X3,Y3)
 * side3 is the distance from (X3,Y3) to (X1,Y1)
 * calculate s: s = (side1 + side2 + side3) / 2.0
 * calculate area: sqrt(s*(s-side1)*(s-side2)*(s-side3))
 * 
 * Tests:
 * x1	y1	x2	y2	x3	y3	area
 * 0	0	0	3	3	0	4.50
 * x1	y1	x2	y2	x3	y3	area
 * 0	1	1	0	2	3	2.00
*/
package A3ptTri;

import java.util.*;

public class A3ptTri {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double x1, y1, x2, y2, x3, y3, side1, side2, side3, s, area;
		
		System.out.print("Enter point one: (x then y): ");
		x1 = keyboard.nextDouble();
		y1 = keyboard.nextDouble();
		System.out.print("Enter point two: (x then y): ");
		x2 = keyboard.nextDouble();
		y2 = keyboard.nextDouble();
		System.out.print("Enter point three: (x then y): ");
		x3 = keyboard.nextDouble();
		y3 = keyboard.nextDouble();
		
		side1 = Math.sqrt(Math.pow((y1 - y2),2) + Math.pow((x1 - x2),2));
		side2 = Math.sqrt(Math.pow((y2 - y3),2) + Math.pow((x2 - x3),2));
		side3 = Math.sqrt(Math.pow((y3 - y1),2) + Math.pow((x3 - x1),2));
		
		s = (side1 + side2 + side3) / 2.0;
		
		area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		
		System.out.printf("The triangle connecting (%1.2f,%1.2f), (%1.2f,%1.2f), and (%1.2f,%1.2f) has an area of %1.2f", x1,y1,x2,y2,x3,y3,area);
		
		keyboard.close();
	}

}
