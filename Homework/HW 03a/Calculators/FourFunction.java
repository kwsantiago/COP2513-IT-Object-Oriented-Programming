public class FourFunction extends Adder{
   double memory2;
   
   FourFunction(){
      memory = 0.0;
      memory2 = 0.0;
   }// end no-arg
   
   public void switchMemory(){
      double temp = memory2;
      memory2 = memory;
      memory = temp;
   }// end switchMemory
   
   public void multiply(double a){
      memory *= a;
   }// end multiply
   
   public void divide(double a){
      memory /= a;
   }// end divide
   
   public void multiply(){
      memory = memory*memory2;
   }// end no arg multiply
   
   public void divide(){
      memory = memory/memory2;
   }// end no arg divide
   
   public void add(){
      memory = memory+memory2;
   }// end no arg add
   
   public void subtract(){
      memory = memory-memory2;
   }// end no arg subtract
   
   public void clearAll(){
      memory = 0.0;
      memory2 = 0.0;
   }// end clearAll

}// end of class