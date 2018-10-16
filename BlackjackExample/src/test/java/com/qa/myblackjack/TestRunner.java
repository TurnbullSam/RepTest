package com.qa.myblackjack;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner 
{
	public static void main(String[]args)
	{
		TestRunner TestRunner = new TestRunner();
		TestRunner.allTest();
	}

	public void allTest()
	{
		Result result = JUnitCore.runClasses(NotNormalEntriesSuite.class, ValidEntriesSuite.class);
		
		System.out.println("All results passed: " + result.wasSuccessful());
		
		if(!result.wasSuccessful())
		{
			System.out.println("Failed Tests: ");
			
			for (Failure failure: result.getFailures())
			{
				System.out.println(failure.getMessage());
			}
		}
	}
}