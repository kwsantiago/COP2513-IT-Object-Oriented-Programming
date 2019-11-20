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
   
   public void setValueLabeled(String label, int value){
   int label1 = 0;
      for(int i = 0; i<labels.size(); i++){
         if(labels.get(i) == label){
            label1 = labels.indexOf(i);
         }
      }
      values.set(label1,value);
   }// end setValueLabeled
   
   public void writeJSON(String fpath){
      String tmp = toString();
      PrintWriter writer = new PrintWriter(fpath);
      writer.println(tmp);
      writer.close();
      //INCOMPLETE
   }// end 
   
   public String toString(){
      String tmp = "";
      for(int i = 0; i<labels.size(); i++){
         tmp += labels.get(i) + ": " + values.get(i);
         }
       return tmp;
   }// end toString
   
   public static void main(String args[]){
      SimpleJSONEditor example = new SimpleJSONEditor("fruits.json",0);
      System.out.println(example.getValueLabeled("oranges"));
      example.setValueLabeled("apples",12);
      
   }// end main
   
}// end class
