package com.java.ArrayList.Assign_02_18.q1;

import java.util.ArrayList;

public class Directory {

	private ArrayList<Employee> employeeList;

	public Directory() {
		employeeList = new ArrayList<>();
	}

	public void addEmployee(Employee employee) {
		employeeList.add(employee);
	}

	public void displayAllEmployees() {
		for (Employee e : employeeList) {
			System.out.println(e+"\n");
		}	
	}
	
	public void updateEmployee(int index, String position, double salary )
	{
		if(index >= 0 && index < employeeList.size() )
		{
			Employee emp = employeeList.get(index);
			emp.setPosition(position);
			emp.setSalary(salary);
		}
		else 
		{
			System.out.println("Invalid index! Employee not found.");
		}
		
	}
	
	public void deleteEmployee(int index)
	{
		if(index >= 0 && index < employeeList.size() )
		{
			employeeList.remove(index);
		}
		else {
			System.out.println("Invalid index! Employee not found.");
		}
	}

}
