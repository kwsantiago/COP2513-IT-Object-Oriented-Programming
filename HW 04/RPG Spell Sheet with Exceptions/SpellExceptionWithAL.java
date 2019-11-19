import java.util.*;
//this class uses ArrayList
public class SpellExceptionWithAL{
   private int mana;
   private ArrayList<String> spells;
   private ArrayList<Integer> spellDamage;
   private ArrayList<Integer> spellCost;
   private String recentSpell;
   private int spellIndex;
   
   SpellExceptionWithAL(int mana, ArrayList<Integer> spellDamage, ArrayList<Integer> spellCost){
      if(spellDamage.size() == 0 || spellCost.size() == 0 || spellDamage.size() != spellCost.size()){
         throw new ArithmeticException("Array length cannot be zero and must match each other in length.");
      }
      if(mana < 0){
         throw new ArithmeticException("Mana cannot be less than 0.");
      }
      spells = new ArrayList<String>();
      spellDamage = new ArrayList<Integer>();
      spellCost = new ArrayList<Integer>();
      this.mana = mana;
      this.spellDamage = spellDamage;
      this.spellCost = spellCost;
   }// end constructor
   
   public int getMana(){
      if(mana < 0){
         throw new ArithmeticException("Mana cannot be less than 0.");
      }
      return mana;
   }// end getter
   
   public void setMana(int mana){
      if(mana < 0){
         throw new ArithmeticException("Mana cannot be less than 0.");
      }
      this.mana = mana;
   }// end setter
   
   public String getSpell(){
      int i = (int)Math.random() * spells.size();
      return spells.get(i);
   }// end getSpell
   
   public String getSpell(int i){
      if(i < 0 || i > spells.size()){
         throw new ArithmeticException("Must be inside Spells array.");
      }
      return spells.get(i);
   }// end getSpell overload
   
   public void addSpell(String spell){
      spells.add(spell);
   }// end addSpell
   
   public void addSpellDamage(int dmg){
      spellDamage.add(dmg);
   }// end addSpell
   
   public void addManaCost(int manaCost){
      spellCost.add(manaCost);
   }// end addSpell
   
   public void removeSpell(){
      int i = (int)Math.random() * spells.size();
      spells.remove(i);
   }// end removeSpell 
   
   public void removeSpell(int a){
      spells.remove(a);
   }// end removeSpell overload
   
   public void listSpell(){
      int count = 0;
      for(int i = 0; i<spells.size(); i++){
      System.out.println(count + ".   " + spells.get(i));
      count++; //INCOMPLETE
      }
   }// end listSpell
   
   public int getSpellCost(){
      return spellCost.size()-1;
   }// end getter
   
   public int getSpellDamage(){
      return spellDamage.size()-1;
   }// end getter
   
   public void removeSpellDamage(){
      int s = spellDamage.size()-1;
      spellDamage.remove(s);
   }// end removeSpellDamage
   
   public void removeSpellCost(){
      int s = spellCost.size()-1;
      spellCost.remove(s);
   }// end removeSpellCost
   
   public String toString(){
      return "You the great archmage have\nMana: " + mana + "\n" +
      "Recently used " + getSpell() + " which cost " + spellCost + " mana and dealt " + spellDamage + "\n";
   }// end toString
   
   public static void main(String args[]){
      ArrayList<Integer> array1 = new ArrayList<Integer>();
      array1.add(1);
      ArrayList<Integer> array2 = new ArrayList<Integer>();
      array2.add(1);
      array2.add(1);
      SpellExceptionWithAL object1 = new SpellExceptionWithAL(0, array1, array2);
      
      ArrayList<Integer> array3 = new ArrayList<Integer>();
      SpellExceptionWithAL object2 = new SpellExceptionWithAL(0, array2, array3);
      
      ArrayList<Integer> spellDamage = new ArrayList<Integer>();
      spellDamage.add(100);
      spellDamage.add(2000);
      spellDamage.add(100);
      ArrayList<Integer> spellCost = new ArrayList<Integer>();
      spellCost.add(50);
      spellCost.add(2000);
      spellCost.add(50);
      SpellExceptionWithAL object3 = new SpellExceptionWithAL(1000, spellDamage, spellCost);
      object3.addSpell("slash");
      object3.addSpell("fireball");
      object3.addSpell("pounce");
      
      object3.getSpell(1);
      object3.getSpell();
      object3.listSpell();
      object3.addSpell("flashstrike");
      object3.listSpell();
      object3.removeSpell();
      object3.listSpell();
   }// end main
   
}// end class