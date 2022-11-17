package com.collections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionSort {

	public static void main(String[] args) {
		
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("rashmi");
		a1.add("rushikesh");
		a1.add("Sujata");
		a1.add("komal");
		
		Collections.sort(a1);
		System.out.println("list after the use of:"+"Collection.sort() :\n"+a1);
		
		
		
		
	}
}
