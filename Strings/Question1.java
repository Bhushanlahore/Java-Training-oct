package com.Assignments;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = "";
		
		System.out.println("Enter the first string: ");
		String str1 = sc.next();
		
		
		System.out.println("Enter the index");
		int index = sc.nextInt();
		
		System.out.println("Enter the second string: ");
		String str2 = sc.next();
		
		for(int i=0; i<str1.length(); i++) {
			
			if(i == index) {
				str = str +  str2 + str1.charAt(i);
			}
			else {
				str =str+ str1.charAt(i);
				//System.out.print(str);
			}
			}
		
		
		System.out.println(str);
		
	}
}
