package com.java.Multithreading.assign_01_30;

public class OlaRidingApp {

	public static void main(String[] args) {
		Thread t = new Thread();
		
		try {
			RideRequest rideRequest = new RideRequest();
			DriverAssignment driverAssignment = new DriverAssignment();
			FareCalculation fareCalculation	= new FareCalculation();
			LiveTracking liveTracking = new LiveTracking();
			PaymentProcessing paymentProcessing =new PaymentProcessing();
			RatingSystem ratingSystem = new RatingSystem();
			
			rideRequest.start();
			fareCalculation.start();
			
			rideRequest.join();
			
			driverAssignment.start();
			driverAssignment.join();
			
			liveTracking.start();
			liveTracking.join();
			
			paymentProcessing.start();
			paymentProcessing.join();
			
			ratingSystem.start();
			//ratingSystem.join();
			
			
		} catch (Exception e) {
			
		}
		
	}

}
