package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class nthiterationTest {
    Nth_iteration obj;

    @Before
    public void setUp() throws Exception {
        obj=new Nth_iteration();
    }

    @After
    public void tearDown() throws Exception {
        obj=null;
    }

    @Test
    public void fun() {
        String str1=obj.fun(3);
        assertEquals("wrong ","122333",str1);
    }
    @Test
    public void fun1() {
        String str1=obj.fun(4);
        assertEquals("wrong ","1223334444",str1);
    }
    @Test
    public void fun2() {
        String str1=obj.fun(5);
        assertEquals("wrong ","122333444455555",str1);
    }
}