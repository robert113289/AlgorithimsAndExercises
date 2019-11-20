package com.exercises;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HackerRankTest {
	
	@Test
	public void repeatedString() {
		assertEquals(7, HackerRank.repeatedString("aba", 10));
		assertEquals(1000000000000L, HackerRank.repeatedString("a", 1000000000000L));
	}
	
	
}