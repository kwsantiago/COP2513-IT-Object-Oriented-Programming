/**
* This is our COP2513 template
* Kyle Santiago 9/26/2019
* Exercise #1 – Characters w/ Status for RPGs 
**/
public class CharacterWithStatus{
   String name;
   int health;
   int mana;
   String status;
   int dice;
   
   CharacterWithStatus() {
      name = "";
      health = 0;
      mana = 0;
   }// end of constructor for default values
   
   CharacterWithStatus(String name, int health, int mana) {
      this.name = name;
      this.health = health;
      this.mana = mana;
   }// end of constructor for my values
   
   public String getName(){
      return name;
   }// end getName
   
   public void setName(String name){
      this.name = name;
   }// end setName
   
   public int getHealth(){
      return health;
   }// end getHealth
   
   public void setHealth(int health){
      this.health = health;
   }// end setHealth
   
   public int getMana(){
      return mana;
   }// end getMana
   
   public void setMana(int mana){
      this.mana = mana;
   }// end setMana
   
   public void rollDice(){
      int sides = 6;
      dice = (int) (Math.random() * sides) + 1;
      updateStatus();
   }// end rollDice
   
   public void updateStatus(){
      if(dice == 1){
         status = "dead";
         health = 0;
         mana = 0;
      }
      else if(dice == 2){
         status = "stunned";
      }
      else if(dice == 3){
         status = "poisoned";
      }
      else if(dice == 4){
         status = "sleeping";
      }
      else if(dice == 5){
         status = "half dead";
         health = health / 2;
         mana = mana / 2;
      }
      else{
         status = "revive";
         health = 100;
         mana = 100;
      }
   }// end updateStatus
   
   public String describeStatus(){
      if(status == "revive"){
      return "It appears fate wants you to live another day"; 
      }
      else if(status == "dead"){
      return "It appears fate wanted you dead";
      }
      else if(status == "poisoned"){
      return "Fate has it that you suffer slowly"; 
      }
      else if(status == "stunned"){
      return "Fate wants you to live in the moment and stand still";
      }
      else if(status == "sleeping"){
      return "Fate says take a nice rest";
      }
      else if(status == "half dead"){
      return "Fate has spare your life"; 
      }
      else{
      return "Test your fate and roll the dice";
      }
   }// end describeStatus
   
   public String toString() {
      String Results =  "The name of the character is " + name + ". \n" +
         "The health of the character is " + health + ". \n" +
         "The mana of the character is " + mana + ". \n" +
         "The status of the character is: ";
      
      Results += describeStatus();
      
      Results += ". \n";
      
      return Results;
   }// end of method
   
   public static void main(String[] args) {
      CharacterWithStatus character = new CharacterWithStatus("Kyle Santiago", 1000, 1000);
      character.rollDice();
      System.out.println(character.toString());
   }// end of main

}// end of class