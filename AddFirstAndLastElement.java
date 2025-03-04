package com.java.Array_logical.assign_07_02;
//Que 3 :
//=======
//Write a java program to add the last and first element of a given array.
//
//
//Input as: [1,2,3,4,5,6]   
//Output as: 7
import java.util.Scanner;

public class AddFirstAndLastElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Write a java program to add the last and first element of a given array.");
		
		System.out.print("enter the size of array: ");
		int size= sc.nextInt();
		
		int []arr = new int[size];
		System.out.print("enter "+size+" elements: ");
		for(int i = 0; i< size; i++)
		{
			arr[i]= sc.nextInt();
		}
		
		int sum = arr[0] + arr[arr.length-1];
		System.out.print("sum: "+ sum);
	}
}
