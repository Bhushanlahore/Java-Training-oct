package com.collections;

import java.util.HashMap;
import java.util.Map;

public class CharFrequency {

	public static void countfrequency(String str)
	{
		Map<Character,Integer> m1=new HashMap<Character,Integer>();
		for(int i=0;i<str.length();i++)
		{
			if(m1.keySet().contains(str.charAt(i)))
			{
				m1.put(str.charAt(i), m1.get(str.charAt(i))+1);
			}
			else
			{
				m1.put(str.charAt(i), 1);
			}
		}
		System.out.println(m1);
	}
	public static void main(String[] args) {
		
		CharFrequency.countfrequency("sujata shinde");
		
		
	}
}
