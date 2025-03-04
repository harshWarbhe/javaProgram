package com.java.Array_logical.assign_07_02;

import java.util.Scanner;

//Search for a given Element in an Array if present then print
//"Element found at index : ", if not present print "Element not found"
//    
//Input as: 1 4 3 5 2 6 5
//Enter searching element: 5
//Output: Element found at index 3
//
//
//Input as: 1 4 3 5 2 6
//Enter searching element: 7
//Output: Element not found


public class IndexPosition {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		System.out.println("Element in an Array if present/not");
		
		System.out.print("enter the size of array: ");
		int size = sc.nextInt();
		
		int []arr = new int[size];
		
		System.out.print("enter "+size+" elements: ");
		for(int i = 0; i<size; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter searching element: ");
		int target = sc.nextInt();
		
		int index = -1;
		for(int i = 0; i<arr.length; i++)
		{
			if(target == arr[i])
			{
				index = i;
				break;
			}
		}
		
		if(index == -1)
		{
			System.out.println("Element not found");
		}
		else {
			System.out.println("Element found at index : "+index);
		}
		
		
		
		
		
//		try(sc)
//		{
//			System.out.println("enter the array size: ");
//			int size = sc.nextInt();
//			int []arr = new int[size];
//			
//			int max=0;
//			
//			for(int i= 0; i<arr.length; i++)
//			{
//				System.out.println("Enter "+i+" value: ");
//				arr[i] = sc.nextInt();
//				
//				if(max<arr[i])
//				{
//					max= arr[i];
//				}
//			}
//			System.out.println("max element: "+max);
//			
//		} catch (Exception e) {
//			System.err.println(e.getMessage());
//		}
	}
}
