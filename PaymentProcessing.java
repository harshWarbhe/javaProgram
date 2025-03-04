package com.java.Multithreading.assign_01_30;

public class PaymentProcessing extends Thread {
	@Override
	public void run()
	{
		try
		{
			System.out.println("Processing payment...");
			Thread.sleep(2000);
			
			System.out.println("Payment successful!");
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
