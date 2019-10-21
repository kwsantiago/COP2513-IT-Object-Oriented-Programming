import java.lang.Math;
public class Circle extends TwoDimensionalShape {
   private double radius;
   
   Circle(String color, boolean filled, double radius){
      super(color, filled, radius, radius);
      this.radius = radius;
   }// end constructor
   
   public double getRadius(){
      return radius;
   }// end getter
   
   public void setRadius(double radius){
      this.radius = radius;
   }// end setter
   
   public double getArea(){
      return Math.PI*(Math.pow(radius,2));
   }// end getArea
   
   public String toString() {
      return "created on: " + getDateCreated() + "\n" + 
      "color: " + getColor() + "\n" + "filled: " + getFilled() + "\n" +
      "shape type: 2-D" + "\n" + "dimension1: " + getDimension1() + "\n" +
      "dimension2: " + getDimension2() + "\n" + "radius: " + radius + "\n" + 
      "shape name: circle" + "area: " + getArea() + "\n";
   }// end of method

}// end of class