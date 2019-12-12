import java.io.*;
import java.util.*;
public class COP2513Review2{
   public static void main(String args[]){
   EmployeeDataStore s = new EmployeeDataStore();
   
   s.add(new Employee("Jeffrey"));
   s.add(new Employee("Bilbo"));
   s.add(new CloneableEmployee("Kyle"));
   s.add(new CloneableEmployee("Gandalf"));
   
   System.out.println("Inital: " + s);
   
   try{
   s.validate();
   }catch(EmployeeNotCloneableException e){
      System.out.println("EmployeeNotCloneableException" + e);
   }
   
   EmployeeDataStore copy = (EmployeeDataStore)s.clone();
   
   System.out.println("After: " + copy);
   
 }// end main
}// end class