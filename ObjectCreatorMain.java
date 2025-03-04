package com.java.interfaceProblem.assign_01_06.q1;

import java.util.function.Consumer;

public class ObjectCreatorMain {

	public static void main(String[] args) { 

	ObjectCreator o=(id,name)->
	{
		
		//return new  Object();
		return new Student(id, name);
		};
		
	Student s =(Student) o.create(1,"raju");
	System.out.println("before updating");
	System.out.println(s);
	
	
	Consumer<String> c=(t)->s.setName(t);
	
	s.updateName(c);
	
	
	
	
	}

}
