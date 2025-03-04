package com.java.ExceptionHandling.assign_01_22.q1;

public class InvalidAmountException extends RuntimeException{

	public InvalidAmountException(String errorMessage)
	{
		super(errorMessage);
	}
}
