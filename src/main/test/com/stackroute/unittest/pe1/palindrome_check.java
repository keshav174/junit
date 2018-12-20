package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class palindrome_check {
    Palindrome_check obj;

    @Before
    public void setUp() throws Exception {
        obj=new Palindrome_check();
    }

    @After
    public void tearDown() throws Exception {
        obj=null;
    }

    @Test
    public void palindromeCheck() {
        String expectedValue = "is a palindrome and the sum of even numbers is less than 25";

        //Act
        String actualValue = obj.palindromeCheck(121);
        //Assert
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void palindromeCheck1() {
        String expectedValue = "is a palindrome and the sum of even numbers is less than 25";

        //Act
        String actualValue = obj.palindromeCheck(123321);
        //Assert
        assertEquals(expectedValue, actualValue);
    }
}