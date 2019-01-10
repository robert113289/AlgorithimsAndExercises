package com.exercises;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringCompressionTest {

	@Test
	public void compress() {
		StringCompression sc = new StringCompression();
		String result = sc.compress("aaabbccccaa");
		assertEquals("a3b2c4a2",result);

		result = sc.compress("aaabbcccca");
		assertEquals("a3b2c4a",result);

		result = sc.compress("abbcccca");
		assertEquals("ab2c4a",result);

	}
}