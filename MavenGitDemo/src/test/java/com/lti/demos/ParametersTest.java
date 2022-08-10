package com.lti.demos;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ParametersTest {
@ParameterizedTest	
@ValueSource(ints= {8,10,30,14,20})
public void testIntAryParam(int arg)
{
System.out.println("arg "+arg);
Assertions.assertTrue(arg%2==0);
}
@ParameterizedTest
@ValueSource(strings= {"Hello","World"})
public void testParams(String msg)
{
	Assertions.assertNotNull(msg);
}
@Test
public void testLambdaList()
{
	Integer [] arr= {10,20,5,25};
	List<Integer>list=Arrays.asList(arr);
	Assertions.assertAll(
			()->assertEquals(10,list.get(0)),
			()->assertEquals(20,list.get(1)),
			()->assertEquals(5,list.get(2)),
			()->assertEquals(25,list.get(3)),
			()->assertNull(null)
			);
}
@RepeatedTest(value=3,name="Repeat 3 times")
public void repeattest()
{
	int a=10;
	int b=20;
	Assertions.assertEquals(200,(a*b));
}

}