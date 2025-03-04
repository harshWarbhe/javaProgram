package com.java.polymorphism.assign_20_12;

public class PrimeCustomer extends Customer {
	protected double discountRate = 10.0;

	public PrimeCustomer(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void calculateBill(double... prices) {
		double totalCost = 0;
		for (double price : prices) {
			if (price < 0)
				System.err.println("Item price cannot be nagative. ");
			else
				totalCost += price;
		}

		double discount = (totalCost * discountRate) / 100;
		double finalPrice = totalCost - discount;
		System.out.println("Customer detail:");
		System.out.println("customer name" + name);
		System.out.println("total cost" + totalCost);
		System.out.println("Discount of 10% is Rs: " + discount);
		System.out.println("Final price: " + finalPrice);

	}
}
