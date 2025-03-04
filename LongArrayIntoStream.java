package com.java.Array_logical.assign_13_02;

import java.util.Arrays;
import java.util.stream.LongStream;

public class LongArrayIntoStream {
	public static void main(String[] args) {

		long []arr2 = { 1, 2, 3, 4, 5, 6};
		
		LongStream ofLongStream = Arrays.stream(arr2);
		ofLongStream.forEach(System.out::println);
		
	}
}
