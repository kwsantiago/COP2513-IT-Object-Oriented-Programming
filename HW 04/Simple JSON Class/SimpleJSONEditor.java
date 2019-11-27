import java.util.*;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONObject;
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
      try{
         FileWriter file = new FileWriter("D:/kyles/Git/COP2513-IT-Object-Oriented-Programming-2019/HW 04/Simple JSON Class/fruits.json");
         file.write(fpath.toJSONString());
         file.close();
      }
      catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
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
      example.setValueLabeled("peaches",2);
      example.writeJSON("fruits2.json");
   }// end main
   
}// end class
