/**
* This is our COP2513 template
* Kyle Santiago 9/23/2019
* Exercise #4 – Dog Class 
**/
import java.util.Scanner; // Scanner is in the java.util package
public class COP2513HW01E4 {
   private String name;
   private String breed;
   private String color;
   private int age;
   private double weight;
   private boolean hasShots;
  
   COP2513HW01E4() {
   name = "n/a";
   breed = "mutt";
   color = "white";
   age = 0;
   weight = 0;
   hasShots = false;
   
   }// end of constructor //// AKA default values
   
   COP2513HW01E4(String name, String breed, String color, int age, double weight, boolean hasShots) {
   this.name = name;
   this.breed = breed;
   this.color = color;
   this.age = age;
   this.weight = weight;
   this.hasShots = hasShots;
   
   }// end of constructor //// AKA My values
   
   public String toString() {
      return "The name of the dog is " + name + ". \n" +
      "The breed of the dog is " + breed + ". \n" +
      "The color of the dog is " + color + ". \n" +
      "The age of the dog is " + age + ". \n" +
      "The weight of the dog is " + weight + ". \n" +
      "Dog has shots? True or false?: " + hasShots + ". \n";
   }// end of method
   
   public static void main(String[] args) {
      COP2513HW01E4 Spot = new COP2513HW01E4("Spot", "labrador", "golden", 1, 63.5, false);
      COP2513HW01E4 Max = new COP2513HW01E4("Max", "blood hound", "brown", 7, 107.3, true);
      System.out.println(Spot.toString());
      System.out.println(Max.toString());
   }// end of main

}// end of class