import java.io.*;
import java.util.*;
public class COP2513Review2{
   public static void main(String args[]){
      EmployeeDataStore s = new EmployeeDataStore();
      
      s.add(new Employee("John"));
      s.add(new Employee("Alphey"));
      s.add(new CloneableEmployee("Wako"));
      s.add(new CloneableEmployee("Lonko"));
      
      System.out.println("Displaying the data store's contents:\n\t" + s);
      
      EmployeeDataStore copy = (EmployeeDataStore)(s.clone());
      
      try{
      s.validate();
      }catch(EmployeeNotCloneableException e){
         System.out.print("yup it didn't work..." + e + "\n");
      }
      
      System.out.print(s);
      
   }// end main
}// end class