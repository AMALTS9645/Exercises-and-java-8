package com.stackroute.loops;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class LongestSequenceTests {
    private LongestSequence longestSequence;

    private static final String MESSAGE = "Check the logic of your method findLongestSequence";

    @BeforeEach
    public void setUp() {
        longestSequence = new LongestSequence();
    }

    @AfterEach
    public void tearDown() {
        longestSequence = null;
    }

    @Test
    public void givenPositiveIntegerThenReturnResult() {

        assertEquals(6, longestSequence.findLongestSequence(12546), MESSAGE);
        assertEquals(3, longestSequence.findLongestSequence(4564), MESSAGE);
        assertEquals(2, longestSequence.findLongestSequence(4), MESSAGE);
    }

    @Test
    public void givenPositiveIntegerThenReturnResultNotNull() {
        assertNotNull(longestSequence.findLongestSequence(0), MESSAGE);
        assertNotNull(longestSequence.findLongestSequence(256), MESSAGE);
    }

    @Test
    public void givenPositiveIntegerWithLengthZeroThenReturnResult() {
        assertEquals(0, longestSequence.findLongestSequence(7), MESSAGE);
        assertEquals(0, longestSequence.findLongestSequence(15), MESSAGE);
        assertEquals(0, longestSequence.findLongestSequence(255), MESSAGE);
    }

    @Test
    public void givenPositiveIntegerWithLengthOneThenReturnResult() {
        assertEquals(1, longestSequence.findLongestSequence(5), MESSAGE);
        assertEquals(1, longestSequence.findLongestSequence(6), MESSAGE);
    }


}
