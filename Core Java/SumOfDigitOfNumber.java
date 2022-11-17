package com.Day1;

public class SumOfDigitOfNumber {

	public static void pattern(int a) {
		
		for(int i=1; i<a; i++) {

			for(int k=a; k>=i; k--)
			{
				System.out.print(" ");
			}
			
			for(int j=1; j<=i; j++)
			{
			
				System.out.print(j);
			}
			
			for(int m=i-1; m>=1; m--) {
				System.out.print(m);
			}
			System.out.println();
		}
	}
	
	public static int sumOfDigit(int n) {
		int sum =0;
		
		while(n>0) {
			
			int temp = n%10;
			sum = sum + temp;
			n = n/10;
		}
		return sum;
	}
	
	public static int sumOfDigitRecursive(int n) {
		
		int sum =0;
		
		while(n>0) {
			
			int temp = n%10;
			sum = sum + temp;
			n = n/10;
			sumOfDigitRecursive(n);
			
		}
		
		return sum;
	}
	
	
	public static int fibo(int n) {
		if(n==1 || n==2) 
			return 1;
			else 
		return fibo(n-1)+ fibo(n-2);
			
		}
	
	
	public static boolean isPrime(int n) {
		
		boolean flag=true;
		for(int i=2; i<=n-1; i++) {
			if(n%i==0) {
				flag = false;
				break;
			}
		}
		return flag;	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n =1254;
		int n1=0;
		int n2=1;
		int n3=0;
		System.out.println("Fibbonacci Series: ");
		System.out.print(n2);
		
		for(int i=1; i<10; i++) {
			
			n3 = n1+n2;
			
			System.out.print(","+n3);
			
			n1=n2;
			n2=n3;
		}
		
		System.out.println("\n"+sumOfDigit(1234));
		//System.out.println("\n"+fibo(10));
		System.out.println(SumOfDigitOfNumber.isPrime(5));
		System.out.println("\nPattern: ");
		System.out.println();
		SumOfDigitOfNumber.pattern(5);
		
		System.out.println("\n"+SumOfDigitOfNumber.sumOfDigitRecursive(1234));
		
		
		
	}
}
