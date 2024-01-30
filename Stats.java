import java.util.ArrayList;

public class Stats {


   public static double mean (ArrayList<Double> data) {
      double sum = 0;
      double count = 0;
      
      for (int i = 0; i < data.size(); i++) {
         if (data != null) {
            sum += data.get(i);
            count += 1.0;
         }
         else {
            return Double.NaN;
         }
      }
      double actualMean = (sum/count);
      return actualMean;
            
   
   }
