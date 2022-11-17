package com.Day1;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any No: ");
		int n= sc.nextInt();
		
		int no =n;
		int reverse=0;
		
		while(no>0) {
			
			int temp = no%10;
			reverse = reverse *10 +temp;
			no= no/10;	
		}
		
		if(n==reverse)
			System.out.println("Palindrome no");
		else
			System.out.println("Not Palindrome");
		
		
	}

}
