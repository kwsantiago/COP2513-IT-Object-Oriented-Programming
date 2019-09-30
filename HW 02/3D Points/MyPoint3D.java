/**
* This is our COP2513 template
* Kyle Santiago 9/26/2019
* Exercise #3 – 3D Points 
**/
public class MyPoint3D {
   private double x;
   private double y;
   private double z;
   
   MyPoint3D() {
      x = 0.0;
      y = 0.0;
      z = 0.0;
   }// end of constructor for default values
   
   MyPoint3D(double x, double y, double z) {
      this.x = x;
      this.y = y;
      this.z = z;
   }// end of constructor for my values
   
   public double getX(){
      return x;
   }// end getX
   
   public void setX(double x){
      this.x = x;
   }// end setX
   
   public double getY(){
      return y;
   }// end getY
   
   public void setY(double y){
      this.y = y;
   }// end setY
   
   public double getZ(){
      return z;
   }// end getZ
   
   public void setZ(double z){
      this.z = z;
   }// end setZ
   
   public double distance(MyPoint3D d1){
      double distance;
      distance = Math.sqrt(Math.pow( x - d1.getX(), 2) + Math.pow( y - d1.getY(), 2) + Math.pow( z - d1.getZ(), 2));
      return distance;
   }// end distance
   
   public double distance(int x, int y, int z){
      double distance;
      distance = Math.sqrt(Math.pow( x - this.x, 2) + Math.pow( y - this.y, 2) + Math.pow( z - this.z, 2));      
      return distance;
   }// end distance
   
   public static double distance(MyPoint3D d1, MyPoint3D d2){
      double distance;
      distance = Math.sqrt(Math.pow( d1.getX() - d2.getX(), 2) + Math.pow( d1.getY() - d2.getY(), 2) + Math.pow( d1.getZ() - d2.getZ(), 2));            
      return distance;
   }// end distance
      
   public String toString() {
      String Results =  "Point: (" + x + "," + y + "," + z + ") \n";
      return Results;
   }// end of method
      
   public static void main(String[] args) {
      MyPoint3D point1 = new MyPoint3D(3.0,5.0,-5.0);
      MyPoint3D point2 = new MyPoint3D(5.0,1.0,-3.0);
      MyPoint3D point3 = new MyPoint3D(5.0,1.0,-3.0);
      System.out.print(point1.toString());
      System.out.print(point2.toString());
      System.out.println(point3.toString());
      System.out.println(point1.toString()+point2.toString()+"Distance: " + point1.distance(point2) + "\n");     
      System.out.println(point1.toString()+"Point: (0.0,5.0,-4.0) \nDistance: " + point1.distance(0,5,-4) + "\n"); 
      System.out.print(point1.toString()+point2.toString()+ "Distance: " +MyPoint3D.distance(point1,point2));   
   }// end of main

}// end of class