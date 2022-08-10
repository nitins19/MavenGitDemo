package com.lti.demos;

public class TestCalc {

	public static void main(String[] args)
	{

		Calculator obj=new Calculator();
		String msg=obj.sayHello();
		System.out.println(msg);
		int sum=obj.addno(23, 21);
		System.out.println(sum);
	}

}
