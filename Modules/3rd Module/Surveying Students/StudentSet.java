import java.util.*;
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
      studentNames.add(name);
   }// end addName
   
   public void addAge(int age){
      studentAges.add(age);
   }// end addAge
   
   public void addFavClass(String favclass){
      favoriteClasses.add(favclass);
   }// end addFavClass
   
   public void addStudent(String student_name, int student_age, String favorite_class){
      addName(student_name);
      addAge(student_age);
      addFavClass(favorite_class);
   }// end addStudent
   
   public void info_of_oldest(){
      Collections.sort(studentAges, Collections.reverseOrder());
      for(int i = 0; i<studentAges.size();i++){
       System.out.println("The name of the student is: " + studentNames.get(i) + ", the age of the student is: " + studentAges.get(i) +
       ", and the student's favorite class is: " + favoriteClasses.get(i));  
      }
   }// end info_of_oldest 
   
   public void remove_oldest(){
      Collections.sort(studentAges, Collections.reverseOrder());
      Collections.sort(studentNames, Collections.reverseOrder());
      Collections.sort(favoriteClasses, Collections.reverseOrder());
      studentAges.remove(0);
      studentNames.remove(0);
      favoriteClasses.remove(0);
   }// end remove_oldest
   
   public void info_of_youngest(){
      Collections.sort(studentAges);
      for(int i = 0; i<studentAges.size();i++){
       System.out.println("The name of the student is: " + studentNames.get(i) + ", the age of the student is: " + studentAges.get(i) +
       ", and the student's favorite class is: " + favoriteClasses.get(i));  
      }
   }// end info_of_oldest 
   
   public void remove_youngest(){
      Collections.sort(studentAges);
      Collections.sort(studentNames);
      Collections.sort(favoriteClasses);
      studentAges.remove(0);
      studentNames.remove(0);
      favoriteClasses.remove(0);
   }// end remove_oldest
                          
   public String toString(){
      for(int i = 0; i<studentNames.size();i++){
       System.out.println("Student's name is " + studentNames.get(i) + ", age is " + studentAges.get(i) + ", favorite class is " + favoriteClasses.get(i));  
      }
      return "";
   }// end toString
}
