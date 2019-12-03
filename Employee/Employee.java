import java.util.*;
import java.io.*;
public class Employee{
  String name;
  
  Employee(){
    name = "";
  }// end no-arg constructor
  
  Employee(String name){
    this.name = name;
  }// end constructor
  
  public String getName(){
    return name;
  }// end getter
  
  public void setName(String name){
    this.name = name;
  }// end setter
  
  public String toString(){
    return "Employee name: " + name;
  }// end toString
}// end class
