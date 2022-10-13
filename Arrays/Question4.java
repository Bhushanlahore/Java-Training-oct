package com.Assignments.arrays;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {3,6,7,4,17,1,5,8,9,15,};
		int n = arr.length;
		
		for(int i=0; i<n; i++) {
			for(int j = i+1; j<n; j++) {
				for(int k=j+1; k<n; k++) {
					
					int a = arr[i] * arr[i];
					int b = arr[j] * arr[j];
					int c = arr[k] * arr[k];
					
					if(a == b+c || b == a+c || c==a+b) {
						
						System.out.println("Pythagoras Template: "+arr[i]+" " + arr[j]+" "+ arr[k]);
					}
					
				}
			}
		}
	}

}
