package com.qa.myblackjack;

public class Blackjack {
	public static void main(String[]args)
	{
		
	}
	public int Play(int player, int dealer) 
	{
		
		if(player < 0 || player >= 32 || dealer < 1 || dealer >= 32)
		{
			return 0;
		}
		else if((dealer >= player && dealer <=21) || (player >=22 && dealer <=21)) 
		{
			return dealer;
		}
		else if((player > dealer && player <=21) || (dealer >= 22 && player <=21)) 
		{
			return player;
		}
		
		
		return 0;	
	}
}