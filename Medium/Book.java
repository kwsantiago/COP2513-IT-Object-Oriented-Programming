import java.util.*;
public class Book extends Medium{
   private int length;
   private boolean isDigital;
   
   Book(){
      setTitle("");
      setAuthor("");
      length = 0;
      isDigital = false;
   }// end no-arg constructor
   
   Book(String title, String author, int length, boolean isDigital){
      super(title, author);
      this.length = length;
      this.isDigital = isDigital;
   }// end constructor
   
   public int getLength(){
      return length;
   }// end getter
   
   public void setLength(int length){
      this.length = length;
   }// end setter
   
   public boolean getIsDigital(){
      return isDigital;
   }// end getter
   
   public void setIsDigital(boolean isDigital){
      this.isDigital = isDigital;
   }// end setter
   
   public String toString(){
      return super.toString() + "Length: " + length + "\nisDigital: " + isDigital + "\n";
   }// end toString
}// end class