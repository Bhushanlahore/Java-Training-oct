package com.ExceptionHandling;

public class Employee {
    private int id;
    private String name;
    private int age;
        
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age)throws AgeInvalidException {
		
			if(age<18)
			{
				throw new AgeInvalidException("the employee must be greater than of 18 years of age");
			}
			else
			{
				this.age=age;
			}
	}

	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.setId(1);
		e1.setName("amit");
		try {
			e1.setAge(22);
			
		}
		catch(AgeInvalidException ex)
		{
			System.out.println(ex.getMessage());
		}
		
		
	}
}
