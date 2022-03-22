/*
 * Dice.java
 * Name: edited by Dustin Riley
 * 
 * Uses the Math.random and a switch statement to display a roll of two dice
 * 
 * Requirements:
 * 
 * write two methods: roll which will set to random numbers between 1 and 6 simulating a die roll, 
 * 								and calls displayRoll with each
 * 						displayRoll(): which uses a switch statement to display a single die roll with dots
 * 
 * provide a loop so the user may roll the two dice as many times as they want
 * 
 * 
 * 
 * Analysis
 * main:
 * 		Variables
 * 			Input: choice
 * 			calculated results
 * 		output results
 * 
 * roll:
 * 		parameters none
 * 		variables
 * 			input: none
 * 			calculated d1,d2, total
 * 		output call displayRoll()
 * 		return total
 * 
 * displayRoll
 * 		parameter roll (int between 1 and 6)
 * 		variables 
 * 			input none
 * 			calculated none
 * 		output Unicode for the roll, and a space
 * 		return none
 * 
 * 
 * 
 * 
 * 
 * design
 * 
 * main
 * 		repeat
 * 			results = call roll()
 * 			output results
 * 			input choice
 * 		while user inputs y
 * 
 * 
 * roll (none)
 * 		d1 becomes random number between 1 and 6
 * 		call displayRoll with d1
 * 		d2 becomes random number between 1 and 6
 * 		call displayRoll with d2
 * 		total = d1 + d2
 * 		return total
 *
 * displayRoll (roll)
 * 		switch on roll
 * 			for each case 1 to 6 display Unicode and a space
 */

import java.util.*;

public class DiceLab {

	public static void main(String[] args) {
		char choice;
		int results;
		Scanner input = new Scanner(System.in);;
		
		do{
			results = roll();
			System.out.println("\nThe roll is: " + results + "\n\n");
			System.out.print("Roll again? y or n: ");
			choice = input.next().toLowerCase().charAt(0);
			while(choice != 'y' && choice != 'n'){
				System.out.print("Error! " + choice + " not valid. Roll again? y or n: ");
				choice = input.next().toLowerCase().charAt(0);
			}
		}while(choice == 'y');
		
		input.close();
		
	}
	

	public static int roll(){
		int d1=(int)(Math.random()*6)+1;
                displayRoll(d1);
                int d2=(int)(Math.random()*6)+1;
                displayRoll(d2);
                int total=d1+d2;
		return total;
	}
	

	public static void displayRoll(int r){
		switch(r){
		case 1:
			System.out.print("\u2680 ");
			break;
		case 2:
			System.out.print("\u2681 ");
			break;
                case 3:
			System.out.print("\u2682 ");
			break;
                case 4:
			System.out.print("\u2683 ");
			break;
                case 5:
			System.out.print("\u2684 ");
			break;
                case 6:
			System.out.print("\u2685 ");
			break;
			}
		
	}
}