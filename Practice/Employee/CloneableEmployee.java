import java.io.*;
import java.util.*;
public class CloneableEmployee extends Employee implements Cloneable{
   
   CloneableEmployee(){
      super();
   }
   
   CloneableEmployee(String name){
      super(name);
   }
   
   public String toString(){
      return super.toString().toUpperCase();
   }
}// end class