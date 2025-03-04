package com.java.Multithreading.assign_01_30;

public class FareCalculation extends Thread{
	@Override
	public void run()
	{
	try
	{
		System.out.println("Calculating estimated fare...");
		Thread.sleep(1500);
		
		System.out.println("Estimated fare: 135.75 RS.");
	}
	catch(InterruptedException e)
	{
		e.printStackTrace();
	}
	}

}
