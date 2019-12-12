import java.io.*;
import java.util.*;
public class COP2513FinalExam{
   public static void main(String args[]){
      TemperaturesDataStore s = new TemperaturesDataStore();
      
      s.add(69.55);
      s.add(33.4);
      s.add(12.16);
      
      System.out.println("Initial temperatures: " + s);
      
      try{
      s.save();
      }catch(TemperaturesDataStoreException e){
         System.out.println("TemperaturesDataStoreException");
         System.out.println(e);
      }
      
      s.add(33.11);
      s.add(44.64);
      s.add(99.99);
      
      System.out.println("Adding more temperatures: " + s);
      
      try{
      s.load();
      }catch(TemperaturesDataStoreException e){
         System.out.println("TemperaturesDataStoreException");
         System.out.println(e);
      }
      System.out.println("After Loading: " + s);
   }// end main
}// end class