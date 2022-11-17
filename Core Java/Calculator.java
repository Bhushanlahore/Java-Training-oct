package com.Day1;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Welcome to Calculator:- ");
		System.out.println("=========================");
		
		while(true) {
			System.out.println("\nPress 1 to Addition");
			System.out.println("Press 2 to Subtraction");
			System.out.println("Press 3 to Multiplication");
			System.out.println("Press 4 to Division");
			System.out.println();
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Your Choice: ");
			int choice = sc.nextInt();
			
			System.out.println("Enter the first no: ");
			int n1 = sc.nextInt();
			System.out.println("Enter the Second no: ");
			int n2 = sc.nextInt();
			switch(choice) {
			
			case 1: 
					
					int sum = n1 + n2;
					
					System.out.println("Addition is: "+sum);
					break;
			
			case 2: 
				
				int sub = n1 - n2;
				
				System.out.println("Subtraction is: "+sub);
				break;
				
			case 3: 
				
				int mul = n1 * n2;
				
				System.out.println("Multiplication is: "+mul);
				break;
				
			case 4: 
				
				float div = n1/n2;
				
				System.out.println("Division is: "+div);
				break;
					
			default:
					System.out.println("You Entered Wrong Choice!!!");
			}
		}
	}

}
