/**
Kyle Santiago 11/01/2019 
**/
import java.util.ArrayList;
import java.util.Random;
public class SpellBook extends ArrayList<String>{
   Random random;
   public ArrayList<String> SpellBook;
   
   SpellBook(){
      super();
      SpellBook = new ArrayList<String>();
      random = new Random();
   }// end no-arg constructor
   
   public void add(int i, String s){
      SpellBook.add(i,s);
   }// end add
   
   public void addAfter(String s1, String s2){
      int i;
      int size = SpellBook.size();
      for(i = 0;i<size;i++){
         if(SpellBook.get(i)==s1){
            break;
            }
      }// end for
      SpellBook.add(i,s2);
   }// end addAfter
   
   public void counterSpell(String s1){
      int i;
      String tmp = "";
      int size = SpellBook.size();
      for(i = 0;i<size;i++){
         if(SpellBook.get(i)==s1){
            System.out.println("turn to page " + i);
            tmp = SpellBook.get(i);
            break;
            }
      }// end for
      for(int n = tmp.length()-1; n>=0;n--){
         System.out.print(tmp.charAt(n));
      }
      System.out.println("dodge");
   }// end counterSpell
   
   public void inventSpell(){
      int r1 = random.nextInt(SpellBook.size());
      int r2 = random.nextInt(SpellBook.size());
      String s1 = SpellBook.get(r1) + SpellBook.get(r2);
      SpellBook.add(s1);
   }// end inventSpell
   
   public String castSpell(){
      int r = random.nextInt(SpellBook.size()-1);
      return SpellBook.get(r);
   }// end castSpell
   
   public void forgetSpell(String s1){
      int i;
      int size = SpellBook.size();
      for(i = 0;i<size;i++){
         if(SpellBook.get(i)==s1){
            SpellBook.remove(i);
            break;
            }
      }// end for
   }// end forgetSpell
   
   public String toString(){
      int i;
      int size = SpellBook.size();
      String tmp = "";
      for(i = 0;i<size;i++){
         tmp += "Page " + (i+1) + " " + SpellBook.get(i) + " \n";
            }// end for
      return tmp;
   }// end toString

}// end calss