package com.java.ArrayList.Assign_02_18.q2;

public class TravelItineraryPlanner {
	public static void main(String[] args) 
	{
		ItineraryPlanner planner = new ItineraryPlanner();

		Destination paris = new Destination("Paris");
		Destination london = new Destination("London");

		paris.addActivity(new Activity("Visit Eiffel Tower", "Morning"));
		paris.addActivity(new Activity("Louvre Museum", "Afternoon"));

		london.addActivity(new Activity("British Museum", "Morning"));
		london.addActivity(new Activity("London Eye", "Afternoon"));

		planner.addDestination(paris);
		planner.addDestination(london);

		planner.displayItinerary();
	}
}
