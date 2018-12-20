package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class unspecifiedsumTest {
    Unspecified_sum obj;

    @Before
    public void setUp() throws Exception {
        obj=new Unspecified_sum();
    }

    @After
    public void tearDown() throws Exception {
        obj=null;
    }

    @Test
    public void addNum() {
        int expectedValue = 41;



        int actualValue = obj.addNum("12 23 2 4");

        assertEquals(expectedValue, actualValue);
    }
}