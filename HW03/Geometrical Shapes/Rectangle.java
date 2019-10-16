import java.lang.Math;
public class Rectangle extends TwoDimensionalShape {
   private double length;
   private double width;
   
   Rectangle(String color, boolean filled, double length, double width){
      super(color, filled, length, width);
      this.length = length;
      this.width = width;
   }// end constructor
   
   public double getLength(){
      return length;
   }// end getter
   
   public void setLength(double length){
      this.length = length;
   }// end setter
   
   public double getWidth(){
      return width;
   }// end getter
   
   public void setWidth(double width){
      this.width = width;
   }// end setter
   
   public double getArea(){
      return length*width;
   }// end getArea
   
   public String toString() {
      return "created on: " + getDateCreated() + "\n" + 
      "color: " + getColor() + "\n" + "filled: " + getFilled() +
      "shape type: 2-D" + "\n" + "dimension1: " + getDimension1() + "\n" +
      "dimension2: " + getDimension2() + "\n" + 
      "shape name: rectangle" + "area: " + getArea();
   }// end of method

}// end of class