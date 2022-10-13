package com.Assignments;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str1 = new String("amit");	//2 objects are created, 1 in heap memory and 1 in SCP
		
		String str2 = "amit";   // 0 object is created, because amit is already present in SCP and str2 will refers it 
		
		String str3 = "amit";	// 0 object is created, because amit is already present in SCP and str3 will refers it
		
		System.out.println(str1 == str2); //false
		System.out.println(str2 == str3); //true
		System.out.println(str1 == str3); //false
	}

}
