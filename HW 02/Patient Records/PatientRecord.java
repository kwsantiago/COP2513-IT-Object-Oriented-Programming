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
   
   public double getWeight(){
      return weight;
   }// end getWeight
   
   public void setWeight(double weight){
      this.weight = weight;
   }// end setWeight
   
   public double getHeight(){
      return height;
   }// end getHeight
   
   public void setHeight(double height){
      this.height = height;
   }// end setHeight
   
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
   
   public void setUsingMetric(boolean a){
      boolean b = usingMetric;
      this.usingMetric = a;
      
      if(b == false && a == true){
         convertLbToKg();
         convertInToCm();
      }
      
      else if(b == true && a == false){
         convertKgToLb();
         convertCmToIn();
      }
      
   }// end setUsingMetric
   
   public String describeWeight(){
      if(usingMetric == true){
         return name + "'s weight is " + convertKgToLb() + " pounds which is equivalent to " +
            + convertLbToKg() + " KG. ";
      }
      else{
         return name + "'s weight is " + weight + " pounds which is equivalent to " +
            + convertLbToKg() + " KG. ";
      }
   }// end describeWeight
   
   public String describeHeight(){
      if(usingMetric == true){
         return name + "'s height is " + convertCmToIn() + " inches which is equivalent to " +
            convertInToCm() + " CM.";
      }
      else{
         return name + "'s height is " + height + " inches which is equivalent to " +
            convertInToCm() + " CM.";
      }
   }// end describeHeight
   
   private double computeBMI(){
      double a;
      double b;
      double answer;
      if(usingMetric == false){
         a = 703 * weight;
         b = Math.pow(height,2);
         answer = a / b;
         return answer;
      }
      else{
         a = weight;
         b = Math.pow(height,2);
         answer = a / b;
         return answer;
      }
   }// end computeBMI
   
   public String describeBMI(){
      if(usingMetric == true){
      usingMetric = false;
      String tmp = "" + computeBMI() + " lb/inc^2"; 
      usingMetric = true;
      String tmp2 = "" + computeBMI() + " kg/m^2";
         return name + "'s Body Mass Index is " + tmp + " and is " +
            tmp2 + ".";
      }
      else{
      String tmp = "" + computeBMI() + " lb/inc^2"; 
      usingMetric = true;
      String tmp2 = "" + computeBMI() + " kg/m^2";
         return name + "'s Body Mass Index is " + tmp + " and is " +
            tmp2 + ".";
      }
   }// end describeBMI
   
   public static void main(String[] args) {
      PatientRecord patient1 = new PatientRecord();
      PatientRecord patient2 = new PatientRecord("Mason Williams", 90, 185, true);
      patient1.setName("Olivia Smith");
      patient1.setWeight(123.5);
      patient1.setHeight(60.3);
      patient1.setUsingMetric(false);
      System.out.print(patient1.describeBMI() + "\n" + patient2.describeBMI() + "\n" +
      patient1.describeWeight() + "\n" + patient2.describeWeight() + "\n" +
      patient1.describeHeight() + "\n" + patient2.describeHeight());
      
   }// end of main

}// end of class