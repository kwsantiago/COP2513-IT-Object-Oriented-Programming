public class NonPlayer extends CharacterMaker{
         private boolean immortal;
         private String role;
         private double exp;
         private int gold;
         private int dmg;
         private int dice;
   
      NonPlayer(boolean immortal,String role,double exp,int gold,int dice) {
         this.immortal = immortal;
         this.role = role;
         this.exp = exp;
         this.gold = gold;
         this.dice = dice;
   }// end of constructor for my values
   
      NonPlayer(boolean monster,boolean immortal,String role,double exp,int gold,int dice) {
         this.immortal = immortal;
         this.role = role;
         this.exp = exp;
         this.gold = gold;
         this.dice = dice;
         if(monster == true){
            role = "monster";
         }else{
         role = "villager";
         }// end if else
         exp = 1000;
         gold = 50;
         immortal = false;
   }// end of constructor for my values
   
   public double getExp(){
      return exp;
      }// end getter
      
      public int getGold(){
      return gold;
      }// end getter
      
      private void rollDice(){
       int sides = 6;
       int dice = 0;
       int answer = 0;
       dice = (int) (Math.random() * sides) + 1;
      }// end rollStats
      
      public void undying(){
         if(Health <= 0 && immortal == true){
            Health = 1;
         }
      }// end undying
   
 }// end NonPlayer class
