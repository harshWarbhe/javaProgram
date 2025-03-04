/*Assignment(20-DEC)
Create a Shopping Mall Application project by using Method Overriding Concept to display
and accept different kinds of discount given to specific customers like PrimeCustomer and
VIPCustomer (No discount for General Customer)

Summary :

[Super class : Customer
Subclasses (GeneralCustomer, PrimeCustomer, VIPCustomer)
override the calculateBill method to implement different discount rules.]

Create a BLC class Customer
Fields :
name String Protected

Use a parameterized constructor to initialize the fields, In this constructor provide
error message, if name is null or empty (see test cases for more details)


Methods :

1) Method Name        : calculateBill()
Argument        : One argument of type double var args [double... prices]
Return Type     : void
Access modifier : public
In this method using var args receive item price, Give an error message and exit, if
Item price is negative, Calculate the total bill by adding all the item price, display
all the details of customer name, total cost, Discount

Create another BLC class GeneralCustomer which is the sub class of Customer

Fields : No fields

Take a parameterized constructor to initialize super class properties.

Method :

1) Method Name        : calculateBill()
Argument        : One argument of type double var args [double... prices]
Return Type        : void
Access modifier    : public
Override this method from super class, For general customer discount is not available
so we can call super class method to display customer bill and information without
discount. If itemPrice is negative given an error message.

Create another BLC class PrimeCustomer which is the sub class of Customer

Fields :
protected double discountRate = 10.0;

Take a parameterized constructor to initialize super class properties.

1) Method Name        : calculateBill()
Argument        : One argument of type double var args [double... prices]
Return Type        : void
Access modifier    : public
Override this method from super class, For Prime customer with 10% discount
in the final bill amount, calculate the total bill and display Prime Customer
information [See Test cases for more details]


Create another BLC class VIPCustomer which is the sub class of Customer

Fields :
protected double discountRate = 15.0;

Take a parameterized constructor to initialize super class properties.

1) Method Name        : calculateBill()
Argument        : One argument of type double var args [double... prices]
Return Type        : void
Access modifier    : public
Override this method from super class, For VIP customer with 20% discount
in the final bill amount, calculate the total bill and display VIP Customer
information [See Test cases for more details]

Create an ELC class ShoppingMall with main method to test this application.

Method :
1) Method Name    : generateBill()
Argument        : Two arguments [Customer cust, double... prices]
Return Type        : void
Access modifier    : public and static

This method will receive Customer object and item price using var args and call
appropriate object overridden method of sub classes to generate the bill.


Write Switch case with Scanner class in the main method
to Test the application as shown in the below Test Cases.

Test Cases for Output :
------------------------
Test Case 1 :
-------------
Please select the Customer Type to get additional Discount :
        1) General Customer
        2) Prime Customer
        3) VIP Customer
       
       System.out.println("Please enter Customer type :");
       1
       Please Enter your Name :
       Mr Ravishankar
       Enter number of Items :
       2
       Please Enter the Item Name and Price :
       1)Item Name :T-Shirt
        Item Price :2300
       2)Item Name :Jeans
        Item Price :4500
       Welcome to Hyderabad Mall :
       Customer: Mr Ravishankar
       Total cost RS : 6800.0
       Discount: No discount for regular customers.

Test Case 2 :
-------------
Please select the Customer Type to get additional Discount :
        1) General Customer
        2) Prime Customer
        3) VIP Customer
       
       System.out.println("Please enter Customer type :");
       2
       Please Enter your Name :
       Mr Scott
       Enter number of Items :
       3
       Please Enter the Item Name and Price :
       1)Item Name :Mobile
        Item Price :12890
       2)Item Name :Laptop
        Item Price :86000
       3)Item Name :Watch
        Item Price :2300
       Welcome to Hyderabad Mall :
       Customer: Mr Scott
       Total cost RS :101190.0
       Discount RS :10119.0
       Final amount RS :91071.0

Test Case 3 :
-------------
Please select the Customer Type to get additional Discount :
        1) General Customer
        2) Prime Customer
        3) VIP Customer
       Please enter Customer type :
       3
       Please Enter your Name :
       Mr Smith
       Enter number of Items :
       2
       Please Enter the Item Name and Price :
       1)Item Name :Washing Machine
        Item Price :55000
       2)Item Name :Smart TV
        Item Price :100000
       Welcome to Hyderabad Mall :
       Customer: Mr Smith
       Total cost RS :155000.0
       Discount RS :15500.0
       Final amount RS :139500.0


Test Cases for Input Validation :
---------------------------------
Test Case 1:
-------------
Please select the Customer Type to get additional Discount :
        1) General Customer
        2) Prime Customer
        3) VIP Customer
   Please enter Customer type :
   1
   Please Enter your Name :
   
   Customer name cannot be empty.

Test Case 2:
-------------
Please select the Customer Type to get additional Discount :
        1) General Customer
        2) Prime Customer
        3) VIP Customer
   Please enter Customer type :
   2
   Please Enter your Name :
   Mr Scott
   Enter number of Items :
   1
   Please Enter the Item Name and Price :
   1)Item Name :Laptop
    Item Price :-90000
   Welcome to Hyderabad Mall :
   Item price cannot be negative.
*/

package com.java.polymorphism.assign_20_12;

import java.util.Scanner;

public class ShoppingMall {

	public static void generateBill(Customer cust, double... prices) {
		cust.calculateBill(prices);	
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please select the Customer Type to get additional Discount :");
		System.out.println("1) General Customer");
		System.out.println("2) Prime Customer");
		System.out.println("3) VIP Customer");
		System.out.println("Please enter Customer type :");
		int custType = sc.nextInt();
		sc.nextLine(); //newline
		
		System.out.print("Please Enter your Name: ");
        String name = sc.nextLine();
        
        
		
		
	}

}
