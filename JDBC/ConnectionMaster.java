package com;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionMaster {

	static String URL = "jdbc:mysql://localhost:3306/jdbcmaster";
	static String USERNAME="root";
	static String PASSWORD="9025";
	
	public static Connection getConnection() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(URL,USERNAME,PASSWORD);
			return con;
		
		} catch (Exception e) {
			return null;
		}
	}
}
