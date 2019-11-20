import java.util.*;
public class MainDriver{
    public static void menu(){
      System.out.println("1. Add a contact to the list.\n" +
      "2. Print out all list contacts.\n" +
      "3. Search for a contact last name.\n" + 
      "4. Quit.\n");
    }// end menu
    public static void main(String args[]){
    Scanner scanner = new Scanner(System.in);
    ContactList cl = new ContactList();
    
    
    while(true){
    menu();
    int input = scanner.nextInt();
    
    if(input == 1){
    System.out.println("Enter the contact you'd like to add: ");
    if(cl.full() == false){
    Contact contact = new Contact("", "", 0);
    contact.getContact();
    cl.add(contact);
    }
    }else if(input == 2){
    cl.printAll();
    }else if(input == 3){
    
    }else if(input == 4){
    break;
    }else{
    System.out.println("Invalid Input.");
    }
    }
  }// end main
}// end class
