import java.util.Date;
public class InternationalLongDistance extends MobilePlan{
   private String type;
   private int minsILD;
   private Date dateCreated;
   private double monthlyBill;
   
   InternationalLongDistance(int minutes, int sms, int data, int minsILD) {
      super(minutes, sms, data);
      this.minsILD = minsILD;
      type =  "International Long Distance";
      this.dateCreated = new Date();
   }// end of constructor for my values
   
   public double getMinsILD(){
      return minsILD;
   }// end getter
   
   public void setMinsILD(int minsILD){
      this.minsILD = minsILD;
   }// end setter
   
   public double getMonthlyBill(){
      double monthlyBill = (getSMS()*(0.2*0.005))+(getMinutes()*(0.3*0.01))+(getData()*(0.2*2))+(minsILD*0.1);
      return monthlyBill;
   }// end getMonthlyBill
      
   public String toString() {
      String Results =  "Class Name: InternationalLongDistance" + "\n" +
      "Created on: " + dateCreated+ "\n" + "Type: " + type + "\n" +
      "Minutes: " + getMinutes() + "\n" + "ILD Minutes: " + minsILD + "\n" + "Data: " + getData() + " GB \n" + 
      "SMS: " + getSMS() + "\n" + "Monthly Bill: " + getMonthlyBill() + "\n";
      
      return Results;
   }// end of method

}// end of class