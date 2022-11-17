package com.Day1;

public class NaturalNo {
	
	public static void printMaster(int n) {
		if(n<1)
			return;
		printMaster(n-1);
		System.out.print(n+ " ");
	}
	
	public static void printMaster1(int a) {
		if(a<1)
			return;
		System.out.print(a+ " ");
		printMaster1(a-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum=0;
		
		for(int i=1; i<=10; i++) {
			sum+=i;
		}
		
		System.out.println("Sum of first 10 natural no: "+ sum);

		/*
		 * for(int i=1; i<=10; i++) {
		 * 
		 * System.out.print(i+"  "); }
		 */
		
		NaturalNo.printMaster(10);
		NaturalNo.printMaster1(10);
	}

}
