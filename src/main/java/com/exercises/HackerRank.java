package com.exercises;

public class HackerRank {
	
	
	/**
	 * Complete the repeatedString function in the editor below. It should return an integer representing the number of occurrences of a in the prefix of length  in the infinitely repeating string.
	 * repeatedString has the following parameter(s):
	 *
	 * s: a string to repeat
	 * n: the number of characters to consider
	 *
	 * @param s the s
	 * @param n the n
	 * @return the long
	 */
// Complete the repeatedString function below.
	static long repeatedString(String s, long n) {
		String letterToCount = "a";
		long count = 0;
		if (s.length() < n) {
			long multiple = n / s.length();
			count = countLetter(s, letterToCount) * multiple;
			int end = Math.toIntExact(n % s.length());
			count += countLetter(s.substring(0,end), letterToCount);
		}else {
			count = countLetter(s.substring(0, Math.toIntExact(n) + 1),letterToCount);
		}
		
		return count;
	}
	
	private static long countLetter(String str, String letterToCount) {
		long count = 0;
		for (char letter : str.toCharArray()) {
			if (letterToCount.equalsIgnoreCase(Character.toString(letter))) {
				count += 1;
			}
		}
		return count;
	}
	
}
