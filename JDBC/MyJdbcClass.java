package com;

import java.sql.*;
import java.util.Scanner;
public class MyJdbcClass {

	static String URL = "jdbc:mysql://localhost:3306/jdbcmaster";
	static String USERNAME="root";
	static String PASSWORD="9025";
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			Scanner sc = new Scanner(System.in);
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(URL,USERNAME,PASSWORD);
			
			/*
			PreparedStatement pst = con.prepareStatement("insert into employee(eid, ename, salary,deptid,designation) values(?,?,?,?,?)");
			System.out.println("Enter the id");
			pst.setInt(1, Integer.parseInt(sc.nextLine()));
			System.out.println("Enter the name: ");
			pst.setString(2, sc.nextLine());
			System.out.println("Enter the salary: ");
			pst.setInt(3, Integer.parseInt(sc.nextLine()));
			System.out.println("Enter the dept id");
			pst.setInt(4, Integer.parseInt(sc.nextLine()));
			System.out.println("Enter the designation: ");
			pst.setString(5, sc.nextLine());
			
			pst.executeUpdate();
			con.close(); */
			
			PreparedStatement pst = con.prepareStatement("update employee set ename=?, salary=?, deptid=?, designation=? where eid=?");
			System.out.println("Enter the id");
			pst.setInt(5, Integer.parseInt(sc.nextLine()));
			System.out.println("Enter the name: ");
			pst.setString(1, sc.nextLine());
			System.out.println("Enter the salary: ");
			pst.setInt(2, Integer.parseInt(sc.nextLine()));
			System.out.println("Enter the dept id");
			pst.setInt(3, Integer.parseInt(sc.nextLine()));
			System.out.println("Enter the designation: ");
			pst.setString(4, sc.nextLine());
			
			pst.executeUpdate();
			con.close();
			
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
	}

}
