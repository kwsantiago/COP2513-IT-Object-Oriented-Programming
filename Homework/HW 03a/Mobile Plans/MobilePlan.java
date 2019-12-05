/**
* Kyle Santiago 10/08/2019
* Design a class named MobilePlan and its two subclasses named Streaming and
InternationalLongDistance.  
**/
import java.util.Date;
public class MobilePlan {
   private String type;
   private int minutes;
   private int sms;
   private int data;
   private Date dateCreated;
   private double monthlyBill;
   
   MobilePlan() {
      type = "Basic";
      minutes = 0;
      sms = 0;
      data = 0;
      dateCreated = new Date();
   }// end of constructor for default values
   
   MobilePlan(int minutes, int sms, int data) {
      this.minutes = minutes;
      this.sms = sms;
      this.data = data;
      type = "Basic";
      this.dateCreated = new Date();
   }// end of constructor for my values
   
   public double getMinutes(){
      return minutes;
   }// end getMinutes
   
   public void setMinutes(int minutes){
      this.minutes = minutes;
   }// end setMinutes
   
   public double getSMS(){
      return sms;
   }// end getSMS
   
   public void setSMS(int sms){
      this.sms = sms;
   }// end setSMS
   
   public double getData(){
      return data;
   }// end getData
   
   public void setData(int data){
      this.data = data;
   }// end setData
   
   public double getMonthlyBill(){
      double monthlyBill = (sms*0.005)+(minutes*0.01)+(data*2);
      return monthlyBill;
   }// end getMonthlyBill
      
   public String toString() {
      String Results =  "Class Name: MobilePlan" + "\n" +
      "Created on: " + dateCreated + "\n" + "Type: " + type + "\n" +
      "Minutes: " + minutes + "\n" + "Data: " + data + " GB \n" +
      "SMS: " + sms + "\n" + "Monthly Bill: " + getMonthlyBill() + "\n";
      
      return Results;
   }// end of method

}// end of class