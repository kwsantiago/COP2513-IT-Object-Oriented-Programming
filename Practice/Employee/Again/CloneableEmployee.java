import java.io.*;
import java.util.*;
public class CloneableEmployee extends Employee implements Cloneable{
   CloneableEmployee(){
      super();
   }// end no-arg
   
   CloneableEmployee(String name){
      super(name);
   }// end constructor
   
   public String toString(){
      return super.toString().toUpperCase();
   }// end toString
}// end class