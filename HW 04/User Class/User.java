import java.util.*;
public class User{
  private String firstName;
  private String lastName;
  private int age;
  private String userID;
  private String phoneNum;
  
  User(){
    firstName = "";
    lastName = "";
    age = 21;
    userID = "";
    phoneNum = "";
  }// end no-arg constructor
  
  User(String firstName, String lastName, int age, String userID, String phoneNum){
    if(age < 0 || age > 99){
      throw new ArithmeticException("Age must be between 0 and 99.");
    }
    if(userID.length() < 8 /*add at least one number here*/){
      throw new ArithmeticException("Invalid user ID.");
    }
    if(phoneNum.length() > 10){
      throw new ArithmeticException("Phone number cannot be longer than 10 digits.");
    }
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.userID = userID;
    this.phoneNum = phoneNum;
  }// end constructor
  
  public String getFirstName(){
    return firstName;
  }// end getter
  
  public void setFirstName(String firstName){
    this.firstName = firstName;
  }// end setter
  
  public String getLastName(){
    return lastName;
  }// end getter
  
  public void setLastName(String lastName){
    this.lastName = lastName;
  }// end setter
  
  public int getAge(){
  if(age < 0 || age > 99){
      throw new ArithmeticException("Age must be between 0 and 99.");
    }
    return age;
  }// end getter
  
  public void setAge(int age){
  if(age < 0 || age > 99){
      throw new ArithmeticException("Age must be between 0 and 99.");
    }
    this.age = age;
  }// end setter
  
  public String getUserID(){
  int count = 0;
  for(int i = 0; i<userID.length();i++){
  char ch = userID.charAt(i);
   if(Character.isDigit(ch) == true)
   count++;
  }
  if(userID.length() < 8 || count == 0){  
      throw new ArithmeticException("Invalid user ID.");
    }
    return userID;
  }// end getter
  
  public void setUserID(String userID){
  int count = 0;
  for(int i = 0; i<userID.length();i++){
  char ch = userID.charAt(i);
   if(Character.isDigit(ch) == true)
   count++;
  }
  if(userID.length() < 8 || count == 0){  
      throw new ArithmeticException("Invalid user ID.");
    }
    this.userID = userID;
  }// end setter
  
  public String getPhoneNum(){
  if(phoneNum.length() > 10){
      throw new ArithmeticException("Phone number cannot be longer than 10 digits.");
    }
    return phoneNum;
  }// end getter
  
  public void setPhoneNum(String phoneNum){
  if(phoneNum.length() > 10){
      throw new ArithmeticException("Phone number cannot be longer than 10 digits.");
    }
    this.phoneNum = phoneNum;
  }// end setter
  
  public boolean isValidUserID(String userID){
  boolean isValid = true;
  int count = 0;
  for(int i = 0; i<userID.length();i++){
  char ch = userID.charAt(i);
   if(Character.isDigit(ch) == true)
   count++;
  }
  if(userID.length() < 8 || count == 0){  
      isValid = false;
      throw new ArithmeticException("Invalid user ID.");
    }
    return isValid;
  }// end isValidUserID
  
  public String deconstructPhone(){
    return "Area Code: " + phoneNum.substring(0,3) + 
    "\nPhone Number: " + phoneNum.substring(3,phoneNum.length());
  }// end deconstructPhone
  
  public String display(){
    return "Name: " + firstName + " " + lastName +
    "\nAge: " + age + "\nUserID: " + userID +
    "\nPhone Number: " + phoneNum + "\n" + deconstructPhone() + "\n";
  }// end display
  
  public static void main(String args[]){// was told on email that User 1 and 3 are no-arg
    User user1 = new User();
    user1.setFirstName("Sarah");
    user1.setLastName("Holt");
    user1.setUserID("sarahholt26!");
    user1.setPhoneNum("9548926728");
    System.out.println(user1.display());
    User user2 = new User("Kevin", "James", 25, "kjames2552", "8019023100");
    System.out.println(user2.display());
    User user3 = new User();
    user3.setFirstName("Dante");
    user3.setLastName("Couto");
    user3.setUserID("dantetezza");
    user3.setPhoneNum("95000");
    System.out.println(user3.display());
  }// end main
  
}// end class
