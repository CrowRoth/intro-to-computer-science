/*
 * DistanceStart.java 
 *
 * Start of Lab 3.
 * 
 * Below is the requirements, analysis, and design for your code.
 * 
 * There is also the framework for the code
 * 
 * Code, debug, and test this program
 * 
 * Requirements
 * 		Given two points (x,y), determine the distance between them.
 * 
 * Analysis
 * 	Variables needed:
 * 
 * 	input: 
 * 		x1,y1,x2,y2 (double)
 * 	calculated
 * 		deltaX, deltaY, distance (double)
 * 	
 *  Output required:
 * 		points and the distance 
 * 
 * Design
 * 	declare x1,y1,x2,y2,deltaX,deltaY,distance as double
 * 	input x1,y1,x2,y2
 * 	calculate deltaX as x2-x1
 * 	calculate deltaY as y2-y1
 * 	calculate distance: sqrt(pow(deltaY,2)+pow(deltaX,2))
 * 	output distance rounded to one decimal
 * 
 * 
 * Test data
 * 
 * 		x1		y1		x2		y2		deltaY		deltaX		distance
 * 		-----------------------------------------------------------------
 * 		0		1		1		1		0.0			1.0			1.0
 * 		1		1		2		2		1.0			1.0			1.4
 * 		0		0		1.5		-22		1.5			-22			22.1
 */

import java.util.*;

public class Distance {

	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		double x1, y1, x2, y2, deltaX, deltaY, distance;
		
		System.out.print("Enter point one: (x then y): ");
		x1 = keyboard.nextDouble();
		y1 = keyboard.nextDouble();
		System.out.print("Enter point two: (x then y): ");
		x2 = keyboard.nextDouble();
		y2 = keyboard.nextDouble();
		
		deltaX = x1 - x2;
		deltaY = y1 - y2;
		distance = Math.sqrt(Math.pow(deltaY,2) + Math.pow(deltaX,2));
		
		System.out.printf("The line connecting (%1.1f,%1.1f) and (%1.1f,%1.1f) has a distance of %1.1f", x1,y1,x2,y2,distance);
		
		keyboard.close();
		
	}

}
