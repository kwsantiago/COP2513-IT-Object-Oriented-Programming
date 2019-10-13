public class FourFunction extends Adder{
   double memory2;
   
   FourFunction(){
      memory = 0.0;
      memory2 = 0.0;
   }// end no-arg
   
   public void switchMemory(){
      memory2 = memory;
      memory = memory2;
   }// end switchMemory
   
   public void multiply(double a){
      memory *= a;
   }// end multiply
   
   public void divide(double a){
      memory /= a;
   }// end divide
   
   //overloadhere
   
   public void clearAll(){
      memory = 0.0;
      memory2 = 0.0;
   }// end clearAll

}// end of class