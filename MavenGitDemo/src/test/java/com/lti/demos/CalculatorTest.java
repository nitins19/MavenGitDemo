package com.lti.demos;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class CalculatorTest 
{
	Calculator obj=new Calculator();
	@Disabled
	@Test
public void testSayHello()
{
	Assertions.assertEquals("Hello World",obj.sayHello());
}
	@Disabled
	@Test
	public void testAddTwoNos()
	{
		int result=obj.addno(100,200);
		Assertions.assertEquals(300,result);
	}
	@Disabled
	@Test //message is optional
	public void testSubTwoNos()
	{
		int result=obj.subno(500,400);
		Assertions.assertEquals(100,result,"please check sub method code");
	}
	@Disabled
	@Test
	public void testAssertNull()
	{
		String s1=null;
		String s2="Nikhil";
		Assertions.assertNull(s1,"Check if null or not");
		Assertions.assertNotNull(s2);
	}
	@Disabled
	@Test
	public void testAssertFalse()
	{
		Assertions.assertFalse("Nitin".length()==10);
		Assertions.assertFalse(10>20,"10 is smaller than 20");
		Assertions.assertNotEquals("hello", "Hello");
	}
	@Test
	public void testArrays()
	{
		ArrayList<Integer>list=new ArrayList<>();
		Assertions.assertEquals(0, list.size());
		Assertions.assertTrue(list.isEmpty());
		list.add(100);
		list.add(120);
		Assertions.assertEquals(2, list.size());
	}
	
}
