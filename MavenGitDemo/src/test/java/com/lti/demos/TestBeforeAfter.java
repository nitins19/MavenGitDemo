package com.lti.demos;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class TestBeforeAfter 
{
	Calculator obj=new Calculator();
	int sum=0;
	
	
	@BeforeAll //only once before all the test cases
	public static void testStartDbConn()
	{
		System.out.println("Database connection is up");
	}
	@BeforeEach
	public void testStartup()
	{
		sum=0;
		System.out.println("Sum is zero "+sum);
	}
	@Test
	public void testAddTwoNos()
	{
		System.out.println("Test case 1");
		int result=obj.addno(100,200);
		Assertions.assertEquals(300,result);
	}
	@Test //message is optional
	public void testSubTwoNos()
	{
		System.out.println("Test case 2");
		int result=obj.subno(500,400);
		Assertions.assertEquals(100,result,"please check sub method code");
	}
	
	@AfterEach
	public void testShutDown()
	{
		sum=0;
		System.out.println("Object null");
	}
	@AfterAll //only once after all the test cases
	public static void testShutDbConn()
	{
		System.out.println("Database Shut down");
	}
}
