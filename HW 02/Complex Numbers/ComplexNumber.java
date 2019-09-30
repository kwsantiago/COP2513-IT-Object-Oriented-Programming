/**
* This is our COP2513 template
* Kyle Santiago 9/26/2019
* Exercise #2 – Complex Numbers
**/
public class ComplexNumber {
   double real;
   double imaginary;
   
   ComplexNumber() {
      real = 0.0;
      imaginary = 0.0;
   }// end of constructor for default values
   
   ComplexNumber(double real, double imaginary) {
      this.real = real;
      this.imaginary = imaginary;
   }// end of constructor for my values
   
   private double getReal(){
      return real;
   }// end getReal
   
   private void setReal(double real){
      this.real = real;
   }// end setReal
   
   private double getImaginary(){
      return imaginary;
   }// end getImaginary
   
   private void setImaginary(double imaginary){
      this.real = real;
   }// end setImaginary
      
   public String toString() {
      String Results = real + " + " + imaginary + "i" + ". \n";
      return Results;
   }// end of method
   
   public static void main(String[] args) {
      ComplexNumber character = new ComplexNumber();
      System.out.println(character.toString());
   }// end of main

}// end of class