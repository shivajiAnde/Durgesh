package com.springCore.ci;

public class Addition {
	
	int a;
	int b;
	
	public Addition(double a,double b) {
		this.a=(int)a;
		this.b=(int)b;
		System.out.println("constuctor with arguments double,double");
	}
	public Addition(int a,int b) {
		this.a=a;
		this.b=b;
		System.out.println("constuctor with arguments int,int");
	}
	public Addition(String a,String b) {
		this.a=Integer.parseInt(a);
		this.b=Integer.parseInt(b);
		System.out.println("constuctor with arguments String,String");
	}
	public void doSum() {
		System.out.println(this.a);
		System.out.println(this.b);
		System.out.println("sum of the two no's"+(a+b));
	}
}
