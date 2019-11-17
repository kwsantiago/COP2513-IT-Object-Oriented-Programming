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
   
   public int getValueLabeled(String label){
      int label1 = 0;
      for(int i = 0; i<labels.size(); i++){
         if(labels.get(i) == label){
            label1 = labels.indexOf(i);
         }
      }
      return values.get(label1);
   }// end getValueLabeled
   
   // finish stuff here // INCOMPLETE STUFF HERE
   
   public String toString(){
      for(int i = 0; i<labels.size(); i++){
         System.out.println(labels.get(i));
         }
      for(int i = 0; i<values.size(); i++){
         System.out.println(values.get(i));
         }
       return "";
   }// end toString
   
}// end class
