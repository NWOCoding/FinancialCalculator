package org.yearup;

import java.security.Principal;
import java.util.Scanner;

public class Main {
   public static void main (String[] args) {
      Scanner sc = new Scanner(System.in);


      //Input
      System.out.print("Enter the Loan amount: ");
      double principal = sc.nextDouble();
      System.out.print("Enter the annual interest rate: ");
      double annualInterestRate = sc.nextDouble();
      System.out.print("Enter the loan term in years; ");
      Double loanTermInYears = sc.nextDouble();


      //Convert interest rate from annual to monthly
      Double totalNumberOfPayments = loanTermInYears * 12;
      double monthlyInterestRate = annualInterestRate / 1200;
      double monthlyPayment = (principal* monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, -totalNumberOfPayments));
      double totalInterestPaid = monthlyPayment * totalNumberOfPayments - principal;




      //Display results
      System.out.printf("Monthly payment: $%.2f\n", monthlyPayment);
      System.out.printf("Total interest paid: $%.2f\n", totalInterestPaid);









   }
}