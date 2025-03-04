package com.java.Array_logical.assign_07_02;

//Que 5:
//=======
//Write a java program to find the middle elements of a given array. 
//If array is odd then print only the middle element, if array is even
//then print both the middle elements.
//
//
//Input as : 1 2 3 4 5     
//Output is : 3
//
//
//Input is :1 2 3 4 5 6    
//Output is :3 4

import java.util.Scanner;

public class middleElement {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Write a java program to print all even elements and odd elements");
		
		System.out.print("enter the size of array: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.print("enter "+size+" elements: ");
		for(int i = 0; i < size; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		if(size % 2 == 0) {
            // Even case - print the two middle elements
            int mid1 = (size / 2) - 1;
            int mid2 = (size / 2);
            System.out.println("Middle elements (even): " + arr[mid1] + " " + arr[mid2]);
        } else {
            // Odd case - print the middle element
            int mid = size / 2;
            System.out.println("Middle element (odd): " + arr[mid]);
        }
		
		
	}
}
