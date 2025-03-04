package com.java.ExceptionHandling.assign_01_22.q1;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
		
	BankAccount acc1 = new BankAccount(1001, 50000);
	BankAccount acc2 = new BankAccount(1002, 30000);
		
	Customer cust1 = new Customer("harsh", acc1);
		
	
	System.out.println("\nSelect an option:");
    System.out.println("1. Deposit");
    System.out.println("2. Withdraw");
    System.out.println("3. Transfer");
    System.out.println("4. Loan Application");
    System.out.println("5. Check Balance");
    System.out.println("6. Exit");
    System.out.print("Enter your option: ");
	
	int choise = sc.nextInt();
	
	try {
		switch(choise)
		{case 1: 
			System.out.println("Enter amount to deposit: ");
			double depositAmount = sc.nextDouble();	
			cust1.getAccount().deposit(depositAmount);
			System.out.println("Deposit successful. New balance: " + cust1.getAccount().getBalance());
            break;
            
		case 2:
            System.out.print("Enter amount to withdraw: ");
            double withdrawAmount = sc.nextDouble();
            cust1.getAccount().withdraw(withdrawAmount);
            System.out.println("Withdrawal successful. New balance: " + cust1.getAccount().getBalance());
            break;

        case 3: 
            System.out.print("Enter amount to transfer: ");
            double transferAmount = sc.nextDouble();
            cust1.getAccount().transfer(acc2, transferAmount);
            System.out.println("Transfer successful. New balance: " + cust1.getAccount().getBalance());
            System.out.println("Recipient balance: " + acc2.getBalance());
            break;

        case 4: 
            System.out.print("Enter loan amount: ");
            double loanAmount = sc.nextDouble();
            cust1.getAccount().applyForLoan(loanAmount);
            System.out.println("Loan approved. New balance: " + cust1.getAccount().getBalance());
            break;

        case 5: 
            System.out.println("Current balance: " + cust1.getAccount().getBalance());
            break;

        case 6: // Exit
            System.out.println("Thank you for using the ATM. Goodbye!");
            sc.close();
            return;

        default:
            System.out.println("Invalid option. Please try again.");   
            
		}
		
	}
	catch (InvalidAmountException | InsufficientFundsException | AccountNotFoundException | LoanNotAllowedException e) {
        System.out.println("Error: " + e.getMessage());
    }
	
	}
}
