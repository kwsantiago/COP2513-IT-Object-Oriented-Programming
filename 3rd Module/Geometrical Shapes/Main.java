public class Main {   
       
   public static void main(String[] args) {
      Circle circle = new Circle("red", true, 5.0);
      System.out.println(circle.toString());
      Rectangle rectangle = new Rectangle("blue", false, 6.0, 12.0);
      System.out.println(circle.toString());
      Cube cube = new Cube("cyan", false, 4.0);
      System.out.println(cube.toString());
      Sphere sphere = new Sphere("magenta", true, 3.0);
      System.out.println(sphere.toString());
   }// end of main

}// end of class
