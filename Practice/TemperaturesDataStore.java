import java.util.*;
import java.io.*;
public class TemperaturesDataStore extends ArrayList<Double>{
  private String filename;
  private ArrayList<Double> TemperaturesDataStore;
  private File file;
  
  TemperaturesDataStore(String filename){
    TemperaturesDataStore = new ArrayList<Double>();
    this.filename = filename;
    file = new File("temp.txt");
    // add stuff here
  }// end constructor
  
  public void clear(){
    for(int i = 0; i<TemperaturesDataStore.size(); i++){
    TemperaturesDataStore.remove(TemperaturesDataStore.get(i));
    }
  }// end clear
  
  public 
  
}// end class
