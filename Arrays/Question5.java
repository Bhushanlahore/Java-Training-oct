package com.Assignments.arrays;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {34,3,5,7,2,11,89,86,78,66,109,15};
		int even=0, odd=0,prime=0,perfect=0;
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]%2==0) {
				even++;
			}else {
				odd++;
			}
			
			//int a = arr[i]/2;
			
			int count =0;
			
			for(int j=1; j<=arr[i]; j++) {
				
				if(arr[i]%j==0) {
					
					count = count +1;
				}
			}
			
			if(count==2)
				prime++;
		}
		
		System.out.println(even);
		System.out.println(odd);
		System.out.println(prime);
	}

}
