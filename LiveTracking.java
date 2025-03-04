package com.java.Multithreading.assign_01_30;

public class LiveTracking extends Thread{
	@Override
	public void run()
	{
		try
		{
			for(int i = 0; i<=100; i+=20)
			{
				System.out.println("Updating ride location... "+i+"% completed");
			}
			Thread.sleep(1000);
			System.out.println("Ride Completed");
		}
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}

}
