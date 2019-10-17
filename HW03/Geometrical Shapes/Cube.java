import java.lang.Math;
public class Cube extends ThreeDimensionalShape {
   private double side;
   
   Sphere(String color, boolean filled, double radius){
      super(color, filled, side, side);
      this.side = side;
   }// end constructor
   
   public double getRadius(){
      return radius;
   }// end getter
   
   public void setRadius(double radius){
      this.radius = radius;
   }// end setter
   
   public double getVolume(){
      return side * getWidth() * getHeight();
   }// end getVolume
   
   public String toString() {
      return "created on: " + getDateCreated() + "\n" + 
      "color: " + getColor() + "\n" + "filled: " + getFilled() +
      "shape type: 3-D" + "\n" + "dimension1: " + getDimension1() + "\n" +
      "dimension2: " + getDimension2() + "\n" + +
      "dimension3: " + getDimension3() + "\n" + "radius: " + radius + "\n" + 
      "shape name: cube" + "\n" + "volume: " + getVolume();
   }// end of method

}// end of class
