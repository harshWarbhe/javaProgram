package com.java.Array_logical.assign_07_02;

import java.util.Scanner;

/*
 * Que 2:
=======
Print all elements in reverse order of an Array.


Input as: 1 2 3 4 5
Output as: 5 4 3 2 1
*/
public class ReverseOrderOfArray {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Print all elements in reverse order of an Array.");
		
		System.out.print("Enter the size of array: ");
		int size = scanner.nextInt();
		
		int []arr = new int[size];
		
		System.out.print("enter "+size+" elements: ");
		for(int i = 0; i<size;i++)
		{
			arr[i] = scanner.nextInt();
		}
		
		int arr2[] = new int[size];
		System.out.println("reverse order: ");
		for(int i = arr.length-1,j=0; i >=0 ;i--,j++)
		{
			arr2[j] = arr[i];
			System.out.print(arr2[j]);
		}
		
		
	}

}
