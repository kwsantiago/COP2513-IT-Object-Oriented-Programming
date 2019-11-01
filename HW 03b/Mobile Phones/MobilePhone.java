/**
* Kyle Santiago 11/01/2019 
**/
import java.util.ArrayList;
public class MobilePhone {
   public String carrier;
   public String tel_number;
   public ArrayList<String> out_calls;
   public ArrayList<Integer> out_duration;
   
   MobilePhone(String carrier,String tel_number) {
      out_calls = new ArrayList<String>();
      out_duration = new ArrayList<Integer>();
      this.carrier = carrier;
      this.tel_number = tel_number;
   }// end of constructor for default values
   
   public String getCarrier(){
      return carrier;
   }// end getter
   
   public void setCarrier(String carrier){
      this.carrier = carrier;
   }// end setter
   
   public String getTelNumber(){
      return tel_number;
   }// end getter
   
   public void setTelNumber(String tel_number){
      this.tel_number = tel_number;
   }// end setter
         
   public void call(String tel_number,int min,int sec){
      int result = 0;
      result = (sec) + (min*60);
      out_duration.add(result);
      out_calls.add(tel_number);
   }// end call

}// end of class