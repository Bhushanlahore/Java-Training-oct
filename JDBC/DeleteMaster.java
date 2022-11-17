package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteMaster {

	static String URL = "jdbc:mysql://localhost:3306/jdbcmaster";
	static String USERNAME="root";
	static String PASSWORD="9025";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
			
			Scanner sc = new Scanner(System.in);
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(URL,USERNAME,PASSWORD);
			
			
			PreparedStatement pst = con.prepareStatement("delete from employee where eid=?");
			System.out.println("Enter the id");
			pst.setInt(1, Integer.parseInt(sc.nextLine()));
						
			pst.executeUpdate();
			con.close();
			
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}	}

}
