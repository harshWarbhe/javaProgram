package com.java.Multithreading.assign_02_05;

public class VaccineEligibility {
	private int age;
	private boolean hasHealthCondition ;

	public VaccineEligibility(int age, boolean hasHealthCondition) {
		this.age = age;
		this.hasHealthCondition = hasHealthCondition;
	}

	public boolean isEligible()
	{
		if(age>18 && age < 60)
		{
			return true;
		}
		else {
			return false;
		}
	}
}
