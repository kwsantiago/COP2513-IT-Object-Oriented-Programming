import java.util.Date;
public class Streaming extends MobilePlan{
   private String type;
   private int dataStreaming;
   private Date dateCreated;
   private double monthlyBill;
   
   Streaming(int minutes, int sms, int data, int dataStreaming) {
      super(minutes, sms, data);
      this.dataStreaming = dataStreaming;
      type = "Streaming";
      this.dateCreated = new Date();
   }// end of constructor for my values
   
   public double getDataStreaming(){
      return dataStreaming;
   }// end getter
   
   public void setDataStreaming(int dataStreaming){
      this.dataStreaming = dataStreaming;
   }// end setter
   
   public double getMonthlyBill(){
      double monthlyBill = (getSMS()*(0.2*0.005))+(getMinutes()*(0.2*0.01))+(getData()*(0.2*2))+(dataStreaming*1);
      return monthlyBill;
   }// end getMonthlyBill
      
   public String toString() {
      String Results =  "Class Name: Streaming" + "\n" +
      "Created on: " + dateCreated + "\n" + "Type: " + type + "\n" +
      "Minutes: " + getMinutes() + "\n" + "Data: " + getData() + " GB \n" + "Streaming Data: " + dataStreaming + " GB \n" +
      "SMS: " + getSMS() + "\n" + "Monthly Bill: " + getMonthlyBill() + "\n";
      
      return Results;
   }// end of method

}// end of class