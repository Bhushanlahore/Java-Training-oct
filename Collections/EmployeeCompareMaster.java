package com.collections;

import java.util.*;

class Employee implements Comparable<Employee>{
	
	int id;
	int Name;
	int age;
	
	public Employee()
	{
		
	}

	public Employee(int id, int name, int age) {
		super();
		this.id = id;
		Name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getName() {
		return Name;
	}

	public void setName(int name) {
		Name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public int compareTo(Employee o)
	{
		if(this.getAge()>o.getAge())
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}

	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", Name=" + Name + ", age=" + age + "]";
	}
	 
	
}
public class EmployeeCompareMaster {

	
	public static void main(String[] args) {
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee());
        employees.add(new Employee());
        employees.add(new Employee());
        
        Collections.sort(employees);
        for(Employee e:employees)
        {
        	System.out.println(e);
        
        
        System.out.println(employees.get(employees.size()-2).getName());
    }
}
}