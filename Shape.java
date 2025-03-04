package com.java.polymorphism.assign_17_12.q1;

import java.util.Scanner;
public class Shape {

	public Shape() {
	}
	
	public void draw()
	{
		System.out.println("shape draw");
	}
	

	public void erase()
	{
		System.out.println("shape erase");
	}

	public static Shape randShape()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("calculate shape ");
		System.out.println("(1) cicle ");
		System.out.println("(2) triangle ");
		System.out.println("(3) Square");
		System.out.println("Enter option: ");
		int i = sc.nextInt();
		
		switch (i) {
		case 1: 
			return new Circle();
			
		case 2:
			return new Triangle();
			
		case 3:
			return new Square(); 
		default:
			System.out.println("Enter valid option");
			return new Shape();
		}
		
	}
	
	
}
