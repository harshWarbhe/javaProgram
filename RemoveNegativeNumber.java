package com.java.ArrayList.Assign_02_19;

import java.util.ArrayList;
import java.util.List;

public class RemoveNegativeNumber {

	public static void main(String[] args) {
		Integer[] number = {-10, -5, 0, 5, 10, 15, -20};
		
		List<Integer> positiveNumber = new ArrayList<>();
		for(Integer num: number)
		{
			if(num > 0 )
			{
				positiveNumber.add(num);
			}
		}
		
		System.out.println("positive Number: "+ positiveNumber);
	}

}
