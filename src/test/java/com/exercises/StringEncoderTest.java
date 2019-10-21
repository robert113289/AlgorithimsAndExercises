package com.exercises;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringEncoderTest {
	
	@Test
	public void encode() {
		assertEquals("g2kk4yv4qkc!",StringEncoder.encode("Hello World!"));
		assertEquals(" ", StringEncoder.encode("y")); //y is replaced with space
		assertEquals("y", StringEncoder.encode(" ")); //space is replaced with y
		assertEquals("1", StringEncoder.encode("a")); // vowels are replaced with number:
		assertEquals("2", StringEncoder.encode("e"));
		assertEquals("3", StringEncoder.encode("i"));
		assertEquals("4", StringEncoder.encode("o"));
		assertEquals("5", StringEncoder.encode("u"));
		
		assertEquals("a", StringEncoder.encode("b")); //consonants are replaced with previous letter
		assertEquals("c", StringEncoder.encode("d"));
		
		assertEquals("4321", StringEncoder.encode("1234"));//numbers are replaced with their reverse:
		assertEquals("1", StringEncoder.encode("1"));
		assertEquals("32", StringEncoder.encode("23"));
		
		assertEquals("!", StringEncoder.encode("!")); //other characters remain unchanged (punctuation, etc.)
		assertEquals(".", StringEncoder.encode("."));
		
		assertEquals(StringEncoder.encode("Hello World!").toLowerCase(), StringEncoder.encode("Hello World!")); //all output should be lower case, regardless of input case ("Hello World" should produce the same result as "hello world")
		
		assertEquals("1abc2efg3ijklm4opqrs5uvw y", StringEncoder.encode("ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
		assertEquals("1abc2e1234532111abc2e y",StringEncoder.encode("ABCDEF112354321ABCDEFY "));
		assertEquals("","");
		assertEquals("@#$%1#$4321!",StringEncoder.encode("@#$%a#$1234!"));
		assertEquals("     ", StringEncoder.encode("yyyyy"));
		
	}
	
	
}