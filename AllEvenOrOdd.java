package com.java.Array_logical.assign_07_02;
//Que 4 :

//=======
//Write a java program to print all even elements and odd elements 
//separately from an array.
//
//
//Input as  : 1 2 3 4 5 6 7
//Even elements are : 2 4 6
//Odd elements are : 1 3 5 7

import java.util.Scanner;

public class AllEvenOrOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Write a java program to print all even elements and odd elements");

		System.out.print("enter the size of array: ");
		int size = sc.nextInt();

		int arr[] = new int[size];

		System.out.print("enter " + size + " elements: ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		int evenArr[] = new int[size];
		int oddArr[] = new int[size];
		int evenCount = 0, oddcount = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				evenArr[evenCount] = arr[i];
				evenCount++;
			} else {

				oddArr[oddcount] = arr[i];
				oddcount++;
			}
		}

		System.out.print("Even elements are : ");
		for (int i = 0; i < evenCount; i++) {
			System.out.print(evenArr[i] + " ");
		}

		System.out.print("\nEven elements are : ");
		for (int i = 0; i < oddcount; i++) {
			System.out.print(oddArr[i] + " ");
		}
	}
}
