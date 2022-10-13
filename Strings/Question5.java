package com.Assignments;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        long st = System.currentTimeMillis(); 
        
        StringBuffer sb = new StringBuffer("Amit");  
        for (int i=0; i<5000; i++){  
            sb.append("Verma");  
        }  
        System.out.println("StringBuffer Performance: " + (System.currentTimeMillis() - st)+"ms"); 
        
        st = System.currentTimeMillis();  
        StringBuilder sb2 = new StringBuilder("Amit");  
        for (int i=0; i<5000; i++){  
            sb2.append("Verma");  
        }  
        System.out.println("StringBuilder Performance: " + (System.currentTimeMillis() - st)+"ms");  

	}

}
