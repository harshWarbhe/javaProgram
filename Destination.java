package com.java.ArrayList.Assign_02_18.q2;

import java.util.ArrayList;
import java.util.List;

public class Destination {
	private String name;
	private List<Activity> activities;

	public Destination(String name) {
		this.name = name;
		this.activities = new ArrayList<>();
	}

	public void addActivity(Activity activity)
	{
		activities.add(activity);
	}
	
	public List<Activity> getActivities()
	{
		return activities;
	}

	@Override
	public String toString() {
		String output = "Destination: " + name + "\n";
        for (Activity activity : activities) {
            output += activity.toString() + "\n";
        }
        return output;
	}
	
	
}
