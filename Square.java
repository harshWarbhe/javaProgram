package com.java.polymorphism.assign_17_12.q1;

public class Square extends Shape
{	
	public Square() {
	}
	
	@Override
	public void draw()
	{
		System.out.println("Square draw");
	}
	
	@Override
	public void erase()
	{
		System.out.println("Square earse");
	}
}
