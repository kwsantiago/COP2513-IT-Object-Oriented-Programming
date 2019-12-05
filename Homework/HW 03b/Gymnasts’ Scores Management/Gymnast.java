import java.util.*; 
public class Gymnast{
   private String firstName;
   private String lastName;
   private ArrayList<Double> scores;
   
   Gymnast(){
      firstName = "John";
      lastName = "Doe";
      scores = new ArrayList<Double>();
   }// end no-arg constructor
   
   Gymnast(String firstName, String lastName, ArrayList<Double> scores){
      this.firstName = firstName;
      this.lastName = lastName;
      this.scores = scores;
   }// end constructor
   
   public String getFirstName(){
      return firstName;
   }// end getter
   
   public void setFirstName(String FirstName){
      this.firstName = FirstName;
   }// end setter
   
   public String getLastName(){
      return lastName;
   }// end getter
   
   public void setLastName(String lastName){
      this.lastName = lastName;
   }// end setter
   
   public ArrayList<Double> getScores(){
      return scores;
   }// end getter
   
   public void setScores(ArrayList<Double> scores){
      this.scores = scores;
   }// end setter
   
   public void addScore(double score){
      scores.add(score);
   }// end addScore
   
   public double calculateTotalScore(){
      double sum = 0;
      Collections.sort(scores);
      scores.remove(0);
      scores.remove(scores.size()-1);
      for(int i = 0; i<scores.size();i++){
         sum += scores.get(i);
      }
      return sum;
   }// end calculateTotalScore 
   
   public String display(){
      return "Name: " + firstName + " " + lastName + "\nScore1: " + scores.get(0) + "\nScore2: " + scores.get(1)+
      "\nScore3: " + scores.get(2) + "\nScore4: " + scores.get(3) + "\nScore5: " + scores.get(4) + "\nScore6: " + scores.get(5) +
      "\nScore7: " + scores.get(6) + "\nScore8: " + scores.get(7) + "\nFinal Score: " + calculateTotalScore() + "\n";
   }// end display

}// end class