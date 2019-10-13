public class Bicycle{
      private double bikeWeight;
      private double cyclistWeight;
      
      Bicycle(double bikeWeight, double cyclistWeight, int numberOfWheels, String brand, double velocity, int nYears) {
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
      double gf = 9.8067*(sin(arctan(2.4/100)));
      gf = gf * weight; 
      return gf;
   }// end graviationalForce
   
   public String toString() {
      String Results = "Vehicle Brand: " + brand + "\n" + 
      "Vehicle Velocity: " + velocity + "\n" + "Number of wheels: " + numberOfWheels + "\n" +
      "Number of years since purchase: " + nYears + "\n" + "Bike Weight: " +
      bikeWeight + "\n" + "Cyclist Weight: " + cyclistWeight + "\n" + 
      "Gravitational Force acting on the cyclist: " + gravitationalForce();
      
      Results += brakingDistance();
      
      return Results;      
   }// end of method

   
   }// end class Bicycle 