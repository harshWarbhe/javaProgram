package com.java.Array_logical.assign_13_02;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class DoubleArrayIntoStream {
public static void main(String[] args) {
	Double []arr1 = { 1.1, 3.25, 4.255, 5.0, 6.65};
	double []arr2 = { 1.1, 3.25, 4.255, 5.0, 6.65};

	Stream<Double> ofdoubleStream = Arrays.stream(arr1);
	ofdoubleStream.forEach(System.out::println);
	
	DoubleStream ofdoubleStream2 = Arrays.stream(arr2);
}
}
