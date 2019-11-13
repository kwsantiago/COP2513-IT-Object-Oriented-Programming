import java.util.*;

public class SpellException{
   private int mana;
   private String[] spells;
   private int[] spellDamage;
   private int[] spellCost;
   private String recentSpell;
   private int spellIndex;
   
   SpellException(int mana, int[] spellDamage, int[] spellCost){
      if(spellDamage.length == 0 || spellCost.length == 0 || spellDamage.length != spellCost.length){
         throw new ArithmeticException("Array length cannot be zero and must match each other in length.");
      }
      if(mana < 0){
         throw new ArithmeticException("Mana cannot be less than 0.");
      }
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
}// end class