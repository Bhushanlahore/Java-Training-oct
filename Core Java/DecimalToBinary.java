package com.Day1;

public class DecimalToBinary {

	public static void DecimalToB(int n){
		
		int temp=n;
		String s ="";
		
		while(temp>0) {
			int r = temp%2;
			temp = temp/2;
			s = r + s;	
		}
		System.out.println("Decimal to Binary: "+s);

	}
	
	public static void BinaryToD(int n){
		
		int temp=n;
		double d =0;
		int i=0;
		
		while(temp>0) {
			int r = temp%10;
			temp = temp/10;
			d = d + r * Math.pow(2, i++);
		}
		System.out.println("Binary To Decimal: "+d);

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DecimalToBinary.DecimalToB(11);
		DecimalToBinary.BinaryToD(011);
		
		
			}

}
