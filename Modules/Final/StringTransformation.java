import java.util.*;
import java.io.*;
import java.lang.Math;
import java.lang.Comparable;
import java.lang.Cloneable;
/*   Requirements*/
public class StringTransformation {   
   String input;
   String result;
   String logfile;
   Date timestamp;
   
   StringTransformation(){
      //this("","","",null); THIS IS NOT WORKING
      this.logfile = "";
      this.result = "";
      this.input = "";
      this.timestamp = null;
   }// end no-arg constructor
   
   StringTransformation(String logile){
      this.logfile = logfile;
      this.result = "";
      this.input = "";
      this.timestamp = null;
   }// end constructor
   
   public void apply(String s){
      recordLogData(s);
      this.result = s;
      this.input = s;     
   }// end apply
   
   public void undo(String s){
      recordLogData(s);
      this.result = s;
      this.input = s;     
   }// end apply
   
   public String getResult() throws IOException /*DONT KNOW HOW TO THROW TWO EXCEPTIONS*/{
      try{
      writeLogData();
      }catch(IOException e){
         System.out.println("IOException occured " + e);
      }
      return result;
   }// end getResult
   
   private void recordLogData(String input){
      this.input = input;
      this.result = input;
      this.timestamp = new Date();
   }// end record
   
   private void writeLogData() throws IOException /*DONT KNOW HOW TO THROW TWO EXCEPTIONS*/{
      try(PrintWriter pw = new PrintWriter(new FileWriter(logfile,true))){
         pw.println("@" + timestamp + "\t-->\t" + result);
      }catch(IOException e){
         throw new IOException("IOException occurred");
      }
   }// end writeLogData
   
} // end class