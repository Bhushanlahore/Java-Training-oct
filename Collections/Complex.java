package com.collections;

public class Complex {
	int real;
	int imaginary;
	
	public Complex() {
		super();
	}


   public Complex(int realnumber, int imaginarynumber) {
		super();
		this.real = realnumber;
		this.imaginary = imaginarynumber;
	}

    public static Complex Add(Complex n1,Complex  n2)
    {
    	Complex temp=new Complex();
    	temp.real=n1.real+n2.real;
    	temp.imaginary=n1.imaginary+n2.imaginary;
		return temp;
    	
    }

	public static void main(String[] args) 
	{
		Complex n1=new Complex(3,4),
				n2=new Complex(6,7),
				temp;
		temp=Add(n1,n2);
		System.out.println("Addition of complex number is::"+temp.real+"i+"+temp.imaginary);
		

	}

}
