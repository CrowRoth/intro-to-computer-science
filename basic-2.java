/*
 * File Name: basic.java
 * 
 * Name: Dustin Riley
 * 
 * Req: given inventory file (name quantity cost markup) output retail file and summary data.
 * 
 * Variables: q, cost, markup, item, line, words[]
 * 	input: inventory.txt
 * 
 * 	calc: qtotal, itotal, wtotal, rtotal, cvalue, rvalue, 
 * 
 * Output: retail.txt
 * 
 * Design:
 * outfile.printf("%15s%10s%10s%10s%10s%10s%10s\n****************************\n\n","Item","Quantity","Cost (W)","Markup %","Price (R)","Value (W)","Value (R)");
 * outfile.printf("%15s%10s%10.2f%10.2f%10.2f%10.2f%10.2f\n",item, q, cost, markup, retail, cvalue, rvalue);
 * System.out.printf("\nTotal value of all items wholesale: $%10.2f", wtotal);
 * System.out.printf("\nTotal value of all items retail: $%10.2f", rtotal);
 * System.out.print("\nTotal # of items: " + qtotal);
 * System.out.print("\n# of different items: " + itotal);
 * outfile.printf("\nTotal value of all items wholesale: $%10.2f", wtotal);
 * outfile.printf("\nTotal value of all items retail: $%10.2f", rtotal);
 * outfile.print("\nTotal # of items: " + qtotal);
 * outfile.print("\n# of different items: " + itotal);
 * 
 * Tests:
 *          item    quantity    cost (W)    markup %    price (R)   value (W)   value (R)
 * thingy           22          15.65       45.00       22.69       344.30      499.23
 * whatchacallit    59          67.99       25.50       85.33       4011.41     5034.32
 * gizmo            10          100.00      40.00       140.00      1000.00     1400.00
 * gobbledygook     20          50.00       50.00       75.00       1000.00     1500.00
 * 
 * Total value of all items wholesale: $   6355.71
 * Total value of all items retail: $   8433.55
 * Total # of items: 111
 * # of different items: 4
*/

import java.util.*;
import java.io.*;

public class basic {

    public static void main(String[] args) throws FileNotFoundException {
        int q, qtotal=0, itotal=0;
        double cost, markup, retail, cvalue, rvalue, wtotal=0, rtotal=0;
        String item, line, words[];
        
        Scanner infile = new Scanner(new File("inventory.txt"));
        PrintWriter outfile = new PrintWriter(new File("retail.txt"));
        
        outfile.printf("%15s%10s%10s%10s%10s%10s%10s\n****************************\n\n","Item","Quantity","Cost (W)","Markup %","Price (R)","Value (W)","Value (R)");
        
        while(infile.hasNext()){
            line = infile.nextLine();
            words = line.split(" ");
            
            item = (words[0]);
            q = Integer.parseInt(words[1]);
            cost = Double.parseDouble(words[2]);
            markup = Double.parseDouble(words[3]);
            retail = price(cost,markup);
            cvalue = cost * q;
            rvalue = retail * q;
            outfile.printf("%15s%10s%10.2f%10.2f%10.2f%10.2f%10.2f\n",item, q, cost, markup, retail, cvalue, rvalue);
            
            wtotal+=cvalue;
            rtotal+=rvalue;
            qtotal+=q;
            itotal++;
        }
        
        System.out.printf("\nTotal value of all items wholesale: $%10.2f", wtotal);
        System.out.printf("\nTotal value of all items retail: $%10.2f", rtotal);
        System.out.print("\nTotal # of items: " + qtotal);
        System.out.print("\n# of different items: " + itotal);
        outfile.printf("\nTotal value of all items wholesale: $%10.2f", wtotal);
        outfile.printf("\nTotal value of all items retail: $%10.2f", rtotal);
        outfile.print("\nTotal # of items: " + qtotal);
        outfile.print("\n# of different items: " + itotal);
        
        infile.close();
        outfile.close();

    }
    
    public static double price(double cost, double markup) {
        double retail;
        retail= cost * ((markup/100) + 1);
        return retail;
    }

}
