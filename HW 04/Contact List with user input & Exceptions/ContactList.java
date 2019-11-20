import java.util.*;
public class ContactList{
   private ArrayList<Contact> contacts;
   private int size;
   
   ContactList(){
      contacts =  new ArrayList<Contact>(5);
      size = 0;
   }// end no-arg constructor
   
   public boolean full(){
      if(contacts.size() == size){
         return true;
      }else{
      return false;
      }
   }// end full
   
   public void add(Contact obj){// not sure why it's supposed to be boolean
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
       if(LastName == contacts.get(i).getLastName()){
         System.out.println(contacts.get(i));  
       }
      }
   }// end search
   
   public int searchNumMatches(String LastName){
      int count = 0;
      for(int i = 0; i<contacts.size(); i++){
       if(LastName == contacts.get(i).getLastName()){
         count++;  
       }
      }
      return count;
   }// end searchNumMatches
}// end class
