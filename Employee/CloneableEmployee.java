import java.util.*;
import java.io.*;
public class CloneableEmployee extends Employee{
  CloneableEmployee(){
    super();
  }// end no-arg constructor
  
  CloneableEmployee(String name){
    super(name);
  }// end constrctor
  
  public String toString(){
    return super.getName().toUpperCase;
  }// end toString
}// end class
