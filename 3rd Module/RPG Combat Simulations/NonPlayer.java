public class NonPlayer extends CharacterMaker{
         private boolean immortal;
         private String role;
         private double exp;
         private int gold;
         private int dmg;
         private int dice;
   
      NonPlayer(String Name, int Health, int Mana, boolean immortal,String role,double exp,int gold,int dice) {
         super(Name, Health, Mana);
         this.immortal = immortal;
         this.role = role;
         this.exp = exp;
         this.gold = gold;
         this.dice = dice;
   }// end of constructor for my values
   
      NonPlayer(String Name, int Health, int Mana, boolean monster) {
         super(Name, Health, Mana);
         if(monster == true){
            this.role = "monster";
         }else{
         this.role = "villager";
         }// end if else
         this.exp = 1000;
         this.gold = 50;
         this.immortal = false;
   }// end of constructor for my values
   
   public double getExp(){
      return exp;
      }// end getter
      
      public int getGold(){
      return gold;
      }// end getter
      
      private void rollDice(){
       int sides = 20;
       int dice = 0;
       int answer = 0;
       this.dice = (int) (Math.random() * sides) + 1;
      }// end rollDice
      
      public int attack(){
         rollDice();
         if(dice==1){
           dmg = 0;
         }else if(dice==20){
            dmg = 5*20;
         }else{
            dmg = dice*2;
         }
         
         System.out.println(getName() + " does " + dmg + " damage!!!\n");
         return dmg;
      }// end attack
      
      public void undying(){
         if(getHealth() <= 0 && immortal == true){
            setHealth(1);
         }
      }// end undying
      
      public void takeDamage(int a){
         setHealth(getHealth()-a);
         undying();
      }// end takeDamage
      
      public String toString() {
            String Results =  "Name " + getName() + ". \n" +
            "Health " + getHealth() + ". \n" + 
            "Mana " + getMana() + "\nRole " + role +"\nExp " + exp + "\nGold " +
            gold;
      
            Results += " \n";
      
            return Results;
       }// end of method
   
 }// end NonPlayer class
