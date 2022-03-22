/*
 * File Name: guessboxes.java
 * 
 * Name: Dustin Riley
 * 
 * Req: prompt the user to guess a number between 1 and 100. Tell them if too high or low.
 * 
 * Variables:
 * 	input: prompt, guess
 * 
 * 	calc: num, OK 
 * 
 * Output: 
 * "Guess a number between 0 and 100"
 * guess + " is too high."
 * guess + " is too low."
 * "Good job! The number was " + num + "."
 * "\nError! " + results + " is not a valid whole number."
 * "Error! " + guess + " out of range."
 * 
 * Design:
 * main 
 *  num = random
 *  call getInt
 *  state wether guess too high or low.
 *  call getInt if num != guess
 *  Good job
 * getInt
 *  guess
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
import javax.swing.JOptionPane;

public class guessboxes {

    public static void main(String[] args)  {
        int num,guess;
        
        num = (int)(Math.random()*100);
        
        guess = getInt();
        
        do{
            if(num < guess){
                JOptionPane.showMessageDialog(null,guess + " is too high.");
            }
            else if(num > guess){
                JOptionPane.showMessageDialog(null,guess + " is too low.");
            }
        
            guess = getInt();
                
        }while(num != guess);
        
        JOptionPane.showMessageDialog(null,"Good job! The number was " + num + ".");
        
    }
    
    public static int getInt(){
	int guess=0;
        String prompt;
	boolean OK;
                
        do{
            prompt = JOptionPane.showInputDialog(null,"Guess a number between 0 and 100","");
            try{
                guess = Integer.parseInt(prompt);
                OK = true;
            }
            catch (Exception e){
		JOptionPane.showMessageDialog(null,"Error! " + prompt + " is not a valid whole number.\n\nEnter a whole number: ");
		OK = false;
            }

	}while(!OK);
		
        while(guess < 0 || guess > 100){
            JOptionPane.showMessageDialog(null,"Error! " + guess + " is out of range.");
            guess = getInt();
        }
                
	return guess;
    }

}