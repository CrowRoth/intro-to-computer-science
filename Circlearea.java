/*
 * circlearea.java
 * Dustin Riley
 * 
 * Requirements: Given radius, calculate area
 * 
 * variables needed:
 * 	input: none
 * 	calculated: area(calculated), radius(assigned), PI(assigned)
 * 
 * Output:
 * 	radius and area
 *  
 * Key calculations:
 * 	area = PI * radius * radius
 */
package asg1;

public class Circlearea {

	public static void main(String[] args) {
		double area;
		double radius;
		double PI;
		
		radius = 4.5;
		PI = 3.1416;
		area = PI * radius * radius;
		
		System.out.println("If the radius of a circle is " + radius + " then the area is " + area);
	}

}
