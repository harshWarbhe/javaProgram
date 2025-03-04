package com.java.ExceptionHandling.assign_01_22.q1;

public class InsufficientFundsException extends Exception{

	public InsufficientFundsException(String errorMessage)
	{
		super(errorMessage);
	}
}
