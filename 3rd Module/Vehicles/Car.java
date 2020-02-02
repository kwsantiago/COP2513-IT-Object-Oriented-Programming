public class Car extends Vehicles{
      private double purchaseAmount;
      
      Car(double purchaseAmount, int numberOfWheels, String brand, double velocity, int nYears) {
      super(numberOfWheels, brand, velocity, nYears);
      this.purchaseAmount = purchaseAmount;
   }// end of constructor for my values
   
   public double getPurchaseAmount(){
      return purchaseAmount;
   }// end getter
   
   public void setPurchaseAmount(double purchaseAmount){
      this.purchaseAmount = purchaseAmount;
   }// end setter
   
   public double getDepreciationAmount(){
      double value = purchaseAmount * Math.pow((1-0.14)/100,getNYears());
      double answer = purchaseAmount - value;
      return answer;
   }// end getDepreciationAmount
   
   public String toString() {
      String Results = "Vehicle Brand: " + getBrand() + "\n" + 
      "Vehicle Velocity: " + getVelocity() + "\n" + "Number of wheels: " + getNumberOfWheels() + "\n" +
      "Number of years since purchase: " + getNYears() + "\n" + "Purchase Amount: " +
      getPurchaseAmount() + "\n" + "Depreciation Amount of the vehicle: " + getDepreciationAmount();
      
      Results += "\n";
      
      return Results;      
   }// end of method

   
   }// end class Car 
