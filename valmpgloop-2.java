/**
 * modified by Dustin Riley
 * 
 * valmpgloop.java
 *
 *changes: file I/O
 *tabular format of output
 *
 * Requirements
 * Given the miles driven and gallons of fuel used determine the miles per gallon.
 * Use sentinel value loop to allow repetition
 *
 * Analysis:
 *
 * Variables:
 * 		Input:  miles, gallons
 *		calculated mperg
 *		summary totalMiles, totalGallons, overallMPG
 *
 * 
 * Output
 * 		detail: mperg
 *		summary: trips, totalMiles, totalGallons, mperg
 *
 * Design
 * change sentinel value loop to while hasNext loop
 * Open files for output and input prior to the loop
 *	set summary data to 0
 * 	Input miles
 * 	while miles > 0
 * 		Input gallons
 * 		calculate mperg: miles / gallons
 * 		output mperg
 * 		update summary data
 * 		input miles
 * 	end while
 * 
 * test data
 * 
 * miles	gallons		mperg
 * 350		12.6		27.78
 * 400		15.02		26.63
 * 167.5	5.5			30.45
 * 
 * Summary:
 * trips: 3
 * Miles: 917.5
 * gallons: 33.12
 * MPG: 27.70
 * 
 * calculate overall mperg: totalMiles / totalGallons
 * out summary data
 */

import java.util.*;
import java.io.*;

public class valmpgloop {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner inFile = new Scanner(new File("trips.txt"));
		double miles, gallons, mperg, totalMiles, totalGallons;
		int trips;
		
		PrintWriter outFile = new PrintWriter(new File("results.txt"));
		
		// set summary data to 0
		trips = 0;
		totalMiles = 0.0;
		totalGallons = 0.0;
		
		//		Seed read Input miles
		
		outFile.printf("%10s%10s%10s\n\n","Miles","Gallons","MPG");
		
		while(inFile.hasNext()){
			miles = inFile.nextDouble();
			//		 additional input done first thing in loop
			
			gallons = inFile.nextDouble();

			mperg = miles / gallons;
			
			
			// update summary data
			trips++;
			totalMiles += miles;
			totalGallons = totalGallons + gallons;
			
			// Input miles
			outFile.printf("%10.2f%10.2f%10.2f\n", miles, gallons, mperg);
		
			
		}
		
		mperg = totalMiles / totalGallons;
		System.out.println("Trips: " + trips);
		System.out.println("Total Miles driven: " + totalMiles);
		System.out.println("Total Gallons used: " + totalGallons);
		System.out.printf("Overall MPG: %2.2f\n" , mperg);
		
		outFile.println("\nTrips: " + trips);
		outFile.printf("Total Miles driven: " + totalMiles);
		outFile.printf("\nTotal Gallons used: " + totalGallons);
		outFile.printf("\nOverall MPG: %2.2f\n", mperg);


		inFile.close();
		outFile.close();
	}

}
