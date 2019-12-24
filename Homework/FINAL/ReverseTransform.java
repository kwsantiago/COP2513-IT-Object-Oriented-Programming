import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ArrayList;
import java.io.Serializable;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.lang.Math;
import java.lang.Comparable;
import java.lang.Cloneable;
/*   Requirements*/
public class ReverseTransform extends StringTransformation {
   ReverseTransform(){
      super();
   }// end no-arg constructor
   
   ReverseTransform(String logfile){
      super(logfile);
   }// end constructor
   
   public void apply(String s){
      super.apply(s); 
      //String result = s.reverse(); NOT WORKING
      result = s;
   }// end apply
   
   public void undo(String s){
      super.undo(s); 
      //String result = s.reverse(); NOT WORKING
      result = s;  
   }// end undo
} // end class