package com.java.ArrayList.Assign_02_17;

public class CabCustomerServiceTester {

	public static void main(String[] args) {
		CabCustomerService service = new CabCustomerService();
		
		CabCustomer c1 = new CabCustomer(1, "scott", "A", 2, "1234567890");
		CabCustomer c2 = new CabCustomer(2, "smith", "B", 6, "0987654321");
		CabCustomer c3 = new CabCustomer(3, "scott", "A", 8, "1234567890");
		
		service.addCabCustomer(c1);
		service.addCabCustomer(c2);
		//service.addCabCustomer(c3);
		
		service.printBill(c1);
		service.printBill(c2);
		service.printBill(c3);
		
		
	}
}
