package org.yearup;

import java.util.Scanner;

public class Main {
   public static void main (String[] args) {
      Scanner sc = new Scanner(System.in);


      //Input
      System.out.print("Enter the amount borrowed: ");
      double principal = sc.nextDouble();
      System.out.print("Enter the annual interest rate: ");
      double interestRate = sc.nextDouble();
      System.out.print("Enter the loan term in years; ");
      double loanTerm = sc.nextDouble();


      //Convert interest rate from annual to monthly
      interestRate /= 1200;
      loanTerm *= 12;

      //calculate monthly payment
      double monthlyPayment = (principal * interestRate) / (1 - Math.pow(1 + interestRate, -loanTerm));


   }
}