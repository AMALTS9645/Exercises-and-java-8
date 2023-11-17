package com.stackroute.loops;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestSequenceAppTests {
    private ByteArrayOutputStream outStream;

    private static final String MESSAGE = "Check the logic of your method testLongestSequence";
    private static final String INPUT_VALIDATION_MESSAGE = "Check the logic of your method inputValidator";
    private static final String PROPER_NEGATIVE_MESSAGE = "Give proper input not negative number";
    private static final String PROPER_ZERO_MESSAGE = "Give proper input not zero";


    @BeforeEach
    public void setUp() {
        outStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outStream));
    }

    @AfterEach
    public void tearDown() {
        outStream = null;
    }

    @Test
    public void givenSystemInputNegativeThenReturnErrorString() {
        System.setIn(new ByteArrayInputStream("-20".getBytes()));
        LongestSequence.main(null);
        assertEquals(PROPER_NEGATIVE_MESSAGE, outStream.toString().trim().replaceAll(".*\n", ""), INPUT_VALIDATION_MESSAGE);

    }

    @Test
    public void givenSystemInputZeroThenReturnErrorString() {
        System.setIn(new ByteArrayInputStream("0".getBytes()));
        LongestSequence.main(null);
        assertEquals(PROPER_ZERO_MESSAGE, outStream.toString().trim().replaceAll(".*\n", ""), INPUT_VALIDATION_MESSAGE);
    }

    @Test
    public void givenSystemInputIntegerThenReturnString() {
        System.setIn(new ByteArrayInputStream("7".getBytes()));
        String output = "0";
        LongestSequence.main(null);
        assertEquals(output, outStream.toString().trim().replaceAll(".*\n", ""), MESSAGE);
    }
}
