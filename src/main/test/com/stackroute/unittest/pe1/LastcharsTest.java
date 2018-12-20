package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LastcharsTest {
    Last_chars obj;

    @Before
    public void setUp() throws Exception {
        obj = new Last_chars();
    }

    @After
    public void tearDown() throws Exception {
        obj = null;
    }

    @Test
    public void addsubstr() {
        String expectedValue = "Stackrouterouterouterouterouteroute";

        String actualValue = obj.addsubstr("Stackroute", 5);

        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void addsubstr1() {
        String expectedValue = "Stackrouteouteouteouteoute";

        String actualValue = obj.addsubstr("Stackroute", 4);

        assertEquals(expectedValue, actualValue);
    }



}
