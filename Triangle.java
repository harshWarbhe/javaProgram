package com.java.polymorphism.assign_17_12.q1;

public class Triangle extends Shape
{	
	public Triangle() 
	{
		
	}
	
	@Override
	public void draw()
	{
		System.out.println("Triangle draw");
	}
	
	@Override
	public void erase()
	{
		System.out.println("Triangle earse");
	}
}
