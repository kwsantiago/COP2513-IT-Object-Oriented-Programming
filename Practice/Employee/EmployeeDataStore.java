import java.io.*;
import java.util.*;
public class EmployeeDataStore extends ArrayList<Employee>{
   public void validate() throws EmployeeNotCloneableException{
      for(Employee e: this)
         if(!(e instanceof Cloneable))
            throw new EmployeeNotCloneableException("Not Cloneable" + e);
   }// end validate
   
   public Object clone(){
      EmployeeDataStore tmp = new EmployeeDataStore();
      
      for(Employee e: this)
         if(e instanceof Cloneable)
            tmp.add(e);
            
         return tmp;
   }// end clone
}// end class