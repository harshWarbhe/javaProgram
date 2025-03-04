package com.java.ArrayList.Assign_02_17;

import java.util.ArrayList;

public class CabCustomerService {

	private ArrayList<CabCustomer> customersList = new ArrayList<>();
	
	public void addCabCustomer(CabCustomer customer)
	{
		customersList.add(customer);
	}
	
	public boolean isFirstCustomer(CabCustomer customer)
	{
		for(CabCustomer c : customersList)
		{
			if(c.getPhone().equals(customer.getPhone()))
			{
				return false;
			}
		}
		return true;
	}
	
	public double calculateBill(CabCustomer customer)
	{
		if(isFirstCustomer(customer))
		{
			return 0;
		}
		else 
		{
			int distance = customer.getDistance();
			if(distance <= 4)
			{
				return 80;
			}
			else 
			{
				 return 80 + (distance * 6) ;
			}
		}
	}
	
		
		public void printBill(CabCustomer customer)
		{
			double bill = calculateBill(customer);
			System.out.println(customer.getCustomerName()+" Please pay your bill of Rs."+ bill);
		}
		
		
	
}
