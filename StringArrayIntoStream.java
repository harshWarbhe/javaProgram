package com.java.Array_logical.assign_13_02;

import java.util.Arrays;
import java.util.stream.Stream;

public class StringArrayIntoStream {

	public static void main(String[] args) {
		String[] arr = {"a", "ww", "hh"};
		
		Stream<String> ofStringStream = Arrays.stream(arr);
		ofStringStream.forEach(System.out::println);
		
	}

}
