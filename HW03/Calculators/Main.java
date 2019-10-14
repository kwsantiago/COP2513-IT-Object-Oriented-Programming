public class Main {

   public static void main(String[] args) {
      Adder obj1 = new Adder();
      obj1.add(129);
      obj1.add(10056);
      obj1.subtract(28);
      System.out.println(obj1.readout());
      
      FourFunction obj2 = new FourFunction();
      obj2.add(67);
      obj2.divide(9);
      obj2.switchMemory();
      obj2.add(12);
      obj2.multiply(3);
      obj2.subtract();
      System.out.println(obj2.readout());
      
      Scientific obj3 = new Scientific();
      obj3.add(90);
      obj3.sin();
      System.out.println(obj3.readout());
      obj3.clear();
      obj3.add(3);
      obj3.square();
      obj3.switchMemory();
      obj3.add(4);
      obj3.square();
      obj3.add();
      obj3.squareRoot();
      System.out.println(obj3.readout());
      
      Financial obj4 = new Financial();
      obj4.add(1000);
      obj4.interest(20);
      obj4.switchMemory();
      obj4.add(0.05);
      System.out.println(obj4.readout());
   }// end of main

}// end of class

