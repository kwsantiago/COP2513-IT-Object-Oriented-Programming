public class Player extends Playable{
         private String[] skills;
         private String profession;
         private int level;
         private double currExp;
         private double expRequired;
         
         Player(String Name, int Health, int Mana, String profession, int level, String[] skills){
            super(Name,Health,Mana);
            this.profession = profession;
            this.level = level;
            this.skills = skills;
            currExp = 0;
            expRequired = 1000;
         }// end 1st constructor
         
         Player(String Name, int Health, int Mana){
            super(Name,Health,Mana);
            skills = new String[10];
            currExp = 0;
            expRequired = 1000;
         }// end 2nd constructor
         
         public String getSkills(int i){
            if(i<0 || i>skills.length){
            return "";
            }else{
            return skills[i];
            }
         }// end getter
         
         public void setSkills(String a){
            boolean flag = true;
            for(int i=0; i<skills.length;i++){
               if(skills[i]==""){
                  skills[i] = a;
                  flag = false;
                  break;
               }
            } 
            if(flag){
               String[] tmp = new String[skills.length*2];
               for(int i=0;i<skills.length;i++){
                  tmp[i]=skills[i];
               }
               tmp[skills.length]=a;
               skills=tmp;
            }
            
         }// end setter
         
         public String getProfession(){
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
            expRequired = 2*expRequired;
          }// end gainExp
          
          public int rollDice(){
            int sides = 6;
            int dice;
            dice = (int) (Math.random() * sides) + 1;
            return dice;
          }// end rollDice
          
          public int attack(){
            int a =0;
            a = getSTR() + rollDice() + rollDice() + rollDice();
            System.out.println("Damage dealt: ");
            return a;
          }// end attack
          
          public void defend(int dmg){
            int a = (getCON() + rollDice() + rollDice())-(dmg);
            if(a>0){
            System.out.println("No damange was taken.");
            }
            else{
               int tmp = getHealth();
               setHealth(tmp+a);
            }
          }// end defend 
          
          public int castSkill(int a){
            String skill = getSkills(a);
            if(skill==""){
               System.out.println("There is no skill.");
               return 0;
            }else{
               System.out.println("The skill used is "+ skill);
               return getWIS() + rollDice();
            }
          }// end castSkill
          
          public String toString() {
            String Results =  "Name " + getName() + ". \n" +
            "Health " + getHealth() + ". \n" + 
            "Mana " + getMana() + "\nLevel " + getLevel() + "\nProfession " + getProfession()+"\n"+
            "Skills ";
            
            for(int i=0;i<skills.length;i++){
                  Results += skills[i] + " ";
                  }  
      
            Results += " \n";
      
            return Results;
       }// end of method
         
 }// end Player class
