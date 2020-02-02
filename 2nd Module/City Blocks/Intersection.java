/**
* This is our COP2513 template
* Kyle Santiago 9/26/2019
* Exercise #4 – City Blocks 
**/
public class Intersection {
   int street;
   int avenue;
   
   Intersection() {
      street = 0;
      avenue = 0;
   }// end of constructor for default values
   
   Intersection(int street, int avenue) {
      this.street = street;
      this.avenue = avenue;
   }// end of constructor for my values
   
   public int getStreet(){
      return street;
   }// end getStreet
   
   public void setStreet(int street){
      this.street = street;
   }// end setStreet
   
   public int getAvenue(){
      return avenue;
   }// end getAvenue
   
   public void setAvenue(int avenue){
      this.avenue = avenue;
   }// end setAvenue
   
   public int distance(Intersection b1){
      return Math.abs(street-b1.getStreet())+Math.abs(avenue-b1.getAvenue());
   }// end distance
   
   public int distance(int s1, int a1){
      return Math.abs(street-s1)+Math.abs(avenue-a1);
   }// end distance
   
   String getSuffix(int n){
      if(n == 11 || n == 12 || n == 13){
          return "th";
      }
      n = n%10;
      if(n == 1){
      return "st";
      }
      else if(n == 2){
      return "nd";
      }
      else if(n == 3){
      return "rd";
      }
      else{
      return "th";
      }
   }// end getSuffix
   
   public void getDirections(Intersection i){
      int s = Math.abs(street-i.getStreet());
      int a = Math.abs(avenue-i.getAvenue());
      System.out.print("drive " + a + " blocks to " + i.getStreet() + this.getSuffix(i.getStreet()) + " street,\n");
      System.out.print("turn onto " + i.getStreet() + this.getSuffix(i.getStreet()) + " street,\n");
      System.out.print("drive " + s + " blocks to " + i.getAvenue() + this.getSuffix(i.getAvenue()) + " avenue,\n"); 
   }// end getDirections
      
   public String toString() {
      return "The Intersection of " + street + this.getSuffix(street) + " Street and " + avenue + this.getSuffix(avenue) + " Avenue. \n";
   } //end of method
   
   public static void main(String[] args) {
      Intersection object1 = new Intersection();
      object1.setStreet(83); 
      object1.setAvenue(24); 
      Intersection object2 = new Intersection(72,11);
      object1.getDirections(object2);
   }// end of main

}// end of class
