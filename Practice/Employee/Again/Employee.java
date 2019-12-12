import java.io.*;
import java.util.*;
public class Employee{
   String name;
   
   Employee(){
      this("anonymous");
   }// end no-arg
   
   Employee(String name){
      this.name = name;
   }// end no-arg
   
   public Object clone(){
      return new Employee(this.name);
   }// end clone
   
   public String toString(){
      return "<" + name + ">";
   }// end toString
}//end class