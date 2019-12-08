import java.io.*;
import java.util.*;
public class COP2513FinalExam{
   public static void main(String args[]) throws TemperaturesDataStoreException{
      TemperaturesDataStore s = new TemperaturesDataStore("temps.txt");
      
      System.out.println(s);
      
      s.add(88.88);
      s.add(66.66);
      s.add(99.99);
      
      System.out.println(s);
      
      try{
      s.save();
      }catch(TemperaturesDataStoreException e){
         System.out.println("File not found");
         System.out.println(e);
      }
      
      System.out.println(s);
      
      s.add(42.42);
      s.add(72.22);
      s.add(21.6);
      
      System.out.println(s);
      
      try{
      s.load();
      }catch(TemperaturesDataStoreException e){
         System.out.println("File not found");
         System.out.println(e);
      }
      
      System.out.println(s);
   }// end main
}// end class