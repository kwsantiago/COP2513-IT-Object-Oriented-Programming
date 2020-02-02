public class Main {   
       
   public static void main(String[] args) {
      String[] p = {"Code", "Study","Coffee bomb", "Pencil rocket"};
      Player player = new Player("Kyle Santiago",1000,500,"student",1, p);
      System.out.println(player.toString());
      NonPlayer nonplayer = new NonPlayer("Gondor",500,500,true);
      System.out.println(nonplayer.toString());
      int count = 0;
      while(player.getHealth()>0 && nonplayer.getHealth()>0){
         count++;
         System.out.println("Turn: " + count);
         int dmg = player.attack();
         nonplayer.takeDamage(dmg);
         dmg = nonplayer.attack();
         player.defend(dmg);
      }// end while
      if(player.getHealth()>0){
         player.gainExp(nonplayer.getExp());
         System.out.println(player.getName() + " Won!\n");
      }else{
         System.out.println(nonplayer.getName() + " Won!\n");
      }// end if
      System.out.println("If " + player.getName() + " won, change in level would be seen here:\n" + player.toString());
   }// end of main

}// end of class