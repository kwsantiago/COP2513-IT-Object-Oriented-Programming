import java.util.*;
public class ContactList{
   private Contact[] contacts;
   private int size;
   
   ContactList(){
      contacts = new Contact[5];
      size = 0;
   }// end no-arg constructor
   
   public boolean full(){
      if(contacts.length == 5){
         return true;
      }else{
      return false;
      }
   }// end full
   
   public boolean add(Contact obj){
      size += 1;
      return false;
   }// end add
}// end class