package com.qa.myblackjack;

import static org.junit.Assert.assertEquals;

import org.junit.*;

public class BlackjackTest {
	static int x = 1;
	
	@BeforeClass
	public static void welcome()
	{
		System.out.println("Welcome to my test's ");
	}
	
	@Before
	public void setup()
	{
		System.out.println("Test " + x + "/17");
	}
	
	@Test 
	public void test1() 
	{
		Blackjack b = new Blackjack();
		assertEquals("Error both invalid partitions",0,b.Play(-10,-10)); //Error both invalid partitions 
	}
	
	@Test 
	public void test2() 
	{
		Blackjack b = new Blackjack();
		assertEquals("Error one invalid partition" ,0,b.Play(-10,10)); //Error one invalid partition
	}
	@Test 
	public void test3() 
	{
		Blackjack b = new Blackjack();
		assertEquals("Error one invalid partition",0,b.Play(-10,30)); //Error one invalid partition
	}
	@Test 
	public void test4() 
	{
		Blackjack b = new Blackjack();
		assertEquals("Error one invalid partition",0,b.Play(-10,50)); //Error one invalid partition
	}
	@Test 
	public void test5() 
	{
		Blackjack b = new Blackjack();
		assertEquals("Error one invalid partition",0,b.Play(10,-10)); //Error one invalid partition
	}
	@Test 
	public void test6() 
	{
		Blackjack b = new Blackjack();
		assertEquals("20 wins (dealer)", 20,b.Play(10,20)); // 20 wins (dealer)
	}
	@Test 
	public void test7() 
	{
		Blackjack b = new Blackjack();
		assertEquals("20 wins (player)",20,b.Play(20,10)); // 20 wins (player)
	}
	@Test 
	public void test8() 
	{
		Blackjack b = new Blackjack();
		assertEquals("10 wins (dealer bust)",10,b.Play(10,30)); // 10 wins (dealer bust)
	}
	@Test 
	public void test9() 
	{
		Blackjack b = new Blackjack();
		assertEquals("Error one invalid partition",0,b.Play(10,50)); //Error one invalid partition
	}
	@Test 
	public void test10() 
	{
		Blackjack b = new Blackjack();		
		assertEquals("Error one invalid partition",0,b.Play(30,-10)); //Error one invalid partition
	}
	@Test 
	public void test11() 
	{
		Blackjack b = new Blackjack();
		assertEquals("10 wins (player bust) ",10,b.Play(30,10)); // 10 wins (player bust) 
	}
	@Test 
	public void test12() 
	{
		Blackjack b = new Blackjack();
		assertEquals("draw no one wins",0,b.Play(30,30)); // draw no one wins 
	}
	@Test 
	public void test13() 
	{
		Blackjack b = new Blackjack();
		assertEquals("Error one invalid partition",0,b.Play(30,50)); //Error one invalid partition
	}
	@Test 
	public void test14() 
	{
		Blackjack b = new Blackjack();		
		assertEquals(0,b.Play(50,-10)); //Error both invalid partitions 
	}
	@Test 
	public void test15() 
	{
		Blackjack b = new Blackjack();
		assertEquals("Error one invalid partition",0,b.Play(50,10)); //Error one invalid partition
	}
	@Test 
	public void test16() 
	{
		Blackjack b = new Blackjack();
		assertEquals("Error one invalid partition",0,b.Play(50,30)); //Error one invalid partition
	}
	@Test 
	public void test17() 
	{
		Blackjack b = new Blackjack();
		assertEquals("Error both invalid partitions",0,b.Play(50,50)); //Error both invalid partitions
	}
	@After 
	public void teardown()
	{
		System.out.println("Test " + x + "/17 completed");
		x++;
	}
	@AfterClass
	public static void endscript()
	{
		System.out.println("All Tests complete");
	}

	}


