package com.collections;

import java.util.HashMap;
import java.util.Map;

public class MapMaster {
public static void main(String[] args) {
	Map<String, Integer>m1=new HashMap<String,Integer>();
	m1.put("amit", 21);
	m1.put("neha", 23);
	m1.put("jatin", 24);
	m1.put("vishal", 20);
	m1.put("jatin", 23);
	
	//System.out.println("neha's age is :"+m1.get("neha"));
	//System.out.println("size of map: "+m1.size());
	//System.out.println("age of jatin: "+m1.get("jatin"));
	for(Map.Entry<String, Integer> entry:m1.entrySet())
	{
		System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue()); 
	}
}
}

