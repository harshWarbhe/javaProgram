package com.java.ArrayList.Assign_02_17;

public class CabCustomer {

	private int custId;
	private String customerName;
	private String pickupLocation;
	private int distance;
	private String phone;
	
	public CabCustomer(int custId, String customerName, String pickupLocation, int distance, String phone) {
		this.custId = custId;
		this.customerName = customerName;
		this.pickupLocation = pickupLocation;
		this.distance = distance;
		this.phone = phone;
	}
	
	public CabCustomer()
	{
		super();
	}
	
	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getPickupLocation() {
		return pickupLocation;
	}

	public void setPickupLocation(String pickupLocation) {
		this.pickupLocation = pickupLocation;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	

	
	
	
	
}
