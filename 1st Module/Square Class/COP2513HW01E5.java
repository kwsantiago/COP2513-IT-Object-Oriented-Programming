/**
* This is our COP2513 template
* Kyle Santiago 9/23/2019
* Exercise #5 – Square Class 
**/
import java.util.Scanner; // Scanner is in the java.util package
public class COP2513HW01E5 {
   private double side;
   
   COP2513HW01E5() {
   side = 1.0;
  
   }// end of constructor //// AKA default values
   
   COP2513HW01E5(double side) {
   this.side = side;
  
   }// end of constructor //// AKA My values
   
   public void setSide(double side){
   this.side = side;
   }// end of setSide
   
   public double getSide(){
   return side;
   }// end of getSide
   
   public double getDiagonal(){
      return Math.sqrt(Math.pow(getSide(),2)+Math.pow(getSide(),2));
   }// end of method getDiagonal
   
   public String toString(){
      return "The diagonal length of square with length and width of " + side + " is " + getDiagonal();
}// end of toString
   
   public static void main(String[] args) {
      COP2513HW01E5 Square1 = new COP2513HW01E5(5.0);
      COP2513HW01E5 Square2 = new COP2513HW01E5(8.0);
      System.out.println(Square1.toString());
      System.out.println(Square2.toString());
   }// end of main

}// end of class