public class Main{
  String[] a = {"fireball","sandstorm","earthen hand","word of death"};
  String[] a = {"prismatic orb","fireball","cloudkill","word of death"};
  SpellBook book1 = new SpellBook(a);
  SpellBook book2 = new SpellBook(b);
  book1.inventSpell();
  book2.inventSpell();
  book1.addAfter("fireball","snowball");
  book1.forgetSpell("sandstorm");
  book1.castSpell(book2.counterSpell());
  book1.castSpell(book2.counterSpell());
  book1.castSpell(book2.counterSpell());
  book2.castSpell(book1.counterSpell());
  book2.castSpell(book1.counterSpell());
  book2.castSpell(book1.counterSpell());
  System.out.println(book1.toString());
  System.out.println(book2.toString());
}//end class
