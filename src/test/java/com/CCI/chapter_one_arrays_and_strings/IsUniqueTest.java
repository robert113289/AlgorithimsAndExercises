package com.CCI.chapter_one_arrays_and_strings;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class IsUniqueTest {
    private IsUnique objUnderTest = new IsUnique();

    @Test
    public void isUnique() {
        assertThat(objUnderTest.isUnique("ABC")).isEqualTo(true);
        assertThat(objUnderTest.isUnique("ABB")).isEqualTo(false);
    }

    @Test
    public void isUnique2() {
        assertThat(objUnderTest.isUniqueUsingBitSet("ABC")).isEqualTo(true);
        assertThat(objUnderTest.isUniqueUsingBitSet("ABB")).isEqualTo(false);
    }
}