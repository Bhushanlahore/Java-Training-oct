package com.Assignments;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "amit";
		
		char ch[] = str.toCharArray();
		
		
		for(int i=0; i<str.length()-1; i++) {
			for(int j=i+1; j<str.length(); j++)
			
				if(ch[i] > ch[j]) {
					
					char t = ch[i];
					ch[i] = ch[j];
					ch[j] = t;
				}
		}
		
		System.out.println(ch);
		
		
		for(int i=ch.length-1; i>=0; i--) {
			
			System.out.print(ch[i]);

		}
	
	}

}
