import java.util.ArrayList;
import java.util.Scanner;

class StatDriver {
   public static void main(String [] args) {
   
      ArrayList <Double> data = new ArrayList <>();
   
      Scanner scnr = new Scanner(System.in);
     
      
      while (scnr.hasNextDouble()) {
         data.add(scnr.nextDouble()); 
         
         }
         
         if (args.length == 0) {
            System.out.printf("Mean: %.2f\n", Stats.mean(data));
         
         }
         
         else if (args[0].equals("std")) {
            System.out.printf("StdDev: %.2f\n", Stats.stdDev(data));
         
         }
         
         else if (args[0].equals("mean")) {
            System.out.printf("Mean: %.2f\n", Stats.mean(data));
         
         }
      
      }      
   
   }
