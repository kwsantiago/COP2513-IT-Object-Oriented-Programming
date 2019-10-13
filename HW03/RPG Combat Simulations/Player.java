public class Player extends Playable{
         //private String[] skills;
         private String profession;
         private int level;
         private double currExp;
         private double expRequired;
         
         Player(String Name, int Health, int Mana, String profession, int level, ){
            this.Name = Name;
            this.Health = Health;
            this.Mana = Mana;
            this.profession = profession;
            this.level = level;
            //enter skill here
            currExp = 0;
            expRequired = 1000;
         }// end 1st constructor
         
         Player(String Name, int Health, int Mana){
            this.Name = Name;
            this.Health = Health;
            this.Mana = Mana;
            // enter skill here with array size 10
            currExp = 0;
            expRequired = 1000;
         }// end 2nd constructor
         
         //getter and setter for skills goes here
         
         public int getProfession(){
             return profession;
          }// end getter
   
         public void setProfession(String profession){
             this.profession = profession;
          }// end setter
          
          public int getLevel(){
             return level;
          }// end getter
   
         public void setLevel(int level){
             this.level = level;
          }// end setter
          
          public void gainExp(double x){
            if(currExp > expRequired){
               gainLevel();
            }
            else{
            currExp = currExp + x;
            }
          }// end gainExp
          
          public void gainLevel(){
            level = level++;
            currExp = 0;
            expRequired = 2;
          }// end gainExp
          
          public int rollDice(){
            int sides = 6;
            int dice;
            dice = (int) (Math.random() * sides) + 1;
            return dice;
          }// end rollDice
         
 }// end Player class
