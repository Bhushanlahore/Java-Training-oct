package com;

public class EmployeeMaster {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e = new Employee(12, "ashish", 30000, 20, "Manager");
		
		try {
			//EmployeeDao.insertEmployee(e);
		//	System.out.println("Successfully added");
		} catch (Exception ex) {
			// TODO: handle exception
			ex.getMessage();
		}
		
		try {
			//EmployeeDao.updateEmployee(e);
			//System.out.println("Successfully updated");
		} catch (Exception ex) {
			// TODO: handle exception
			ex.getMessage();
		}
		
		try {
			
			//EmployeeDao.getAllEmployees().stream().forEach((a)->System.out.println(a));
			//EmployeeDao.getAllEmployees().stream().forEach(e->System.out.println(e.getEid()+" "+e.getEname()+" "+e.getSalary()+" "+e.getDeptid()+" "+e.getDesignation()));
			//System.out.println(EmployeeDao.getEmployeeById(12));
			//System.out.println(EmployeeDao.getEmployeeByName("rohan"));
		} catch (Exception ex) {
			// TODO: handle exception
			ex.getMessage();
		}
		
		try {
			
			EmployeeDao.getEmployeeByDepartnameName("sales").stream().forEach(a->System.out.println(a));
		} catch (Exception e2) {
			// TODO: handle exception
			e2.getMessage();
		}
	}

}
