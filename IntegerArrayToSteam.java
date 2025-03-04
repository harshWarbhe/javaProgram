package com.java.Array_logical.assign_13_02;
//Q1) Create an integer array, convert the integer array into Stream and print the
//elements of integer array by using Stream forEach() method.
import java.util.Arrays;
import java.util.stream.IntStream;

public class IntegerArrayToSteam {
	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3, 4, 5, 6 };

		
		IntStream ofIntStream = Arrays.stream(arr1);
		ofIntStream.forEach(System.out::println);

	}
}
