package com.java.Multithreading.assign_01_30;

public class RideRequest extends Thread{

	@Override
	public void run()
	{
	try
	{
		System.out.println("User requested a ride...");
		Thread.sleep(2000);
		
		System.out.println("Searching for nearby drivers...");
	}
	catch(InterruptedException e)
	{
		e.printStackTrace();
	}
	}
}
