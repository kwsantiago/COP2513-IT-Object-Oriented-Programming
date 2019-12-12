import java.util.*;
import java.io.*;
public class SimpleJSONEditor{
   String fileName;
   File file;
   ArrayList<String> labels;
   ArrayList<Integer> values;
   
   SimpleJSONEditor(){
      this("default.txt");
      this.file = new File("default-file.txt");
      this.labels = new ArrayList<String>();
      this.values = new ArrayList<Integer>();
   }// end no-arg constructor
   
   SimpleJSONEditor(String fileName){
      this.labels = new ArrayList<String>();
      this.values = new ArrayList<Integer>();
      this.fileName = fileName;
      this.file = new File(this.fileName);
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
   
   public void writeJSON(String fileName) throws FileNotFoundException{
      if(file.exists())
         throw new FileNotFoundException("FileNotFoundException");
      try(PrintWriter pw = new PrintWriter(this.file)){
         if(!file.canWrite())
            throw new FileNotFoundException("FileNotFoundException");
         for(String d: labels){
            pw.println(d);
            }
         for(Integer a: values){
            pw.println(a);
            }
      }catch(FileNotFoundException e){
         throw new FileNotFoundException("FileNotFoundException");
      }
   }// end writeJSON
   
   public String toString(){
      String tmp = "";
      for(int i = 0; i<labels.size(); i++){
         tmp += labels.get(i) + " : " + values.get(i);
         }
       return tmp;
   }// end toString
   
   public static void main(String args[]){
      SimpleJSONEditor object1 = new SimpleJSONEditor("fruits.json");
      try{
         object1.getValueLabeled("apples");
      }catch(IndexOutOfBoundsException e){
         System.out.println(e);
         }
   }// end main
   
}// end class
