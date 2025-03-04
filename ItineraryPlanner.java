package com.java.ArrayList.Assign_02_18.q2;

import java.util.ArrayList;
import java.util.List;

public class ItineraryPlanner {

	private List<Destination> destinations;

	public ItineraryPlanner() {
		this.destinations = new ArrayList<>();
	}
	
	public void addDestination(Destination destination)
	{
		destinations.add(destination);
	}
	
	public void displayItinerary()
	{
		for(Destination destination : destinations) {
		System.out.println(destination);
		}
	}
}
