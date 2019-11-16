import java.util.*;
public class ContactList{
   private ArrayList<Contact> contacts;
   private int size;
   
   ContactList(){
      contacts =  new ArrayList<Contact>(5);
      size = 0;
   }// end no-arg constructor
   
   public boolean full(){
      if(contacts.size() == 5){
         return true;
      }else{
      return false;
      }
   }// end full
   
   public boolean add(Contact obj){
      contacts.add(obj);
      size ++;
   }// end add
   
   public void printAll(){
      for(int i = 0; i<contacts.size(); i++){
       System.out.println(contacts.get(i));  
      }
   }// end printAll
   
   public void search(String LastName){
      for(int i = 0; i<contacts.size(); i++){
       if(LastName == lastName){
         System.out.println(contacts.get(i));  
       }
      }
   }// end search
   
   public int searchNumMatches(String LastName){
      int count = 0;
      for(int i = 0; i<contacts.size(); i++){
       if(LastName == lastName){
         count++;  
       }
      }
      return count;
   }// end searchNumMatches
}// end class
