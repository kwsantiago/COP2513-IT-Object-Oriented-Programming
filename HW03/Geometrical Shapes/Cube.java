import java.lang.Math;
public class Cube extends ThreeDimensionalShape {
   private double side;
   
      Cube(String color, boolean filled, double side){
      super(color, filled, side, side, side);
      this.side = side;
   }// end constructor
   
   public double getSide(){
      return side;
   }// end getter
   
   public void setSide(double side){
      this.side = side;
   }// end setter
   
   public double getVolume(){
      return Math.pow(side,3);
   }// end getVolume
   
   public String toString() {
      return "created on: " + getDateCreated() + "\n" + 
      "color: " + getColor() + "\n" + "filled: " + getFilled() +
      "shape type: 3-D" + "\n" + "dimension1: " + getDimension1() + "\n" +
      "dimension2: " + getDimension2() + "\n" +
      "dimension3: " + getDimension3() + "\n" + "side: " + side + "\n" + 
      "shape name: cube" + "\n" + "volume: " + getVolume() + "\n";
   }// end of method

}// end of class
