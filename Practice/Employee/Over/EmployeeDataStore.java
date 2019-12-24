import java.util.*;
import java.io.*;
public class EmployeeDataStore extends ArrayList<Employee>{
   public void validate() throws EmployeeNotCloneableException{
      for(Employee e: this)
         if(!(e instanceof Cloneable))
            throw new EmployeeNotCloneableException("not cloneable");
            }
            
   public Object clone(){
      EmployeeDataStore tmp = new EmployeeDataStore();
      
      for(Employee e: this)
         if(e instanceof Cloneable)
            tmp.add(e);
            
         return tmp;
   }// end clone
}// end class

 class EmployeeNotCloneableException extends Exception{
   EmployeeNotCloneableException(String msg){
      super(msg);
      }}