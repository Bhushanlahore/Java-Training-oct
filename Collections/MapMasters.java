package com.collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Student1
{
	int id;
	String name;
	int age;
	Student1(int id,String name,int age)
	{
		this.id=id;
		this.name=name;
		this.age=age;
	}
}
class Teacher
{
	int id;
	String name;
	Teacher(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
}

public class MapMasters {
public static void main(String[] args) {
	Map<Teacher, List<Student1>> m2 = new HashMap<Teacher, List<Student1>>();
	m2.put(new Teacher(1,"jainam"),Arrays.asList(new Student1(1,"amit",21),new Student1(2,"neha",23)));
	m2.put(new Teacher(1,"nikhil"),Arrays.asList(new Student1(1,"vishal",21),new Student1(2,"shekhar",23)));
	
    for(Teacher t:m2.keySet())
    {
    	if(t.name.equals("nikhil"))
    	{
    		System.out.println(m2.get(t).size());
    	}
    }
}
}
