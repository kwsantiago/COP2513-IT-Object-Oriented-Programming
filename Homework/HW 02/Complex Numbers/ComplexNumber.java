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
   
   public ComplexNumber add(ComplexNumber a){
      double num = real + a.getReal();
      double num1 = imaginary + a.getImaginary();
      return new ComplexNumber(num,num1);
   }
   
   public ComplexNumber subtract(ComplexNumber a){
      double num = real - a.getReal();
      double num1 = imaginary - a.getImaginary();
      return new ComplexNumber(num,num1);
   }
   
   public ComplexNumber multiply(ComplexNumber a){
      double num = real * a.getReal() - imaginary * a.getImaginary();
      double num1 = real * a.getImaginary() + a.getReal() * imaginary;
      return new ComplexNumber(num,num1);
   }
   
   public ComplexNumber divide(ComplexNumber a){
      double num = real * a.getReal() + imaginary * a.getImaginary();
      double num1 = imaginary * a.getReal() - real * a.getImaginary();
      double num2 = a.getReal() * a.getReal()  + a.getImaginary() * a.getImaginary();
      return new ComplexNumber(num/num2,num1/num2);
   }
      
   public String toString() {
      String Results = real + " + " + imaginary + "i" + ". \n";
      return Results;
   }// end of method
   
   public static void main(String[] args) {
      ComplexNumber a = new ComplexNumber(3,5);
      ComplexNumber b = new ComplexNumber(-2,-3);
      ComplexNumber c = new ComplexNumber(2,-5);
      System.out.print(a.toString());
      System.out.print(b.toString());
      System.out.println(c.toString());
      ComplexNumber d = a.add(b);
      System.out.print(d.toString());
      ComplexNumber e = a.subtract(b);
      System.out.print(e.toString());
      ComplexNumber f = b.subtract(a);
      System.out.print(f.toString());
      ComplexNumber f2 = a.multiply(b);
      System.out.print(f2.toString());
      ComplexNumber f3 = b.multiply(a);
      System.out.print(f3.toString());
      ComplexNumber f4 = a.divide(b);
      System.out.print(f4.toString());
      ComplexNumber f5 = b.divide(a);
      System.out.print(f5.toString());
      ComplexNumber f6 = a.add(b.divide(c));
      System.out.print(f6.toString());
      ComplexNumber f7 = a.subtract(b.divide(c));
      System.out.print(f7.toString());
      ComplexNumber z = a.subtract(b.multiply(c));
      System.out.print(z.toString());
   }// end of main

}// end of class