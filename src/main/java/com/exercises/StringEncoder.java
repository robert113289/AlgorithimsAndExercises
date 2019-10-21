package com.exercises;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringEncoder {
/*
	In this exercise you will build a rudimentary string encoder with the following rules:
		vowels are replaced with number: a -> 1, e -> 2, i -> 3, o -> 4, and u -> 5
		consonants are replaced with previous letter: b -> a, c -> b, d -> c, etc.
		y is replaced with space
		space is replaced with y
		numbers are replaced with their reverse: 1 -> 1, 23 -> 32, 1234 -> 4321
		other characters remain unchanged (punctuation, etc.)
		all output should be lower case, regardless of input case ("Hello World" should produce the same result as "hello world")
	*/
	
	
	// Complete the encode function below.
	static String encode(String stringToEncode) {
		if (stringToEncode == null) return stringToEncode;
		String partiallyEncodedString = encodeNumbersInString(stringToEncode);
		String fullyEncodedString = encodeLettersInString(partiallyEncodedString);
		return fullyEncodedString;
	}
	
	private static String encodeLettersInString(String stringToEncode) {
		StringBuilder encodedStringSb = new StringBuilder();
		for (int i = 0; i < stringToEncode.length(); i++) {
			String letter = stringToEncode.substring(i, i + 1).toLowerCase();
			String encodedLetter = ConversionMaps.LETTER_CONVERSIONS_MAP.getOrDefault(letter, letter);
			encodedStringSb.append(encodedLetter);
		}
		return encodedStringSb.toString();
	}
	
	private static String encodeNumbersInString(String stringToEncode) {
		StringBuilder encodedStringSb = new StringBuilder();
		int idx = 0;
		while (idx < stringToEncode.length()) {
			if (StringUtils.isNumberAtIndex(stringToEncode, idx)) {
				int startOfNumber = idx;
				int endOfNumber = StringUtils.indexOfNumbersLastDigit(stringToEncode, idx);
				String numberStr = stringToEncode.substring(startOfNumber, endOfNumber + 1);
				numberStr = StringUtils.reverseString(numberStr);
				encodedStringSb.append(numberStr);
				idx = endOfNumber + 1;
			} else {
				//letter was not a number so add it to the encoded string unchanged.
				char letter = stringToEncode.charAt(idx);
				encodedStringSb.append(letter);
				idx += 1;
			}
		}
		return encodedStringSb.toString();
	}
	
	static class StringUtils {
		public static String reverseString(String stringToBeReversed) {
			StringBuilder sb = new StringBuilder(stringToBeReversed);
			return sb.reverse().toString();
		}
		
		public static int indexOfNumbersLastDigit(String stringToFindNumberIn, int indexOfNumbersFirstDigit) {
			int idx = indexOfNumbersFirstDigit;
			while (idx < stringToFindNumberIn.length() && StringUtils.isNumberAtIndex(stringToFindNumberIn, idx)) {
				idx += 1;
			}
			return idx - 1;
		}
		
		public static boolean isNumberAtIndex(String string, int index) {
			return Character.isDigit(string.charAt(index));
		}
		
		
	}
	
	
	static class ConversionMaps {
		private static Map<String, String> LETTER_CONVERSIONS_MAP = Stream.of(new String[][] {
				{"a", "1"},
				{"b", "a"},
				{"c", "b"},
				{"d", "c"},
				{"e", "2"},
				{"f", "e"},
				{"g", "f"},
				{"h", "g"},
				{"i", "3"},
				{"j", "i"},
				{"k", "j"},
				{"l", "k"},
				{"m", "l"},
				{"n", "m"},
				{"o", "4"},
				{"p", "o"},
				{"q", "p"},
				{"r", "q"},
				{"s", "r"},
				{"t", "s"},
				{"u", "5"},
				{"v", "u"},
				{"w", "v"},
				{"x", "w"},
				{"y", " "},
				{"z", "y"},
				{" ", "y"},
				}).collect(Collectors.toMap(data -> (String) data[0], data -> (String) data[1]));
		
		
	}
	
	
}



