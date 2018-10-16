package com.qa.myblackjack;

import static org.junit.Assert.assertEquals;

import org.junit.*;


public class Bustpartitiontest {
	
	@Test 
	public void test8() 
	{
		Blackjack b = new Blackjack();
		assertEquals("10 wins (dealer bust)",10,b.Play(10,30)); // 10 wins (dealer bust)
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
}
