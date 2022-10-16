package com.Assignments.exception;
import java.util.Scanner;


public class StudentResult {
	
		private int sub1;
		private int sub2;
		private int sub3;
		private int sub4;
		private int sub5;
		private double result;
		
		private int marks[];
		
		
		public int getSub1() {
			return sub1;
		}
		public void setSub1(int sub1) {
			this.sub1 = sub1;
		}
		public int getSub2() {
			return sub2;
		}
		public void setSub2(int sub2) {
			this.sub2 = sub2;
		}
		public int getSub3() {
			return sub3;
		}
		public void setSub3(int sub3) {
			this.sub3 = sub3;
		}
		public int getSub4() {
			return sub4;
		}
		public void setSub4(int sub4) {
			this.sub4 = sub4;
		}
		public int getSub5() {
			return sub5;
		}
		public void setSub5(int sub5) {
			this.sub5 = sub5;
		}
		public int[] getMarks() {
			return marks;
		}
		public void setMarks(int[] marks) throws NegativeInputException, ResultException {
			
			this.marks = marks;
			
			for(int i=0; i<marks.length; i++) {
				
				if(marks[i] < 0) {
					throw new NegativeInputException("Marks can not be negative");
				}
				
				
			}
		}
		
		
		public void getdata() throws ResultException {
			int count=0;
			for(int i=0; i<marks.length; i++) {
				if(marks[i]<35) {
					count++;
				}
		}
			
			if(count>1) {
				throw new ResultException("you failed in more than 1 subject");
			}
		}
		
		
		public void displayResult() throws FailException {
			int sum=0;

			for(int i=0; i<marks.length; i++) {
			 sum =sum + marks[i];
			}
			result =(int) sum / marks.length;
			System.out.println(result);
			
			if(result < 40 ) {
				throw new FailException("You are failed!!!!!");
			}
			else {
				System.out.println("You have pass the exam");
				System.out.println("Your percentage is: "+ result);
			}
		}
		
		public void display() {
			for(int i=0; i<marks.length; i++) {
				System.out.print(marks[i]+" ");
				
			}
		}
		
		
		public StudentResult() {
			
		}
		
		
		
		
		
		
		
}
