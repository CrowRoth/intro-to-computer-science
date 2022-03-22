/*
 * File Name: forpoly.java
 * 
 * Name: Dustin Riley
 * 
 * Req: given length of one side calc the area of multiple polygons.
 * 
 * Variables: sides
 * 	input: length, choice
 * 
 * 	calc: areaP, 
 * 
 * Output: sides length area
 * 
 * Design: enter length of one side:
 * do again?:
 *  
 * Tests:
 * Sides    Length      Area
 *     3      1.00      0.43
 *     4      1.00      1.00
 *     5      1.00      1.72
 *     6      1.00      2.60
 *     7      1.00      3.63
 *     8      1.00      4.83
 *     9      1.00      6.18
 *    10      1.00      7.69
 * Sides    Length      Area
 *     3      7.00     21.22
 *     4      7.00     49.00
 *     5      7.00     84.30
 *     6      7.00    127.31
 *     7      7.00    178.06
 *     8      7.00    236.59
 *     9      7.00    302.91
 *    10      7.00    377.02 
*/
import java.util.*;


public class forpoly {

	public static void main(String[] args)  {
		double length, areaP;
		int sides;
		char choice;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Polygon area program\n\n");
		
		do{
			System.out.print("Enter the length of one side: ");
			length = input.nextDouble();;
                        
                        System.out.printf("%10s%10s%10s\n", "Sides", "Length", "Area");
                        
                        for(sides=3;sides<=10;sides++){
                            areaP = area(sides,length);
                            System.out.printf("%10s%10.2f%10.2f\n",sides, length, areaP);
                        }
                        			
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