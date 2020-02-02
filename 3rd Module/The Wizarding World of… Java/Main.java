public class Main{
public static void main(String[] args){
  String[] a = {"fireball","sandstorm","earthen hand","word of death"};
  String[] b = {"prismatic orb","fireball","cloudkill","word of death"};
  SpellBook book1 = new SpellBook();
  SpellBook book2 = new SpellBook();
  int sizeA = a.length;
  int sizeB = b.length;
      for(int i = 0;i<sizeA;i++){
         book1.add(i,a[i]);
         }
      for(int i = 0;i<sizeB;i++){
         book2.add(i,b[i]);
         }
         System.out.println(book1.toString());
  book1.inventSpell();
  book2.inventSpell();
  book1.addAfter("fireball","snowball");
  book1.forgetSpell("sandstorm");
  book1.counterSpell(book2.castSpell());
  book1.counterSpell(book2.castSpell());
  book1.counterSpell(book2.castSpell());
  book2.counterSpell(book1.castSpell());
  book2.counterSpell(book1.castSpell());
  book2.counterSpell(book1.castSpell());
  System.out.println(book1.toString());
  System.out.println(book2.toString());
  }// end main
}//end class
