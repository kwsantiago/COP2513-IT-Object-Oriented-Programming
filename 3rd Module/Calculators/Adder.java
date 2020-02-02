/**
* Kyle Santiago 10/09/2019
*  You are to design a series of calculator classes, Adder, FourFunction, Scientific, and
Financial. FourFunction will be a subclass of Adder, and Scientific and Financial will
be subclasses of FourFunction. 
**/
public class Adder {
   double memory;
   
   Adder() {
      memory = 0.0;
   }// end no-arg constructor
   
   public double readout(){
      return memory;
   }// end readout
   
   public void add(double a){
      memory += a;
   }// end add
   
   public void subtract(double a){
      memory -= a;
   }// end subtract
   
   public void clear(){
      memory = 0.0;
   }// end clear

}// end of class