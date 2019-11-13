import java.util.*;
public class SimpleJSONEditor{
   ArrayList<String> labels;
   ArrayList<Integer> values;
   
   SimpleJSONEditor(String fPath, int fNumber){
      labels = new ArrayList<String>();
      values = new ArrayList<Integer>();
      labels.add(fPath);
      values.add(fNumber);
   }// end constructor
   
}// end class