import java.util.*;
public class Car{
   private int age;
   private int num_of_doors;
   private int num_of_seats;
   private boolean is_taxi;
   
   Car(){
      age = 0;
      num_of_doors = 0;
      num_of_seats = 0;
      is_taxi = false;
   }// end no-arg constructor
   
   Car(int age, int num_of_doors, int num_of_seats,boolean is_taxi){
      if(age > 10){
         throw new ArithmeticException("Age of the car cannot be greater than 10.");
      }
      if(num_of_doors != 4){
         throw new ArithmeticException("Number of doors must be equal to 4.");
      }
      if(num_of_seats < 5){
         throw new ArithmeticException("Number of seats cannot be less than 5.");
      }
      if(is_taxi == true){
         throw new ArithmeticException("Car cannot be a taxi.");
      }
      this.age = age;
      this.num_of_doors = num_of_doors;
      this.num_of_seats = num_of_seats;
      this.is_taxi = is_taxi;
   }// end constructor
   
   public int getAge(){
      return age;
   }// end getter
   
   public void setAge(int age){
      this.age = age;
   }// end setter
   
   public int getNum_of_doors(){
      return num_of_doors;
   }// end getter
   
   public void setNum_of_doors(int num_of_doors){
      this.num_of_doors = num_of_doors;
   }// end setter
   
   public int getNum_of_seats(){
      return num_of_seats;
   }// end getter
   
   public void setNum_of_seats(int num_of_seats){
      this.num_of_seats = num_of_seats;
   }// end setter
   
   public boolean getIs_taxi(){
      return is_taxi;
   }// end getter
   
   public void setIs_taxi(boolean is_taxi){
      this.is_taxi = is_taxi; 
   }// end setter
   
   public String cityEligibility(int age){
      if(age <= 3){
         return "any city in Florida.";
      }
      if(age >= 4){
         return "any city in Florida except Jacksonville, Tallahassee, Orlando, Tampa, and Miami.";
      }
      return "";
   }// end cityEligibility
   
   public String toString(){
      return "This car is " + age + " years old with " + num_of_doors + " doors and " + num_of_seats + " seats and is eligible in " + cityEligibility(age);
   }// end toString
   
   public static void main(String[] args){
      Car car1 = new Car(5,4,5,false);
      Car car2 = new Car();
      car2.setAge(2);
      car2.setNum_of_doors(4);
      car2.setNum_of_seats(7);
      car2.setIs_taxi(false);
      System.out.println(car1.toString());
      System.out.println(car2.toString());
   }// end main
   
}// end class