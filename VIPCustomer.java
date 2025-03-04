package com.java.polymorphism.assign_20_12;

public class VIPCustomer extends Customer {
	protected double discountRate = 20.0;

	public VIPCustomer(String name) {
		super(name);
	}

	public void calculateBill(double... prices) {
		double totalCost = 0;
		for (double price : prices) {
			if (price < 0)
				System.err.println("Item price cannot be negative.");
			else
				totalCost += price;
		}
		double discount = (totalCost * discountRate) / 100;
		double finalPrice = totalCost - discount;
		System.out.println("Customer detail:");
		System.out.println("customer name" + name);
		System.out.println("total cost" + totalCost);
		System.out.println("Discount of 20% is Rs: " + discount);
		System.out.println("Final price: " + finalPrice);
	}

}
