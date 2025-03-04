package com.java.polymorphism.assign_19_12;

public class CurrentAccount extends BankAccount
{
	protected double overdraftLimit = 5000.0;
	
	
	
	public CurrentAccount(String accountHolderName, String accountNumber, double balance) {
		super(accountHolderName, accountNumber, balance);
	}


	@Override
	public void calculateInterest()
	{
		System.out.println("Current accounts do not earn interest.");
	}
	
	
	public void checkOverdraftLimit()
	{
		System.out.println("overdraftLimit amount: "+overdraftLimit);
	}
}
