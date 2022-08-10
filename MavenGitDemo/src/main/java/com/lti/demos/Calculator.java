package com.lti.demos;

public class Calculator 
{
public String sayHello()
{
return "Hello World";	
}

public int addno(int x,int y)
{
	return x+y;
}
public int subno(int x,int y)
{
	return x-y;
}

public void searchEmp(int empId)
{
	if(empId==0)
	{
		throw new ArithmeticException("You enetered zero");
	}
	else
	{
		System.out.println("dsd");
	}
}
}
