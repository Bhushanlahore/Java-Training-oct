package com;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ResultSetMaster {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			Connection con = ConnectionMaster.getConnection();
			Statement st = con.createStatement();
			
			
			ResultSet rs = st.executeQuery("select * from employee");
			
			while(rs.next()) {
				
				System.out.println(rs.getInt(1)+ "  "+rs.getString(2)+"  "+ rs.getInt(3)+"  "+ rs.getInt(4)+"  "+rs.getString(5));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
