package com.exercises;

import java.util.*;

public class HackerRank {


    /**
     * Complete the repeatedString function in the editor below. It should return an integer representing the number of occurrences of a in the prefix of length  in the infinitely repeating string.
     * repeatedString has the following parameter(s):
     * <p>
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
            count += countLetter(s.substring(0, end), letterToCount);
        } else {
            count = countLetter(s.substring(0, Math.toIntExact(n) + 1), letterToCount);
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

    ////////////////////////////////////////////////////////////////////////////////////////////////

    /**
     * @see <a href=https://www.hackerrank.com/challenges/balanced-brackets/problem>Hacker rank test: Balanced Brackets</a>
     */
    static String isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (isOpening(s.charAt(i))) {
                stack.push(s.charAt(i));
            } else {
                if (stack.isEmpty()) return "NO";
                if (!isClosingfor(s.charAt(i), stack.pop())) {
                    return "NO";
                }
            }
        }

        return stack.isEmpty() ? "YES" : "NO";
    }

    private static boolean isClosingfor(Character charAt, Character pop) {
        if (pop.equals('(')) return charAt.equals(')');
        if (pop.equals('{')) return charAt.equals('}');
        if (pop.equals('[')) return charAt.equals(']');
        return false;
    }

    private static boolean isOpening(Character c) {
        return c.equals('(') || c.equals('{') || c.equals('[');
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /**
     * @see <a href=https://www.hackerrank.com/challenges/find-the-running-median/problem>Hacker rank test: Running Median</a>
     */
    static double[] runningMedian(int[] a) {
        int size = a[0];
        double[] doubles = new double[size];
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>();

        doubles[0] = a[1];
        minHeap.add(Math.min(a[1], a[2]));
        maxHeap.add(Math.max(a[1], a[2]));
        double median = ((double) minHeap.peek() + maxHeap.peek()) / 2;
        doubles[1] = median;
        for (int i = 3; i < a.length; i++) {
            int num = a[i];
            if (num < median) {
                minHeap.add(num);
            } else {
                maxHeap.add(num);
            }

            if (Math.max(minHeap.size(), maxHeap.size()) - Math.min(minHeap.size(), maxHeap.size()) > 1) {
                if (minHeap.size() < maxHeap.size()) {
                    minHeap.add(maxHeap.poll());
                } else {
                    maxHeap.add(minHeap.poll());
                }
            }
            if (maxHeap.size() != minHeap.size()) {
                if (maxHeap.size() > minHeap.size()) {
                    median = maxHeap.peek();
                } else {
                    median = minHeap.peek();
                }
            } else {
                median = ((double) minHeap.peek() + maxHeap.peek()) / 2;
            }
            doubles[i - 1] = median;
        }
        return doubles;
    }
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /**
     * @see <a href=https://www.hackerrank.com/challenges/contacts/problem>Hacker rank test: Contacts</a>
     */
    static int[] contacts(String[][] queries) {
        Trie trie = new Trie();
        ArrayList<Integer> ans1 = new ArrayList<Integer>();
        for(int i = 0; i < queries.length; i++){
            if(queries[i][0].equalsIgnoreCase("add")) {
              trie.putIfAbsent(queries[i][1]);
            } else if(queries[i][0].equalsIgnoreCase("find")){
                ans1.add(trie.searchForPrefix(queries[i][1]));
            }
        }

        int[] ans = new int[ans1.size()];
        for (int i = 0; i < ans1.size(); i++) {
            ans[i] = ans1.get(i);
        }
        return ans;
    }

}

class Trie {
    private HashMap<Character, Trie> children = new HashMap<>();
    boolean isWord = false;
    int size = 0;
    public void putIfAbsent(String s) {
        Trie curr = this;
        for(char c : s.toCharArray()){
            curr.children.putIfAbsent(c, new Trie());
            curr = curr.children.get(c);
            curr.size++;
        }
        curr.isWord = true;
    }

    public int searchForPrefix(String prefix) {
        Trie curr = this;
        for(char c : prefix.toCharArray()){
            curr = curr.children.get(c);
            if(curr == null) return 0;
        }
        return curr.size;
    }
}
