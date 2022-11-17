package com.ExceptionHandling;

import java.io.File;
import java.io.IOException;

public class FileMaster {
	
	public static int divide(int a,int b)
	{
		return a/b;
	}
public static void main(String[] args) {
	/*
	 * File myObj=new File("filename.txt"); try { myObj.createNewFile();
	 * 
	 * } catch(IOException ex) { System.out.println(ex.getMessage()); }
	 */
	
	try
	{
		System.out.println(FileMaster.divide(10, 0));
	}
	catch(Exception ex)
	{
		System.out.println(ex.getMessage());
	}
}
}
