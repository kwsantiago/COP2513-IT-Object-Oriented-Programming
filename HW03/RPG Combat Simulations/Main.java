public class Main {   
       
   public static void main(String[] args) {
      String[] p = {"Code", "Study","Coffee bomb", "Pencil rocket"};
      Player player = new Player("Kyle Santiago",100,500,"student",1, p);
      System.out.println(player.toString());
      NonPlayer nonplayer = new NonPlayer("Gondor",500,500,true);
      System.out.println(nonplayer.toString());
      int count = 0;
      while(player.getHealth()>0 || nonplayer.getHealth()>0){
         System.out.println(count);
         player.attack(nonplayer.takeDamage());
         nonplayer.attack(player.defend());
      }// end while
   }// end of main

}// end of class