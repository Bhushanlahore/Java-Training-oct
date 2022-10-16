package com.Assignments.exception;

import java.util.Scanner;

public class Question1 {

	int rollno;
	String sname;
	String saddress;
	StudentResult srbj;
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSaddress() {
		return saddress;
	}
	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}
	public StudentResult getSrbj() {
		return srbj;
	}
	public void setSrbj(StudentResult srbj) {
		this.srbj = srbj;
	}
	
	public void show() {
		System.out.print("\nRollNo: "+rollno+"\nName: "+sname+"\nAddress: "+saddress+" "+"\n");
		
		
		 try {
		 
		  srbj.getdata(); 
		  } catch (ResultException e1) { // TODO Auto-generated catch
		 System.out.println(e1.getMessage()); }
		 
		
		try {
			srbj.displayResult();
		} catch (FailException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		
	
		StudentResult s1 = new StudentResult();
		System.out.println("Enter the marks of 5 subjects: ");
		
		Scanner sc = new Scanner(System.in);
		int mainarr[] = new int[5];
		
		for(int i=0; i<mainarr.length;i++) {
			mainarr[i] = sc.nextInt();
		}
		
			try {
				s1.setMarks(mainarr);
			} 
		 catch (NegativeInputException e1) {
			// TODO Auto-generated catch block
			System.out.println(e1.getMessage());
		} catch (ResultException e2) {
			// TODO Auto-generated catch block
			System.out.println(e2.getMessage());
		}
		
		Question1 q1 = new Question1();
		q1.setRollno(1);
		q1.setSname("Vipin");
		q1.setSaddress("pune");
		q1.setSrbj(s1);
		//q1.srbj.display();
		
		q1.show();
	
	
	}
}
