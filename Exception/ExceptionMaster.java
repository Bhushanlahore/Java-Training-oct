package com.ExceptionHandling;

import java.util.Scanner;


class Master{
	int a;
}
public class ExceptionMaster {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the first number");
		int a=sc.nextInt();
		System.out.println("Enter the second number");
		int b=sc.nextInt();
		int arr[]= {1,2};
		
		
		try {
		System.out.println(a+" divided by "+b+ "is "+a/b);
	
		}
		catch(ArithmeticException ex)
		{
			System.out.println(ex.getMessage());
		}
		
		try {
			System.out.println(arr[1]);
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println(ex.getMessage());
		}
		
		try {
			Master a1=null;
			System.out.println(a1.a);
		}
		catch(NullPointerException ex)
		{
			System.out.println(ex.getMessage());
		}
		System.out.println("Hello Master Developer!!!");
	} 
}
