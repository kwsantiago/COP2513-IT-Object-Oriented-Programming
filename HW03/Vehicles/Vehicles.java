/**
* Kyle Santiago 10/08/2019
* Imagine you are conducting a study on Vehicles. You use object oriented programming
to help you throughout your studies. In the process of studying vehicles, you are to design
a class named Vehicles and two subclasses named Cars and Bicycles. 
**/
public class Vehicles {
   private int numberOfWheels;
   private String brand;
   private double velocity;
   private int nYears;
   
   Vehicles(int numberOfWheels, String brand, double velocity, int nYears) {
      this.numberOfWheels = numberOfWheels;
      this.brand = brand;
      this.velocity = velocity;
      this.nYears = nYears;
   }// end of constructor for my values
   
   public int getNumberOfWheels(){
      return numberOfWheels;
   }// end getter
   
   public void setNumberOfWheels(int numberOfWheels){
      this.numberOfWheels = numberOfWheels;
   }// end setter
   
   public String getBrand(){
      return brand;
   }// end getter
   
   public void setBrand(String brand){
      this.brand = brand;
   }// end setter
   
   public double getVelocity(){
      return velocity;
   }// end getter
   
   public void setVelocity(double velocity){
      this.velocity = velocity;
   }// end setter
   
   public int getNYears(){
      return nYears;
   }// end getter
   
   public void setNYears(int nYears){
      this.nYears = nYears;
   }// end setter
   
   public double brakingDistance(){
      double b = 0.6*(Math.pow(velocity,2));
      return b;
   }// end brakingDistance
      
   public String toString() {
      String Results = "Vehicle Brand: " + brand + "\n" + 
      "Vehicle Velocity: " + velocity + "\n" + "Number of wheels: " + numberOfWheels + "\n" +
      "Number of years since purchase: " + nYears + "\n" + "Braking Distance of the vehicle: ";
      
      Results += brakingDistance();
      
      return Results;      
   }// end of method

}// end of class