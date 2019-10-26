public class Playable extends CharacterMaker{
      private int STR;
      private int DEX;
      private int CON;
      private int INT;
      private int WIS;
      private int CHA;
      
      Playable(String Name, int Health, int Mana) {
         super(Name,Health,Mana);
      }// end of constructor for my values
      
      public int getSTR(){
      return STR;
      }// end getter
      
      public int getDEX(){
      return DEX;
      }// end getter
      
      public int getCON(){
      return CON;
      }// end getter
      
      public int getINT(){
      return INT;
      }// end getter
      
      public int getWIS(){
      return WIS;
      }// end getter
      
      public int getCHA(){
      return CHA;
      }// end getter
      
      public void setSTR(int STR){
      this.STR = STR;
      }// end setter
      
      public void setDEX(int DEX){
      this.DEX = DEX;
      }// end setter
      
      public void setCON(int CON){
      this.CON = CON;
      }// end setter
      
      public void setINT(int INT){
      this.INT = INT;
      }// end setter
      
      public void setWIS(int WIS){
      this.WIS = WIS;
      }// end setter
      
      public void setCHA(int CHA){
      this.CHA = CHA;
      }// end setter
      
    public int rollStats(){
       int sides = 6;
       int dice = 0;
       int min = 7;
       int sum = 0;
       int[] a = new int[4];
       for(int i = 0; i < 4; i++){
       dice = (int) (Math.random() * sides) + 1;
       a[i] = dice;
       if(min>dice){
         min=dice;
       }
       }
       for(int i = 0;i<4;i++){
         if(a[i]==min){
            min=7;
            continue;
         }else{
            sum += a[i];
         }
       }
         return sum;
      }// end rollStats
      
      public String toString() {
      String Results =  "Name " + getName() + ". \n" +
      "Health " + getHealth() + ". \n" + 
      "Mana " + getMana() + ". \n" +
      "STR: " + STR + ", DEX: " + DEX + ", CON: " + CON +
      ", INT: " + INT + ", WIS: " + WIS + ", CHA: " + CHA;
      
      Results += " \n";
      
      return Results;
   }// end of method
      
 }// end of Playable class
