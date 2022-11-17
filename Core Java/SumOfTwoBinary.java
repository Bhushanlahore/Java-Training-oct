package com.Day1;

import java.util.Scanner;

public class SumOfTwoBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first Binary No: ");
		String str1 = sc.next();
		
		System.out.println("Enter the Second Binary No: ");
		String str2 = sc.next();
		
		int n1 = Integer.parseInt(str1,2);
		int n2 = Integer.parseInt(str2,2);
		
		System.out.println(n1+" "+n2);
	}

}
