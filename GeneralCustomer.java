package com.java.polymorphism.assign_20_12;

public class GeneralCustomer extends Customer
{

	public GeneralCustomer(String name) {
		super(name);
	}
	
	@Override
	public void calculateBill(double... prices) {
		super.calculateBill(prices);
	}
	
}
