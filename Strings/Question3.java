package com.Assignments;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "welcome to the world";
		String s1="";
		
		for(int i=0; i<str.length(); i++) {
			
			if(str.charAt(i)=='a' || str.charAt(i)=='e' ||str.charAt(i)=='i' ||
					str.charAt(i)=='o' || str.charAt(i)=='u' || str.charAt(i)=='A' ||
					str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' ||
					str.charAt(i)=='U') {
				
				continue;
			}
			else {
				s1 = s1 + str.charAt(i);
				//System.out.print(str.charAt(i));
			}
		}
		System.out.println(s1);
	}

}
