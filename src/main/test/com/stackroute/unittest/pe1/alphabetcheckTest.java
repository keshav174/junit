package com.stackroute.unittest.pe1;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class alphabetcheckTest {
    Alphabet_check obj;

    @Before
    public void setUp() throws Exception {
         obj=new Alphabet_check();

    }

    @After
    public void tearDown() throws Exception {
        obj=null;
    }

    @Test
    public void fun() {

        String str1=obj.fun("2");
        assertEquals("Incorrect ", "2 is a digit", str1);
    }
    @Test
    public void fun1() {

        String str1=obj.fun("a");
        assertEquals("Incorrect ", "a is a small letter", str1);
    }
    @Test
    public void fun2() {

        String str1=obj.fun("A");
        assertEquals("Incorrect ", "A is a capital letter", str1);
    }

}