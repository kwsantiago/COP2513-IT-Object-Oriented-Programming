/**
* Kyle Santiago 11/01/2019 
**/
import java.util.ArrayList;
public class BasicPhone extends MobilePhone{
   private double out_call_cost;
   
   BasicPhone(String carrier,String tel_number) {
      super(carrier,tel_number);
   }// end of constructor for default values
         
   public void call(String tel_number,int min,int sec){
      super.call(tel_number, min, sec);
      double result = 0.0;
      if(tel_number.charAt(0)!='1' && tel_number.charAt(0)!='9'){
         result += ((double)min*0.1) + ((sec>0)? 0.1 : 0);
         out_call_cost += result;
         }
   }// end call
   
   public String toString(){
      return "Phone Number: " + getTelNumber() + "\nCarrier: " + getCarrier()+
      "\nCalls Made: " + out_calls + "\nTotal Calls: " + out_calls.size() + "\nTotal Calls Cost: $" + out_call_cost + "\n";
   }// end toString

}// end of class