package com.java.Multithreading.assign_02_05;

public class DoseBooking {
	private boolean booked;
	
	public void bookDose()
	{
		try 
		{
			if (booked)
			{
				throw new RuntimeException( "Dose already booked.");
			}
			else
			{
				this.booked= true;
				System.out.println("Dose Booked sucessfully...");
			} 
			
			
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
	
	}
	public boolean isDoseBooked() {
		return booked;
	}
		
}
