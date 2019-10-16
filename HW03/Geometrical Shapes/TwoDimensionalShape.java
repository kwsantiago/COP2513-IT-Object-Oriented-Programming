public class TwoDimensionalShape extends Shape {
   private double dimension1;
   private double dimension2;
   
   TwoDimensionalShape(String color, boolean filled, double dimension1, double dimension2){
      super(color, filled);
      this.dimension1 = dimension1;
      this.dimension2 = dimension2;
   }// end constructor
   
   public double getDimension1(){
      return dimension1;
   }// end getter
   
   public void setDimension1(double dimension1){
      this.dimension1 = dimension1;
   }// end setter
   
   public double getDimension2(){
      return dimension2;
   }// end getter
   
   public void setDimension2(double dimension2){
      this.dimension2 = dimension2;
   }// end setter
   
   public String toString() {
      return "created on: " + getDateCreated() + "\n" + 
      "color: " + getColor() + "\n" + "filled: " + getFilled() +
      "shape type: 2-D" + "\n" + "dimension1: " + dimension1 + "\n" +
      "dimension2: " + dimension2 + "\n";
   }// end of method

}// end of class