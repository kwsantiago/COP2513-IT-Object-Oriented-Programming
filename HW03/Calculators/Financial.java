public class Financial extends FourFunction{

   public void interest(double time){
      double i = memory*(Math.pow(1+memory2,time)-memory);
   }// end interest

}// end of class