package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearch {

	public static void main(String[] args) {
		
		List<Integer> a1=new ArrayList<Integer>();
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(10);
		a1.add(20);
		
		int index=Collections.binarySearch(a1, 10);
		System.out.println(index);
		
		index=Collections.binarySearch(a1, 20);
		
	}
}
