package com.java.ExceptionHandling.assign_01_22.q1;

public class BankAccount implements Bank{

	private long accountNumber;
	private double balance;
	
	public BankAccount(long accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	
	@Override
	public void deposit(double amount) throws InvalidAmountException {
		if(amount <= 0)
		{
			throw new InvalidAmountException("Deposit amount must be greater than zero.");
		}
		balance += balance;
	}
	@Override
	public void withdraw(double amount) throws InsufficientFundsException, InvalidAmountException {
		if(amount <= 0)
		{
			throw new InvalidAmountException("Deposit amount must be greater than zero.");
		}
		if(amount > balance)
		{
			throw new InsufficientFundsException("Insufficient funds for withdrawal.");
		}
		balance -= amount;
		
	}
	@Override
	public void transfer(BankAccount toAccount, double amount)
			throws InsufficientFundsException, AccountNotFoundException, InvalidAmountException {
		if(amount > balance)
		{
			throw new InsufficientFundsException("Insufficient funds for withdrawal.");
		}
		if(toAccount == null)
		{
			throw new AccountNotFoundException("Insufficient funds for withdrawal.");
		}
		if(amount <= 0)
		{
			throw new InvalidAmountException("Deposit amount must be greater than zero.");
		}
		
	}
	@Override
	public void applyForLoan(double amount) throws LoanNotAllowedException, InvalidAmountException {
		if(amount <= 0)
		{
			throw new InvalidAmountException("Deposit amount must be greater than zero.");
		}
		if(amount > 50000 || balance <50000 )
		{
			throw new LoanNotAllowedException("Loan amount exceeds limit or balance is insufficient.");
		}
		balance += amount;
		
	}
	@Override
	public double getBalance() {
		return balance;
	}
	
	
	
}
