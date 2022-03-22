/*
 * File Name: Polygon.java
 * 
 * Name: Edited by Dustin Riley
 * 
 * Req: given the number of sides of a polygon and the length calculate the area
 * 
 * Variables:
 * 	input: file:polygons.txt
 * 
 * 	calc: areaP
 * 
 * Output: file: areas.txt
 *         file: errorLog.txt
 * 
 * Design:
 * outfile.printf("%6s%10s%11s\n****************************\n\n","Sides","Length","Area");
 * outfile.printf("%6d%10.1f%11.2f\n",sides, length, areaP);
 * errors.println("Lines read that are not correct:\n====================================\n");
 * errors.println(line);
 * JOptionPane.showMessageDialog(null,"Done! The number of valid lines was " + count + ".\nThe number of invalid lines was " + errs + ".");
 * 
 * Tests:
 * areas.txt                    erorLog.txt
 * sides  length    areaP       
 *  3       4.5     8.77        4.5     7
 *  10      3.1     75.93       frog    5.7
 *  7       9.0     297.17      4   56  9.5
 *                              4
 * 
 * 
*/
import java.util.*;
import java.io.*;
import javax.swing.JOptionPane;

public class Polygon {

	public static void main(String[] args) throws FileNotFoundException  {
		double length=0, areaP;
		int sides, count=0, errs=0;
                String line, words[];
                
		Scanner inFile = new Scanner(new File("polygons.txt"));
		PrintWriter outfile = new PrintWriter(new File("areas.txt"));
                PrintWriter errors = new PrintWriter(new File("errorLog.txt"));
		
                
		outfile.printf("%6s%10s%11s\n****************************\n\n","Sides","Length","Area");
		errors.println("Lines read that are not correct:\n====================================\n");
                
                while(inFile.hasNext()){
                        line = inFile.nextLine();
                        words = line.split(" ");
                        
                        if (words.length == 2 && isInt(words[0]) && isDouble(words[1])){
                                sides = Integer.parseInt(words[0]);
                                length = Double.parseDouble(words[1]);
                                areaP = area(sides,length);
                                outfile.printf("%6d%10.1f%11.2f\n",sides, length, areaP);
                                count++;
                        }
                        else{
                                errors.println(line);
                                errs++;
                        }
                }
                inFile.close();
		outfile.close();
                errors.close();
		JOptionPane.showMessageDialog(null,"Done! The number of valid lines was " + count + ".\nThe number of invalid lines was " + errs + ".");

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
        
        public static double area(int n, double s){
		return (n*s*s)/(4*Math.tan(Math.PI/n));
	}
	
}
