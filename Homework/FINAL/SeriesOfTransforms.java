import java.util.*;
import java.io.*;
import java.lang.Math;
import java.lang.Comparable;
import java.lang.Cloneable;
/*   This class will extend ArrayList StringTransformation*/
public class SeriesOfTransforms extends ArrayList<StringTransformation> implements Cloneable{   
   SeriesOfTransforms(){
      super();
   }// end no-arg constructor
   
   public Object clone(){
      SeriesOfTransforms tmp = new SeriesOfTransforms();
      for(StringTransformation e: this)
         tmp.add(e);
         
      return tmp;
   }// end clone
   
   public void validate(){
      int count = 0;
      int isEven = count % 2;
      for(StringTransformation d: this){
         if(d instanceof ReverseTransform){
            count++;
            }
           }// end for
         if(count > 0 && isEven == 0)
            System.out.println("Using an even number of reverse transforms is weird");
   }// end validate
   
   public String apply(String input){
      System.out.println("Applying series of transforms on " + input);
      for(StringTransformation d: this){
         apply(input);
            }
      return "";
   }// end apply
   
   public String undo(String input) throws StackOverflowError{
      System.out.println("Undoing series of transforms on " + input);
      try{
      for(StringTransformation d: this){
         undo(input);
            }
       }catch(StackOverflowError e){
         System.out.println("StackOverflowError occurred");
       }
      return "";
   }// end undo   
} // end class