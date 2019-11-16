import java.util.*;
public class Video extends Medium{
   private int duration;
   private String director;
   
   Video(){
      setTitle("");
      setAuthor("");
      director = "";
      duration = 0;
   }// end no-arg constructor
   
   Video(String title, String author, int duration, String director){
      super(title, author);
      this.duration = duration;
      this.director = director;
   }// end constructor
   
   public int getDuration(){
      return duration;
   }// end getter
   
   public void setDuration(int duration){
      this.duration = duration;
   }// end setter
   
   public String getDirector(){
      return director;
   }// end getter
   
   public void setDirector(String director){
      this.director = director;
   }// end setter
   
   public String toString(){
      return super.toString() + "Duration: " + duration + "\nisDirector: " + director + "\n";
   }// end toString
}// end class