package com.stackroute.unittest.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class GuessnumberTest {

    @Test
    public void guess() {
        String expectedValue = "Number guessed matches the original number";
        Guess_number gn = new Guess_number();
        //Act
        String actualValue = gn.guess(76);
        //Assert
        assertEquals(expectedValue, actualValue);
    }
}