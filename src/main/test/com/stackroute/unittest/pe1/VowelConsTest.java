package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VowelConsTest {
    Vowel_Cons obj;

    @Before
    public void setUp() throws Exception {
        obj=new Vowel_Cons();
    }

    @After
    public void tearDown() throws Exception {
        obj=null;
    }

    @Test
    public void fun() {
        String str=obj.fun("23");
        assertEquals("Incorrect ", "Error", str);

    }
    @Test
    public void fun1() {
        String str=obj.fun("a");
        assertEquals("Incorrect ", "Vowel ", str);

    }
    @Test
    public void fun2() {
        String str=obj.fun("e");
        assertEquals("Incorrect ", "Vowel ", str);

    }
    @Test
    public void fun3() {
        String str=obj.fun("i");
        assertEquals("Incorrect ", "Vowel ", str);

    }
    @Test
    public void fun4() {
        String str=obj.fun("o");
        assertEquals("Incorrect ", "Vowel ", str);

    }
}