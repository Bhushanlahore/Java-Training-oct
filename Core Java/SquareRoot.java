package com.Day1;

public class SquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int no =76;
		
		double temp=0;
		double sqr = no/2;
		
		do {
			temp = sqr;
			sqr = (temp+(no/temp))/2;
		}while((temp-sqr)!=0);
		
		System.out.println(sqr);
		
}
}
