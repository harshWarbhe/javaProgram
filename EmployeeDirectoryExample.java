package com.java.ArrayList.Assign_02_18.q1;

public class EmployeeDirectoryExample {

	public static void main(String[] args) {

		Directory directory = new Directory();

		Employee emp1 = new Employee("Alice", "Manager", 60000.0);
		Employee emp2 = new Employee("Bob", "Developer", 50000.0);

		directory.addEmployee(emp1);
		directory.addEmployee(emp2);

		System.out.println("initial detail: ");
		directory.displayAllEmployees();
		
		directory.updateEmployee(1, "senior developer", 80000.0 );
		System.out.println("-------------------------------------------------\nafter updating Bob detail:");
		directory.displayAllEmployees();
		
		directory.deleteEmployee(1);
		System.out.println("-------------------------------------------------/nafter delete alice");
		directory.displayAllEmployees();
		

	}

}
