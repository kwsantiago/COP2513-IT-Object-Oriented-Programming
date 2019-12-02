import java.util.*;
public class TemperaturesDataStore extends ArrayList<Double>{
  private String filename;
  
  TemperaturesDataStore(String filename){
    this.filename = filename;
    // add stuff here
  }// end constructor
  
  public void clear(){
    for(int i = 0; i<TemperaturesDataStore.size(); i++){
    TemperaturesDataStore.remove(i);
    }
  }// end clear
  
}// end class
