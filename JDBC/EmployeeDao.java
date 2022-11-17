package com;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

public class EmployeeDao {


	public static void insertEmployee(Employee e) throws Exception{
		
		Connection con = ConnectionMaster.getConnection();
		
		PreparedStatement pst = con.prepareStatement("insert into employee(eid, ename, salary,deptid,designation) values(?,?,?,?,?)");
		
		pst.setInt(1, e.getEid());
		pst.setString(2, e.getEname());
		pst.setInt(3, e.getSalary());
		pst.setInt(4, e.getDeptid());
		pst.setString(5, e.getDesignation());
		pst.executeUpdate();
		con.close();
		
	}
	
	public static void updateEmployee(Employee e) throws Exception{
		
		Connection con = ConnectionMaster.getConnection();
		PreparedStatement pst = con.prepareStatement("update employee set ename=?, salary=?, deptid=?, designation=? where eid=?");
		pst.setInt(5, e.getEid());
		pst.setString(1, e.getEname());
		pst.setInt(2, e.getSalary());
		pst.setInt(3, e.getDeptid());
		pst.setString(4, e.getDesignation());
		pst.executeUpdate();
		con.close();
	}
	
	public static List<Employee> getAllEmployees() throws Exception{
		
		List<Employee> empl = new ArrayList<Employee>();
		
		Connection con = ConnectionMaster.getConnection();
		Statement st = con.createStatement();
		
		ResultSet rs =	st.executeQuery("select * from employee");
		
		while(rs.next()) {
			empl.add(new Employee(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4),rs.getString(5)));
			
		}
			return empl;
	}
	
	public static Employee getEmployeeById(int id) throws Exception{
		
		List<Employee> empl = new ArrayList<Employee>();
		Connection con = ConnectionMaster.getConnection();
		PreparedStatement pst = con.prepareStatement("select * from employee where eid=?");
		pst.setInt(1, id);
		
		ResultSet rs = pst.executeQuery();
		
		if(rs.next()) {
			return new Employee(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4),rs.getString(5));
		}else {
			
			System.out.println("Employee with this id not found  ");
			return null;
		}
	}
		
	public static Employee getEmployeeByName(String name) throws Exception{
		
		List<Employee> empl = new ArrayList<Employee>();
		Connection con = ConnectionMaster.getConnection();
		PreparedStatement pst = con.prepareStatement("select * from employee where ename=?");
		pst.setString(1, name);
		
		ResultSet rs = pst.executeQuery();
		
		if(rs.next()) {
			return new Employee(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4),rs.getString(5));
		}else {
			
			System.out.println("Employee with this id not found  ");
			return null;
		}
	}
	
	public static List<Employee> getEmployeeByDepartnameName(String dname) throws Exception{
		
		List<Employee> emp = new ArrayList<Employee>();
		
		Connection con = ConnectionMaster.getConnection();
		PreparedStatement pst = con.prepareStatement("select * from employee e join department d on e.deptid=d.deptid where d.dname=?");
		pst.setString(1, dname);
		
		ResultSet rs = pst.executeQuery();
		
		java.sql.ResultSetMetaData mt = rs.getMetaData();
		
		for(int i=1; i<=mt.getColumnCount(); i++) {
			System.out.println(mt.getColumnName(i)+ " has the type "+ mt.getColumnTypeName(i));
		}
		
		
		while(rs.next()) {
			emp.add(new Employee(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4),rs.getString(5)));
		}
		
		return emp;
	
	}
	
	public static void deleteEmployee(int id) throws Exception{
		
		Connection con = ConnectionMaster.getConnection();
		
	}
}
