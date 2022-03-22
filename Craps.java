/*
 * Craps.java
 * 
 * Name: Edited by Dustin Riley
 * 
 * Requirements:
 * 
 * Complete the game of craps as specified in the to do document
 * 
 * 
 * 
 * Analysis
 * main:
 * 		Variables
 * 			Input: choice
 * 			calculated: results 
 * 		output detail: win or lose statement
 * 		output summary: wins, losses
 * 
 * play:
 * 		Variables:
 * 			Input none
 * 			calculated: none
 * 		output(console) total
 * 		output (return) win or lose value
 * 
 * 
 * point(p)
 * 			Input parameter int p
 * 			Variables
 * 				input none
 * 				calculated results, done
 * 			output (Console) results
 * 			output (return) win or lose value
 * 
 * 	
 * roll:
 * 		copied from lab 11
 * 
 * displayRoll
 * 		copied from lab 11
 * 
 * 
 * pause
 *      input parameters none
 *      variables
 *      	input char dummy
 *      	calculated none
 *      output none
 *      
 *      Just get a char from the user, essentially pausing the program
 *      
 * 
 * 
 * design
 * 
 * main
 * 		passes = 0
 * 		dontPasses = 0
 * 		repeat
 * 			results = call play()
 * 			if results is 1 then
 * 				display win statement
 * 				update passes counter
 * 			else 
 * 				display lose statement
 * 				update dontPasses counter
 * 			endif
 * 			
 * 			prompt to play again and input choice
 * 			
 * 		while user indicates play again
 * 		output passes and dontPasses
 * 
 * play()
 * 		total =  roll()
 * 		display total
 * 		if total == 7 or total == 11 then
 * 			return 1
 * 		else if total == 2 or total == 3 or total == 12 then
 * 			return 0
 * 		else
 * 			return point(total)
 * 		endif
 * 
 * point(p)
 * 		output p with description
 * 		while true
                    call pause
 *                  results = roll()
 *                  output results
*                   if results equals p then
 * 				return 1
 *                  else if results equals 7 then
 * 				return 0
 * 			
 * 		
 * 
 * 
 * roll same as lab 11
 * displayRoll same as lab 11
 * 
 * test data
 * results  passes  dontPasses
 * 11       1
 * 3                1
 * 12               1
 * 7        1
 * 4
 * 3
 * 5
 * 7                1
 * 
 * run enough times to ensure correct behavior
 * 
 */

import java.util.*;

public class Craps {
    
    public static void main(String[] args) {
        char choice;
        int results, passes = 0, dontPasses = 0;
    
        Scanner input = new Scanner(System.in);
        
        do{
            results = play();
            
            if(results == 1){
  		System.out.println("You win!");
  		passes++;
                }
            else {
  		System.out.println("You lose!");
  		dontPasses++;
            }
        
            System.out.println("Play again? (enter y or n)");
            choice = input.next().toLowerCase().charAt(0);
        
            while(choice != 'y' && choice != 'n'){
		System.out.print("Error! " + choice + " not valid. Play again? y or n: ");
		choice = input.next().toLowerCase().charAt(0);
            }
        		
        }while(choice == 'y');
        
        System.out.println("Passes: " + passes + "\nDontPasses: " + dontPasses);

        input.close();

    }
                
    public static int play() {
        int total;
        total =  roll();
        System.out.println("You rolled: " + total);
        if(total == 7 || total == 11){
            return 1;
        }
        else if(total == 2 || total == 3 || total == 12){
            return 0;
        }
        else{
            return point(total);
        }

    }

    public static int point(int p) {
        int results;
        System.out.println("Point to win: " + p);
        
        do{
            pause();
            results = roll();
            System.out.println("You rolled: " + results);
            if(results == p){
                return 1;
            }
            else if(results == 7){
                return 0;
            }
            else{
                System.out.println("Try again.");
                pause();
                results = roll();
                System.out.println("You rolled: " + results);
            }
    
        }while(true);
    
    }
        
    public static void pause(){
        System.out.println("Press Enter key to continue...");
        Scanner s = new Scanner(System.in);
        s.nextLine();
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

