package com.qa.myblackjack;

import static org.junit.Assert.assertEquals;

import org.junit.*;

public class NormalEntrytest {
	
	
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

}
