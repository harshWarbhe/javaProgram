package com.java.Multithreading.assign_02_05;

import java.util.Scanner;

public class User extends Thread{
	private String name;
	private VaccineEligibility eligibility;
	private DoseBooking doseBooking;
	
	public User(String name, int age, boolean hasHealthCondition)
	{
		this.name = name;
		this.eligibility= new VaccineEligibility(age, hasHealthCondition);
		this.doseBooking = new DoseBooking();
	}
	
	public boolean isEligible() {
		return eligibility.isEligible();
	}
	
	public void bookDose() {
		doseBooking.bookDose();
	}
	
	public boolean isDoseBooked() {
		return doseBooking.isDoseBooked();
	}
	
	public void run() {
		boolean flag=true;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("thread started...");
		do 
		{
			
			
			System.out.println("Corona Vaccine App ");
			System.out.println("\n1) dose booking  ");
			System.out.println("2) booking status");
			System.out.println("3) exit ");
			
			System.out.println("enter option: ");
			
			int option = scanner.nextInt();
			
			switch (option) {
			case 1: {
				if(isEligible()== true)
				{
					System.out.println("you are eligible foe dose...");
					this.bookDose();		
					break;
				}
				else {
					System.err.println("you are not eligible foe dose...");
					break;
				}
				
			}
			
			case 2:
			{
				System.out.println("booking status: "+this.isDoseBooked());
				break;
			}
			case 3:
			{
				flag=false;
			}
			}
		}
		while (flag==true);
		
	}
}

