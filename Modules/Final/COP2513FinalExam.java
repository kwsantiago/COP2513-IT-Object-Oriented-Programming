import java.util.*;
import java.io.*;
import java.lang.Math;
import java.lang.Comparable;
import java.lang.Cloneable;
/*   Requirements*/
public class COP2513FinalExam {   
public static void main(String[] args) throws StackOverflowError{ 
   String log = "LOG-default.txt";
   
   SeriesOfTransforms obj1 = new SeriesOfTransforms();
   
   obj1.add(new ReverseTransform(log));
   obj1.add(new LetterTransform(log,0));
   obj1.add(new StringTransformation(log));
   obj1.add(new ReverseTransform(log));
   obj1.add(new ReverseTransform(log));
   
   obj1.validate();
   
   SeriesOfTransforms clone = (SeriesOfTransforms)obj1.clone();
   
   clone.undo("@nfiu!oj!tmfssjvrt!ebi!tnbyf!ofix!sfix!sfcnfnfs!vpz!pE");
   // need to wait long enough for it to undo completely
   // takes a while
   
} // end main   
} // end class