/**
* Kyle Santiago 10/08/2019
* Implement a class named CharacterMaker and its two subclasses named Playable and
NonPlayer. Also implement a class named Player as a subclass of Playable. 
**/
public class CharacterMaker {
   private String Name;
   private int Health;
   private int Mana;
   
   CharacterMaker(String Name, int Health, int Mana) {
      this.Name = Name;
      this.Health = Health;
      this.Mana = Mana;
   }// end of constructor
   
   public String getName(){
      return Name;
   }// end getName
   
   public void setName(String Name){
      this.Name = Name;
   }// end setName
   
   public double getHealth(){
      return Health;
   }// end getHealth
   
   public void setHealth(int Health){
      this.Health = Health;
   }// end setZ
   
   public int getMana(){
      return Mana;
   }// end getMana
   
   public void setMana(int Mana){
      this.Mana = Mana;
   }// end setMana
      
   public String toString() {
      String Results =  "Name " + Name + ". \n" +
      "Health " + Health + ". \n" + 
      "Mana " + Mana + ". \n";
      
      //Results += ". \n";
      
      return Results;
   }// end of method

}// end of class