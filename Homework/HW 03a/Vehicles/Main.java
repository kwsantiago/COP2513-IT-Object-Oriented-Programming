public class Main {   
   public static void main(String[] args) {
      Vehicles vehicle1 = new Vehicles(4, "Toyota", 30, 3);
      System.out.println(vehicle1.toString());
      Car car1 = new Car(25000, 4, "Lexus", 27, 3);
      System.out.println(car1.toString());
      car1.setNYears(5);
      System.out.println(car1.toString());
      Bicycle bicycle1 = new Bicycle(17.5, 160.3, 2, "Giant", 5, 1);
      System.out.println(bicycle1.toString());
   }// end of main

}// end of class