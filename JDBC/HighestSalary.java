package com;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class HighestSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Highest Salary:-");
		try {
			Connection con = ConnectionMaster.getConnection();
			PreparedStatement pst = con.prepareStatement("select ename,salary from employee order by salary DESC limit 1");
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				
				System.out.println("Name: "+ rs.getString(1)+" Salary: "+rs.getInt(2));
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		System.out.println("===============================================");
		
		System.out.println("Second Highest Salary:-");
		try {
			Connection con = ConnectionMaster.getConnection();
			PreparedStatement pst = con.prepareStatement("select ename,salary from employee order by salary DESC limit 1,1");
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				
				System.out.println("Name: "+ rs.getString(1)+" Salary: "+rs.getInt(2));
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		System.out.println("===============================================");
		
		System.out.println("All Manager of Organization:-");
		try {
			Connection con = ConnectionMaster.getConnection();
			PreparedStatement pst = con.prepareStatement("select ename from employee where designation='manager'");
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				
				System.out.println(rs.getString(1));
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}
