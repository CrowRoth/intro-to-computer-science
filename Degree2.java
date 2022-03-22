/**
 * 
 * Requirements: Given degrees Celsius, convert to degrees Fahrenheit
 *
 *Test data
 *		C		F
 *		37		98.6
 *		100		212
 *		0		32
 *
 */

import java.util.*;

public class Degree2 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double celsius, fahrenheit;
		
		// input degrees Celsius
		System.out.println("Degree Conversion Program");
		System.out.print("Enter degrees Celsius: ");
		celsius = keyboard.nextDouble();
		
		// calculate fahrenheit: (9.0/5) * celsius + 32
		fahrenheit = (9.0/5.0) * celsius + 32;
		
		//output celcius
		System.out.printf("%2.3f degrees Celsius is %2.3f degrees Fahrenheit", celsius, fahrenheit);
		
		keyboard.close();

	}

}