/**
* Kyle Santiago 11/01/2019 
**/
import java.util.Date;
public class MobilePhone {
   public String carrier;
   public String tel_number;
   //public ArrayList String out_calls;
   //public ArrayList out_duration;
   
   MobilePhone(String carrier,String tel_number) {
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
         
   public void call(){
      
   }// end call

}// end of class