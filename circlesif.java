/*
 * File Name: circlesif.java
 * 
 * Name: Dustin Riley
 * 
 * Req: given two circles center point and radii. determine if they are intersecting or not.
 * 
 * Analysis
 * 	Variables:
 * 		input: x,y,x1,y1,r,r1,
 * 
 * 		calc: deltax,deltay,distance,radii
 * 
 * Output: intersect or do not intersect
 * 
 * Design:
 * enter circle 1 x,y,r
 * enter circle 2 x1,y1,r1 
 * deltax = x - x1;
 * deltay = y - y1;
 * distance = Math.sqrt(Math.pow(deltaY,2) + Math.pow(deltaX,2));
 * calculate radii = r + r1
 * 
 * Tests:
 * x	y	r	x1	y1	r1	intersect
 * 0	1	1	2	1	1	yes
 * 0	0	2	4	0	1	no
 * 0	0	1	0	0	2	yes
 * 
*/
package asg4;

import java.util.*;

public class circlesif {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double x, y, x1, y1, r, r1, deltax, deltay, distance, radii;
		
		System.out.println("Hey Hey Dont Touch Me There, That Is My No-No Circle");
		System.out.println("Enter circle 1 center point and radius (x,y,r)");
		x = keyboard.nextDouble();
		y = keyboard.nextDouble();
		r = keyboard.nextDouble();
		System.out.println("Enter circle 2 center point and radius (x,y,r)");
		x1 = keyboard.nextDouble();
		y1 = keyboard.nextDouble();
		r1 = keyboard.nextDouble();
		
		deltax = x - x1;
		deltay = y - y1;
		distance = Math.sqrt(Math.pow(deltay,2) + Math.pow(deltax,2));
		radii = r + r1;
		
		if(radii >= distance) {
			System.out.print("The circles intersect");
		}
		else {
			System.out.print("The circles do not intersect");
		}
		
		keyboard.close();
	}

}
