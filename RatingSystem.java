package com.java.Multithreading.assign_01_30;

public class RatingSystem extends Thread{

	@Override
	public void run()
	{
		try
		{
			System.out.println("Requesting user rating...");
			Thread.sleep(1000);
			
			System.out.println("User rated the ride: 5 star");
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	
}
