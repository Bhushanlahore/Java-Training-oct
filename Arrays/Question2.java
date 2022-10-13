package com.Assignments.arrays;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {45,43,12,66,32,88,88,76,67,88,12,43,};
		int n = arr.length;
		
		for(int i=0; i<n; i++) {
			
			int count=1;
			for(int j= i+1; j<n; j++) {
				
				if(arr[i] == arr[j]) {
					count++;
					
					arr[j] =0;
				}
			}
			
			if(count > 1 && arr[i]!=0) {
				System.out.println(arr[i]+" "+count);
			}
		}
	}

}
