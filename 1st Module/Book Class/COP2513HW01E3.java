/**
* This is our COP2513 template
* Kyle Santiago 9/23/2019
* Exercise #3 � Book Class 
**/
import java.util.Scanner; // Scanner is in the java.util package
public class COP2513HW01E3 {
   final int reserved = -1;
   final int checked = 0;
   final int returned = 1;
   private String title;
   private String author;
   private int year;
   private int status;
   
   COP2513HW01E3() {
   title = "Harry Potter and The Goblet of Fire";
   author = "J.K. Rowling";
   year = 2000;
   status = returned;
   
   }// end of constructor //// AKA default values
   
   COP2513HW01E3(String title, String author, int year, int status) {
   this.title = title;
   this.author = author;
   this.year = year;
   this.status = status;
   
   }// end of constructor //// AKA My values
   
   public String toString() {
   
   String Results = "The name of the book is " + title + ". \n" +
      "The author of the book is " + author + ". \n" +
      "The year of the book is " + year + ". \n" +
      "The status of the book is ";
      
   if(status == -1){
         Results += "RESERVED";
         }// end if
      else if(status == 0){
         Results += "CHECKED";
         }// end if
         else {
         Results += "RETURNED";
         }// end if
         
         Results += ". \n";
         
         return Results;
      
   }// end of method
   
   public static void main(String[] args) {
      COP2513HW01E3 Marley = new COP2513HW01E3("Marley and Me", "John Grogan", 2005, -1);
      COP2513HW01E3 Thief = new COP2513HW01E3("The Book Thief", "Markus Zusak", 2005, 0);
      System.out.println(Marley.toString());
      System.out.println(Thief.toString());
   }// end of main

}// end of class