import java.util.*;
import java.io.*;
import java.lang.Math;
import java.lang.Comparable;
import java.lang.Cloneable;
/*   Requirements*/
public class LetterTransform extends StringTransformation { 
   int shift;  
   LetterTransform(){
      super();
      //this(1); // NOT WORKING
      this.shift = 1;
   }// end no-arg constructor
   
   LetterTransform(String logfile, int shift){
      super(logfile);
      this.shift = shift;
   }// end constructor
   
   public void apply(String s){
      super.apply(s); 
      //String result = s.increment(); NOT WORKING
      String result = s;
   }// end apply
   
   public void undo(String s){
      super.undo(s); 
      //String result = s.decrement(); NOT WORKING
      String result = s;
   }// end undo
} // end class