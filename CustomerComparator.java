package com.java.Array_logical.assign_11_02.q1Comparator;
//Q1) Create a record called Customer, which accepts id, name and bill as a component.
//
//Create an ELC class CustomerComparator with main method.
//
//Create a Customer array with dynamic size and dynamic array initialization using Scanner class. 
//
//Sort the Customer object based on following criteria :
//
//  a) By using Customer id
//  b) By using Customer name
//  c) By using Customer bill

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class CustomerComparator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Sort the Customer object based on following criteria :\r\n"
				+ "  a) By using Customer id\r\n" + "  b) By using Customer name\r\n" + "  c) By using Customer bill");

		System.out.print("enter the size of array: ");
		int size = sc.nextInt();

		Customer[] cust = new Customer[size];

		for (int i = 0; i < size; i++) {
			System.out.print("\nEnter Customer name: ");
			String name = sc.nextLine();
			name = sc.nextLine();
			System.out.print("Enter customer ID: ");
			int id = sc.nextInt();
			System.out.print("Enter bill amount: ");
			double bill = sc.nextDouble();
			cust[i] = new Customer(id, name, bill);
		}

		Comparator<Customer> compId = new Comparator<Customer>() {

			@Override
			public int compare(Customer o1, Customer o2) {

				return o1.id().compareTo(o2.id());
			}
		};

		Arrays.sort(cust, compId);

		System.out.println("sorting by using id\n");

		for (Customer customer : cust) {
			System.out.println(customer);
		}

		System.err.println("-----------------------------------------------");
		Comparator<Customer> compName = new Comparator<Customer>() {

			@Override
			public int compare(Customer c1, Customer c2) {
				return c1.name().compareTo(c2.name());
			}

		};
		Arrays.sort(cust, compName);
		System.out.println("sorting by using name\n");

		for (Customer customer : cust) {
			System.out.println(customer);
		}
		
		System.err.println("-----------------------------------------------");
		Comparator<Customer> compbill = new Comparator<Customer>() {

			@Override
			public int compare(Customer c1, Customer c2) {
				return c1.bill().compareTo(c2.bill());
			}

		};
		Arrays.sort(cust, compbill);
		System.out.println("sorting by using bill\n");

		for (Customer customer : cust) {
			System.out.println(customer);
		}
		
		

	}

}
