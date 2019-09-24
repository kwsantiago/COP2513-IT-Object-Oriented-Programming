/**
* This is our COP2513 template
* Kyle Santiago 9/18/2019
* Exercise #1 – Role Playing Game Class 
**/
import java.util.Scanner; // Scanner is in the java.util package
public class COP2513HW01E1 {
   String name;
   String profession;
   int health;
   int mana;
   int level;
   double experience;
   double levelup;
   
   COP2513HW01E1() {
      name = "";
      profession = "";
      health = 0;
      mana = 0;
      level = 1;
      experience = 0.0; 
      levelup = 0.0;
   }// end of constructor for default values
   
   COP2513HW01E1(String name, String profession, int health, int mana, int level, double experience, double levelup) {
      this.name = name;
      this.profession = profession;
      this.health = health;
      this.mana = mana;
      this.level = level;
      this.experience = experience; 
      this.levelup = levelup;
   }// end of constructor for my values
   
   private String getName(){
      return name;
   }// end getName
   
   private void setName(String name){
      this.name = name;
   }// end setName
   
   private String getProfession(){
      return profession;
   }// end getProfession
   
   private void setProfession(String profession){
      this.profession = profession;
   }// end setProfession
   
   private int getHealth(){
      return health;
   }// end getHealth
   
   private void setHealth(int health){
      this.health = health;
   }// end setHealth
   
   private int getMana(){
      return mana;
   }// end getMana
   
   private void setMana(int mana){
      this.mana = mana;
   }// end setMana
   
   public void gainExperience(double exp){
      double sumExp = experience += exp; 
      if(sumExp > levelup){
      gainLevel();
      }
      
   }// end gainExperience
   
   public double getProgress(){
      double prog = experience / levelup;
      return prog;
   }// end getProgress
   
   public void gainLevel(){
      level++;
      experience = 0;
   }// end gainExperience
   
   public String toString() {
      return "The name of the character is " + name + ". \n" +
      "The profession of the character is " + profession + ". \n" +
      "The health of the character is " + health + ". \n" +
      "The mana of the character is " + mana + ". \n" +
      "The level of the character is " + level + ". \n" +
      "The character needs " + levelup + " to level up. \n";
   }// end of method
   
   public static void main(String[] args) {
      COP2513HW01E1 Mitsuki = new COP2513HW01E1("Mitsuki Saiga", "Hero", 1000, 1000, 999, 1, 999);
      COP2513HW01E1 Anorak = new COP2513HW01E1("Anorak", "Magus", 9999, 9999, 999, 1, 999);      
      System.out.println(Mitsuki.toString());
      System.out.println(Anorak.toString());
   }// end of main

}// end of class