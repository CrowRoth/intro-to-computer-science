/*
 * File Name: guess.java
 * 
 * Name: Dustin Riley
 * 
 * Req: prompt the user to guess a number between 1 and 100. Tell them if too high or low.
 * 
 * Variables:
 * 	input: guess
 * 
 * 	calc: num, OK 
 * 
 * Output: 
 * "Guess a number between 0 and 100"
 * guess + " is too high. Guess again."
 * guess + " is too low. Guess again"
 * "Good job! The number was " + num + "."
 * "\nError! " + results + " is not a valid whole number.\n\nEnter a whole number: "
 * "Error! " + guess + " out of range.\n\nGuess a number between 0 and 100"
 * 
 * Design:
 * main 
 *  num = random
 *  input guess
 *  call getInt
 *  state wether guess too high or low.
 *  call getInt if num != guess
 *  Good job
 * getInt
 *  results = input
 *  try catch validate
 *  make sure between 0 and 100
 *  return guess
 * Tests:
 * guess    too high    too low     correct
 * 50       1
 * 30                   1
 * 40                   1
 * 45       1
 * 44       1
 * 43       1
 * 42       1
 * 41                                   1
*/
import java.util.*;

public class guess {

    public static void main(String[] args)  {
        int guess,num;
        
        Scanner keyboard = new Scanner(System.in);
        
        num = (int)(Math.random()*100);
        
        System.out.print("Guess a number between 0 and 100");
        guess = getInt(keyboard);
        
        do{
            if(num < guess){
                System.out.print(guess + " is too high. Guess again.");
            }
            else if(num > guess){
                System.out.print(guess + " is too low. Guess again");
            }
        
            guess = getInt(keyboard);
                
        }while(num != guess);
        
        System.out.print("Good job! The number was " + num + ".");
        
        keyboard.close();
        
    }
    
    public static int getInt(Scanner input){
	int guess=0;
	String results, prompt;
	boolean OK;
                
        Scanner keyboard = new Scanner(System.in);
                                
	do{
            results = input.next();
            try{
                guess = Integer.parseInt(results);
                OK = true;
            }
            catch (Exception e){
		System.out.print("\nError! " + results + " is not a valid whole number.\n\nEnter a whole number: ");
		OK = false;
            }

	}while(!OK);
		
        while(guess < 0 || guess > 100){
            prompt = "Error! " + guess + " out of range.\n\nGuess a number between 0 and 100";
            guess = getInt(keyboard);
        }
                
	return guess;
    }

}