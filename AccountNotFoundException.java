package com.java.ExceptionHandling.assign_01_22.q1;

public class AccountNotFoundException extends Exception{
	
	public AccountNotFoundException(String errorMessage)
	{
		super(errorMessage);
	}

}
