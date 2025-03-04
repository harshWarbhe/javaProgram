package com.java.oops.Day7_8_11;

import java.util.Scanner;
class Employee
{
	private String employeeName;
	private int employeeID;
	private double salary;

	public void setEmployeeName(String employeeName)
	{
		this.employeeName =employeeName;
	}
	public void setEmployeeID(int employeeID)
	{
		this.employeeID =employeeID;
	}
	public void setSalary(double salary)
	{
		this.salary =salary;
	}

	public String getEmployeeName()
	{
		return employeeName;
	}
	public int getEmployeeID()
	{
		return employeeID;
	}
	public double getSalary()
	{
		return salary;
	}
	
	public void assignDesignation()
	{
		if(salary>100000)
			System.out.println("Designation: Manager");
		else if( salary>50000 && salary<100000 )
			System.out.println("Designation: Developer");
		else
			System.out.println("Designation: Associate");
	}

	public void displayEmployeeInfo()
	{
		System.out.println("\nEmployee details");
		System.out.println("Employee Name: "+ getEmployeeName());
		System.out.println("Employee ID: "+ getEmployeeID());
		System.out.println("salary: "+ getSalary());
		assignDesignation();
	} 

}


public class EmployeeTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee();

	    System.out.println("Employee Name: ");
		String  employeeName = sc.nextLine();
		emp.setEmployeeName(employeeName);

		System.out.println("Employee ID: ");
		int  employeeID = sc.nextInt();
		emp.setEmployeeID(employeeID);

		System.out.println("salary: ");
		double salary = sc.nextDouble();
		emp.setSalary(salary);

		emp.displayEmployeeInfo();
		
		sc.close();
		
	}
}
