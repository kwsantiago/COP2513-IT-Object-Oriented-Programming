import java.util.*;
public class Medium{
   private String title;
   private String author;
   
   Medium(){
      title = "";
      author = "";
   }// end no-arg constructor
   
   Medium(String title, String author){
      this.title = title;
      this.author = author;
   }// end constructor
   
   public String getTitle(){
      return title;
   }// end getter
   
   public void setTitle(String title){
      this.title = title;
   }// end setter
   
   public String getAuthor(){
      return author;
   }// end getter
   
   public void setAuthor(String author){
      this.author = author;
   }// end setter
   
   public String toString(){
      return "Title: " + title + "\nAuthor: " + author + "\n";
   }// end toString
}// end class