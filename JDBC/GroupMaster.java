package com;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GroupMaster {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 try {
             Connection con = ConnectionMaster.getConnection();
              PreparedStatement pst=con.prepareStatement("select deptid from department");
              PreparedStatement pst1=con.prepareStatement("select ename from employee where deptid=?");
              
              ResultSet rs=pst.executeQuery();
              
              while(rs.next()) {
                  System.out.println("Department Id: "+rs.getInt(1));
                  pst1.setInt(1, rs.getInt(1));
                  ResultSet rs1=pst1.executeQuery();
                  while(rs1.next()) {
                      System.out.println("Employee Name: "+rs1.getString(1));
                  }
                  
                  System.out.println("==========================");
              }
              con.close();
      } catch (SQLException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
      }
	}

}
