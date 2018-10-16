package com.qa.myblackjack;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)

public class ParameterTestClass 
{
	Blackjack b = new Blackjack();
	
	
		
		@Parameters
		public static Collection<Object[]> data()
		{
			return Arrays.asList(new Object[][]{{0,-10,-10},{20,20,10},{20,10,20},{0,40,30},{10,30,10},{0,50,50}});
		}
		
		private int intPut1;
		private int intPut2;
		private int intPected;
		
		public ParameterTestClass(int expected, int input1,int input2)
		{
			intPut1 = input1;
			intPut2 = input2;
			intPected = expected;
		}
		
		@Test
		public void test()
		{
			assertEquals(intPected,b.Play(intPut1,intPut2));
		}
		
}
	
	


