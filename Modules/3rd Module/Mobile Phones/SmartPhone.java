/**
* Kyle Santiago 11/01/2019 
**/
import java.util.ArrayList;
public class SmartPhone extends MobilePhone{
   private String IP_address;
   private double out_call_cost;
   private double data_cost;
   private double data_consumed;
   
   SmartPhone(String tel_number, String IP_address) {
      super("USF Mobile",tel_number);
      this.IP_address = IP_address;
   }// end of constructor for default values
   
   public String getIPAddress(){
      return IP_address;
   }// end getter
   
   public void setIPAddress(String IP_address){
      this.IP_address = IP_address;
   }// end setter
   
   public void call(String tel_number,int min,int sec){
      super.call(tel_number, min, sec);
      double result = 0.0;
      if(tel_number.charAt(0)!='1' && tel_number.charAt(0)!='9'){
         result += (min*60) + sec;
         result *= (0.05/60);
         out_call_cost += result;
         }
   }// end call
   
   public void data(double amount){
      data_consumed += amount;
      data_cost += 1.5*amount;
   }// end data
   
   public String toString(){
      return "Phone Number: " + getTelNumber() + "\nCarrier: " + getCarrier()+
      "\nCalls Made: " + out_calls + "\nTotal Calls: " + out_calls.size() + "\nTotal Calls Cost: $" + out_call_cost + 
      "\nTotal Data Consumed: " + data_consumed + "GB\nTotal Data Cost: $" + data_cost + "\n";
   }// end toString

}// end of class