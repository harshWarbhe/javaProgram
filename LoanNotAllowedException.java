package com.java.ExceptionHandling.assign_01_22.q1;

public class LoanNotAllowedException extends RuntimeException{

	public LoanNotAllowedException(String errorMessage)
	{
		super(errorMessage);
	}
}
