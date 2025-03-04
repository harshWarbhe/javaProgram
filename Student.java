package com.java.interfaceProblem.assign_01_06.q1;

import java.util.function.Consumer;

public class Student implements ObjectCreator {
	private int id;
	private String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	public void updateName(Consumer<String> nameUpdater) 
	{
		nameUpdater.accept("ravi");
		System.out.println(toString());
		
	}

	@Override
	public Object create(int id, String name) {
		// TODO Auto-generated method stub
		return null;
	}
}
