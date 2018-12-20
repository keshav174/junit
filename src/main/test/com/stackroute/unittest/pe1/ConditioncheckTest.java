package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConditioncheckTest {
    Condition_check obj;

    @Before
    public void setUp() throws Exception {
        obj=new Condition_check();
    }

    @After
    public void tearDown() throws Exception {
        obj=null;
    }

    @Test
    public void fun() {


        String str2=obj.fun(27);
        assertEquals("Incorrect ", "tom", str2);
    }
    @Test
    public void fun1() {


        String str2=obj.fun(27);
        assertEquals("Incorrect ", "tom", str2);
    }
    @Test
    public void fun3() {


        String str2=obj.fun(28);
        assertEquals("Incorrect ", "jerry", str2);
    }
    @Test
    public void fun4() {


        String str2=obj.fun(25);
        assertEquals("Incorrect ", "tom", str2);
    }


}