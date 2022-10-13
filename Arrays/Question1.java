package com.Assignments.arrays;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {64,75,33,28,57,44,66,23};
		
		int n = arr.length;
		
		int temp;
		for(int i=0; i<n; i++) {
			
			for(int j= i+1; j<n; j++) {
				
				if(arr[i] > arr[j]) {	
					
					 temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+ " ");
		}
		
		System.out.println("\nThird largest element: " + arr[n-3]);
	}

}
