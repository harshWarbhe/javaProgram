package com.java.ArrayList.Assign_02_19;

import java.util.ArrayList;
import java.util.List;

public class PrintAllNamesWhichContainSpecificLetter {
	public static void main(String[] args) {
		String[] names = {"Rahul", "Raj", "Arnav", "Scott", "Smith"};
		
		List<String> nameWith = new ArrayList<>();
		
		for(String name: names)
		{
			if(name.toLowerCase().contains("a")) {
				nameWith.add(name);
			}
		}
		
		System.out.println("names staring with 'a' and 'A' : "+ nameWith);
	}
}
