package org.yearup;

import java.util.Scanner;

public class FinancialCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Prompt User to choose calculator
        System.out.println("Welcome to Financial Calculator");
        System.out.println("Please choose a calculator: ");
        System.out.println("1. Mortgage Calculator");
        System.out.println("2. CD Calculator");

        //Read users choice
        int choice = sc.nextInt();

        //choose calculator based on users choice
        if (choice == 1) {
            MortgageCalculator(sc);
        } else if (choice == 2) {
               CDCalculator(sc);
            } else {
                System.out.print("Invalid choice Please choose 1 or 2");
        }
    }
    public static void MortgageCalculator(Scanner sc) {
            //Mortgage calculator
            // Users Input
            System.out.print("Enter the Loan amount: ");
            double principal = sc.nextDouble();
            System.out.print("Enter the annual interest rate: ");
            double annualInterestRate = sc.nextDouble();
            System.out.print("Enter the loan term in years; ");
            double loanTermInYears = sc.nextDouble();


            //Calculations
            double totalNumberOfPayments = loanTermInYears * 12;
            double monthlyInterestRate = annualInterestRate / 1200;
            double monthlyPayment = (principal * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, -totalNumberOfPayments));
            double totalInterestPaid = monthlyPayment * totalNumberOfPayments - principal;


            //Display results
            System.out.printf("Monthly payment: $%.2f\n", monthlyPayment);
            System.out.printf("Total interest paid: $%.2f\n", totalInterestPaid);
        }

        //CDcalculator
        public static void CDCalculator(Scanner sc){
            // user input
            System.out.println("Welcome to CD calculator");
            System.out.println("Please enter Deposit amount: ");
            double deposit = sc.nextDouble();
            System.out.println("Please enter interest rate: ");
            double interestRate = sc.nextDouble();
            System.out.println("Please enter number of years: ");
            double numberOfYears = sc.nextDouble();


            //Calculate future value and total interest earned
            double futureValue = deposit * Math.pow(1 + interestRate, numberOfYears);
            double totalInterest = futureValue - deposit;

            //Display results
            System.out.printf("After %.0f years, the future value will be $%.2f\n", numberOfYears, futureValue);
            System.out.printf("Total interest paid: $%.2f\n", totalInterest);

        }
    }