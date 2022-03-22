/*
 * File Name: Lab13start.java
 * 
 * Name: Dustin Riley
 * 
 * Req: prompt the user input.
 * 
 * Variables:
 * 	input: words
 * 
 * 	calc:  spot, num, num, 
 * 
 * Output: 
 * "Enter a line:"
 * "The words of the lines you entered are:\n"
 * " (is long) "
 * " (is an Int) "
 * " (is Double) "
 * "\n\nDo again?"
 * "Here are the words"
 * 
 * Design:
 * main 
 *  if(isLong(words[spot])) {
 *  results += " (is long) ";
 *  }
 *  if(isInt(words[spot])) {
 *  results += " (is an Int) ";
 *  }
 *  if(isDouble(words[spot])) {
 *  results += " (is Double) ";
 *  }
 * isDouble
 *  try parse
 *  catch
 * isInt
 *  try parse
 *  catch
 * isLong
 *  if >8 return true
 *  else
 * Tests:
 * words          is long   is an int   is double
 * one                                  
 * two                
 * threefourfive    1           
 * six                  
 * 6                            1           1
 * 1.2345678        1                       1
*/
import javax.swing.JOptionPane;
public class Lab13Start {

	public static void main(String[] args) {
		String line, words[], results; // using the []'s after the name makes it an array
		int len,spot, choice;
		do {
			line = JOptionPane.showInputDialog(null,"Enter a line:","Testing Split",3);
			words = line.split(" "); // the " " delimits the parts by spaces
			len = words.length; // gets the number of elements in the array
			results = "The words of the lines you entered are:\n";
			spot = 0;  // arrays always start at index 0
			while(spot < len) { // this will go through the array one at a time
				results += (spot + 1) + ": " + words[spot] ;
				if(isLong(words[spot])) {
                                    results += " (is long) ";
				}
				if(isInt(words[spot])) {
                                    results += " (is an Int) ";
                                }
				if(isDouble(words[spot])) {
                                    results += " (is Double) ";
                                }
                                
				results += '\n';
				spot++;
			}
			results += "\n\nDo again?";
			choice = JOptionPane.showConfirmDialog(null, results,"Here are the words",0,1);
		}while(choice == 0);
	}
	
	public static boolean isDouble(String item) {
            double num;
            
            try{
                num = Double.parseDouble(item);
                return true;
            }
            catch (Exception e){
                return false;
            }
        }
        
        public static boolean isInt(String item) {
            int num;
            
            try{
                num = Integer.parseInt(item);
                return true;
            }
            catch (Exception e){
                return false;
            }           
        }
        
	public static boolean isLong(String item) {
            if(item.length() >= 8) {
                return true;
            }
            else {
		return false;
            }	
	}
}
