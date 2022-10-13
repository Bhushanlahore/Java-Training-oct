package com.Assignments;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "welcoooome to java";
		
		char c[] = s.toCharArray();
		
		for(int i=0; i<s.length(); i++) {
			int count =0;
			for(int j=i+1; j<s.length(); j++) {
		
				if(c[i] == c[j] && c[i]!=' ') {
				count++;
			
				//to avoid printing repeated character
				c[j] = '1';
				}
			
			}
			if(count>0 &&  c[i]!='1') {
				System.out.println(c[i]+" "+ count);
			}
		}
	}

}
