public class Playable extends CharacterMaker{
      private int STR;
      private int DEX;
      private int CON;
      private int INT;
      private int WIS;
      private int CHA;
      
      /*Playable(String Name, int Health, int Mana) {
         this.Name = Name;
         this.Health = Health;
         this.Mana = Mana;
      }// end of constructor for my values*/
      
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
      
    public int rollStats(){
       int sides = 6;
       int dice = 0;
       int answer = 0;
       for(int i = 0; i < 4; i++){
       dice = (int) (Math.random() * sides) + 1;
       }
       return answer;
      }// end rollStats
      
      public String toString() {
      String Results =  "Name " + Name + ". \n" +
      "Health " + Health + ". \n" + 
      "Mana " + Mana + ". \n" +
      "STR: " + STR + ", DEX: " + DEX + ", CON: " + CON +
      ", INT: " + INT + ", WIS: " + WIS + ", CHA: " + CHA;
      
      //Results += ". \n";
      
      return Results;
   }// end of method
      
 }// end of Playable class
