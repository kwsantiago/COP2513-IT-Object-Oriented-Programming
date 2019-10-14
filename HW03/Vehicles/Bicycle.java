public class Bicycle extends Vehicles{
      private double bikeWeight;
      private double cyclistWeight;
      
      Bicycle(double bikeWeight, double cyclistWeight, int numberOfWheels, String brand, double velocity, int nYears) {
      super(numberOfWheels, brand, velocity, nYears);
      this.bikeWeight = bikeWeight;
      this.cyclistWeight = cyclistWeight;
   }// end of constructor for my values
   
   public double getBikeWeight(){
      return bikeWeight;
   }// end getter
   
   public void setBikeWeight(double bikeWeight){
      this.bikeWeight = bikeWeight;
   }// end setter
   
   public double getCyclistWeight(){
      return cyclistWeight;
   }// end getter
   
   public void setCyclistWeight(double cyclistWeight){
      this.cyclistWeight = cyclistWeight;
   }// end setter
   
   public double gravitationalForce(){
      double weight = bikeWeight + cyclistWeight;
      double gf = 9.8067*(Math.sin(Math.atan(2.4/100)));
      gf = gf * weight; 
      return gf;
   }// end graviationalForce
   
   public String toString() {
      String Results = "Vehicle Brand: " + getBrand() + "\n" + 
      "Vehicle Velocity: " + getVelocity() + "\n" + "Number of wheels: " + getNumberOfWheels() + "\n" +
      "Number of years since purchase: " + getNYears() + "\n" + "Bike Weight: " +
      getBikeWeight() + "\n" + "Cyclist Weight: " + getCyclistWeight() + "\n" +
      "Gravitational Force acting on the cyclist: " + gravitationalForce();
      
      Results += "\n";
      
      return Results;      
   }// end of method


   
   }// end class Bicycle 