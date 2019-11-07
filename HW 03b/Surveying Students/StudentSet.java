import java.util.ArrayList;
public class StudentSet{
   private ArrayList<String> studentNames;
   private ArrayList<Integer> studentAges;
   private ArrayList<String> favoriteClasses;
   
   StudentSet(ArrayList<String> names, ArrayList<Integer> ages, ArrayList<String> favclasses){
      this.studentNames = names;
      this.studentAges = ages;
      this.favoriteClasses = favclasses;
   }// end constructor
   
   public void addName(String name){
      this.studentNames = name;
   }// end addName
   
   public void addAge(int age){
      this.studentAges = age;
   }// end addAge
   
   public void addFavClass(String favclass){
      this.favoriteClasses = favclass;
   }// end addFavClass
   
   public void addStudent(String student_name, int student_age, String favorite_class){
      addName(student_name);
      addAge(student_age);
      addFavClass(favorite_class);
   }// end addStudent
   
   /*public void info_of_oldest(){
      for(int i = 0; i<studentNames.size();i++){
       System.out.println("The name of the student is: );  
      }
   }// end info_of_oldest */
   
   /*public void info_of_youngest(){
      for(int i = 0; i<studentNames.size();i++){
       System.out.println("The name of the student is: );  
      }
   }// end info_of_oldest */
                          
   public String toString{
      return "";
   }// end toString
}
