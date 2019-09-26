/**
* This is our COP2513 template
* Kyle Santiago 9/23/2019
* Exercise #2 – Loan Class 
**/
import java.util.Scanner; // Scanner is in the java.util package
public class COP2513HW01E2 {
   private String loanType;
   private int loanAmount;
   private double interestRate;
   private double termYears;
   
   COP2513HW01E2() {
   loanType = "Normal";
   loanAmount = 500;
   interestRate = 2.5;
   termYears = 2.5;
   }// end of constructor //// AKA default values
   
   COP2513HW01E2(String loanType,int loanAmount,double interestRate,double termYears) {
   this.loanType = loanType;
   this.loanAmount = loanAmount;
   this.interestRate = interestRate;
   this.termYears = termYears;
   }// end of constructor //// AKA My values
   
   public double monthlyPayment(){
   double top; 
   double bot; 
   double c;
      top = loanAmount * (interestRate/12);
      bot = 1 - (1/Math.pow(1+(interestRate/12),termYears*12));
      c = top / bot;
      return c;
   }// end monthlyPayment
   
   public double totalInterest(){
   double totalInterest;
   double sumYear; 
   double sumInterest;
      sumYear = termYears * 12;
      sumInterest = sumYear * monthlyPayment();
      totalInterest = sumInterest - loanAmount;
      return totalInterest;
   }// end totalInterest
   
   public String toString() {
      return "The type of the loan is " + loanType + ". \n" +
      "The amount of the loan is " + loanAmount + ". \n" +
      "The interest rate of the loan is " + interestRate + ". \n" +
      "The term years of the loan is " + termYears + ". \n" +
      "The monthly payment for the loan is " + monthlyPayment() + ". \n" +
      "The total interest for the loan is " + totalInterest() + ". \n";
   }// end toString
   
   public static void main(String[] args) {
      COP2513HW01E2 Loan1 = new COP2513HW01E2("Car", 20000, 0.035, 5);
      COP2513HW01E2 Loan2 = new COP2513HW01E2("Education", 30000, 0.05, 10);
      COP2513HW01E2 Loan3 = new COP2513HW01E2("House Reform", 2000, 0.025, 1.5);
      System.out.println(Loan1.toString());
      System.out.println(Loan2.toString());
      System.out.println(Loan3.toString());
   }// end of main

}// end of class
