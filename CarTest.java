package com.java.ExceptionHandling.assign_01_21.q1;

class CarStoppedException extends Exception
{
	public CarStoppedException()
	{
		
	}
	
	public CarStoppedException(String errorMessage)
	{
		super(errorMessage);
	}
}

class CarPunctureException extends Exception
{
	public CarPunctureException()
	{
		
	}
	
	public CarPunctureException(String errorMessage)
	{
		super(errorMessage);
	}
}

class CarHeatException extends Exception
{
	public CarHeatException()
	{
		
	}
	
	public CarHeatException(String errorMessage)
	{
		super(errorMessage);
	}
}

public class CarTest 
{

		public static void stop(String action) throws CarStoppedException 
		{
        if ("stop".equalsIgnoreCase(action)) 
        	{
            	throw new CarStoppedException("Car stopped for some reason.");
        	} 
        else 
        	{
            	System.out.println("Car not stalled.");
        	}
		}
		
		public static void puncture(String action) throws CarPunctureException
		{
			if("puncture".equalsIgnoreCase(action))
			{
				throw new CarPunctureException("Car is punctured");
			}
			else 
			{
	            System.out.println("Car not stalled.");
			}		
		}
		
		public static void carHeat(int temp) throws CarHeatException
		{
			if(temp > 50)
			{
				throw new CarHeatException("Car is heated more the 50 degrees");
			}
			else 
			{
				System.out.println("Car not stall.");
			}
		}
	
}
