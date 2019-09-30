/**
* This is our COP2513 template
* Kyle Santiago 9/26/2019
* Exercise #5 – Patient Records
**/
public class PatientRecord {
   private String name;
   private static double weight;
   private static double height;
   private boolean usingMetric;
   
   PatientRecord() {
      name = "Smith";
      weight = 0.0;
      height = 0.0;
      usingMetric = false;
   }// end of constructor for default values
   
   PatientRecord(String name, double weight, double height, boolean usingMetric) {
      this.name = name;
      this.weight = weight;
      this.height = height;
      this.usingMetric = usingMetric;
   }// end of constructor for my values
   
   public String getName(){
      return name;
   }// end getName
   
   public void setName(String name){
      this.name = name;
   }// end setName
   
   private static double convertLbToKg(){
      weight = weight * 0.453592;
      return weight;
   }// end convertLbToKg
   
   private static double convertKgToLb(){
      weight = weight * 2.204623;
      return weight;
   }// end convertLbToKg
   
   private static double convertInToCm(){
      height = height * 2.54;
      return height;
   }// end convertLbToKg
   
   private static double convertCmToIn(){
      height = height * 0.3937008;
      return height;
   }// end convertLbToKg
   
   public void setUsingMetric(){
      
   }// end setUsingMetric
   
   public String describeWeight(){
   return "Hello";
   }// end describeWeight
   
   public String describeHeight(){
   return "Hello";
   }// end describeHeight
      
   public String toString() {
      String Results =  "The name of the character is " + name + ". \n";
      
      Results += ". \n";
      
      return Results;
   }// end of method
   
   public static void main(String[] args) {
      PatientRecord character = new PatientRecord();
   }// end of main

}// end of class