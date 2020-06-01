package com.company.Amazon;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void retrieveMostFrequentlyUsedWords() {
        Solution underTest = new Solution();
        ArrayList<String> expected = new ArrayList<>();
        String helpText = "Rose jam, 4taco";

        expected.add("jam");
        expected.add("rose");
        expected.add("taco");
        assertEquals(expected, underTest.retrieveMostFrequentlyUsedWords(helpText, Collections.emptyList()));
    }
}