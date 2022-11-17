package com.Day1;

import java.util.Scanner;

public class AdditonOFBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int digit,digit1,temp,temp1,sum,carry=0;
        int[] arr=new int[10];
        //Demo.squreroot(16);
        System.out.println("Enter the first string");
        String str= sc.nextLine();      
        System.out.println("Enter the second string");
        String str1= sc.nextLine();
        
        temp=Integer.parseInt(str);
        temp1=Integer.parseInt(str1);
        
        for(int i=arr.length-1;i>=0;i--)
        {
            
            digit=temp%10;
            digit1=temp1%10;
            temp=temp/10;
            temp1=temp1/10;
        sum=digit+digit1+carry;
        if(sum==0) {
        arr[i]=0;
        carry=0;
        }
        else if(sum==1)
        {
            arr[i]=1;
            carry=0;
        }
        else if(sum==2) {
            arr[i]=0;
            carry=1;
        }
        else if(sum==3) {
            arr[i]=1;
            carry=1;
        }
        }
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i]);
        }
        
        
    }


}
