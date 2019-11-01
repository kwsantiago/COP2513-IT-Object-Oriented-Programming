/**
* Kyle Santiago 11/01/2019 
**/
import java.util.Date;
public class SmartPhone extends MobilePhone{
   private String IP_address;
   private double out_call_cost;
   private double data_cost;
   private double data_consumed;
   
   SmartPhone(String carrier,String tel_number) {
      super(carrier,tel_number);
   }// end of constructor for default values
   
   public String getIPAddress(){
      return IP_address;
   }// end getter
   
   public void setIPAddress(String IP_address){
      this.IP_address = IP_address;
   }// end setter
   
   public void call(){
   
   }// end call
   
   public void data(double amount){
   
   }// end data
      
   public String toString() {
      String Results = "";
      
      return Results;
   }// end of method

}// end of class