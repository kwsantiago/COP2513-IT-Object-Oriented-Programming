/**
* Kyle Santiago 11/01/2019 
**/
import java.util.ArrayList;
import java.util.Random;
public class SpellBook extends ArrayList<String>{
   Random object;
   
   SpellBook(){
      super();
      object = new Random();
   }// end no-arg constructor
   
   public void addAfter(String s1, String s2){
      SpellBook.add(s1,s2);
   }// end addAfter
   
   public void counterSpell(){
      
   }// end counterSpell
   
   public void inventSpell(){
      
   }// end inventSpell
   
   public String castSpell(){
      
   }// end castSpell
   
   public void forgetSpell(){
      
   }// end forgetSpell
   
   public String toString(){
      return "Page 1:\n" + SpellBook();
   }// end toString

}// end calss