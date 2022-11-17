package com.collections;

import java.util.*;



class Student{
	private int id;
	private String name;
	private int age;
	
	Student(){
		
	}

	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	

	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public boolean equals(Object t)
	{
		Student s=(Student)t;
		if(s.id==this.id && s.getName().equals(this.getName()) && s.age==this.age)
			return true;
		else
			return false;
	}
	
}
class studentmaster
{
	List<Student>arr=new ArrayList<Student>();
	studentmaster()
	{
		arr.add(new Student(1,"rashmi",21));
		arr.add(new Student(2,"sujata",22));
		
	}
	public boolean doesExist(Student s) {
		boolean exists=false;
		for(Student st:this.arr)
		{
			if(st.equals(s))
			{
				exists=true;
				break;
			}
		}
		return exists;
		
	}
	public void deleteStudent(Student s)
	{
		for(int i=0;i<this.arr.size();i++)
		{
			if(arr.get(i).equals(s))
				arr.remove(i);
		}
	}
	public void displayStudent(Student s)
	{
		for(Student ss:arr)
		{
		     System.out.println(ss);
		}
	}
	public void updateStudent(Student s)
	{
		for(int i=0;i<this.arr.size();i++)
		{
			if(arr.get(i).getId()==s.getId())
				arr.set(i,s);
		}
	}
	public void bigAge(Student s)
	{
		for(int i=0;i<this.arr.size();i++)
		{
	       if(arr.get(i).getId()==s.getId())
				arr.set(i,s);
	           
		}
	}
}

public class CollectionMaster {

	public static void main(String[] args) {
		
		
		studentmaster sm=new studentmaster();
		sm.updateStudent(new Student(1,"rushikesh",25));
		sm.doesExist(new Student(2,"sujata",22));
		sm.displayStudent(new Student(2,"sujata",22));
			}
}
