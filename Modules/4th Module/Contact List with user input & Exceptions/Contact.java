import java.util.*;
public class Contact{
   private String firstName;
   private String lastName;
   private long tel_number;
   
   Contact(String firstName, String lastName, long tel_number){
      this.firstName = firstName;
      this.lastName = lastName;
      this.tel_number = tel_number;
   }// end constructor
   
   public String getLastName(){
      return lastName;
   }// end getLastName
   
   public String toString(){
      return "Full Name: " + firstName + " " + lastName +
      "\nPhone #: " + tel_number;
   }// end toString
   
   public boolean Boolean(String lastName){
      return this.lastName.equals(lastName);
   }// end Boolean
   
   public Object getContact(){
      return Contact;
   }// end getContact 
   
}// end class