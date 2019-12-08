import java.io.*;
import java.util.*;
public class Employee{
   String name;
   
   Employee(){
      this("anonymous");
   }
   
   Employee(String name){
      this.name = name;
   }
   
   public String toString(){
      return "<" + this.name + ">";
   }
   
   public Object clone(){
      return new Employee(this.name);
   }// end clone
}// end class