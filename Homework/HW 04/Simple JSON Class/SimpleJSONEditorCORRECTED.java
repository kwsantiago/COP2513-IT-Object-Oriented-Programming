import java.util.*;
import java.io.*;
public class SimpleJSONEditorCORRECTED{
   String fileName;
   File file;
   ArrayList<String> labels;
   ArrayList<Integer> values;
   
   SimpleJSONEditorCORRECTED(){
      this("default.txt");
      this.file = new File("default-file.txt");
      this.labels = new ArrayList<String>();
      this.values = new ArrayList<Integer>();
   }// end no-arg constructor
   
   SimpleJSONEditorCORRECTED(String fPath){
      
      
      String token = "";
        try {
            Scanner in = new Scanner(new File(fPath));
            in.nextLine();
            while(in.hasNext()) {
                token = in.nextLine();
                if (token.equals("}"))
                    break;
                //  Tests
                //System.out.println((token));
                //System.out.println(token.substring(0,token.indexOf(":")-1));
                //System.out.println(Integer.parseInt(token.substring(token.indexOf(":")+2,token.length()-1)));
                labels.add(token.substring(0,token.indexOf(":")-1));
                if (token.substring(0, token.indexOf(":") - 1).equals("peaches")){
                    values.add(Integer.parseInt(token.substring(token.indexOf(":") + 2, token.length())));
                    break;
                }
                values.add(Integer.parseInt(token.substring(token.indexOf(":")+2,token.length()-1)));
            }
            in.close();
        }catch(FileNotFoundException e){
            System.out.println("File does not exist");
        }
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
   
   try {
            PrintWriter out = new PrintWriter(fpath);
            out.print("{\n");
            for(int i = 0; i < labels.size(); i++) {
                if(i == (labels.size()-1)) {
                    out.print(labels.get(i) + " : " + values.get(i) + "\n");
                    break;
                }
                out.print(labels.get(i) + " : " + values.get(i) + ",\n");
            }
            out.print("}");
            out.close();
        }catch(FileNotFoundException e){
            System.out.println("File does not exist");
        }}
   
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
