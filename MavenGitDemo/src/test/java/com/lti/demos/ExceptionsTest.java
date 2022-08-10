package com.lti.demos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ExceptionsTest {

	@Test
	void testExceptions() 
	{
		Assertions.assertThrows(IllegalArgumentException.class,
				()->{Integer.parseInt("One");});
	}
	@Test
	public void testmethodExp()
	{
		Calculator obj=new Calculator();
		final Exception e=assertThrows(ArithmeticException.class,
				()->{obj.searchEmp(0);});
		Assertions.assertEquals("You enetered zero",e.getMessage());
	}

}
