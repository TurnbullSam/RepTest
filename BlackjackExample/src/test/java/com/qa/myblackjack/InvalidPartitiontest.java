package com.qa.myblackjack;
import static org.junit.Assert.assertEquals;

import org.junit.*;

public class InvalidPartitiontest {
	
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

}
