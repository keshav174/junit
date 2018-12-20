package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class sortintTest {
    Sort_int obj;

    @Before
    public void setUp() throws Exception {
        obj=new Sort_int();
    }

    @After
    public void tearDown() throws Exception {
        obj =null;
    }

    @Test
    public void reverse() {
        char arr[] ={'1','2','3','4','5'};
        String str1=obj.Reverse(arr);
        assertEquals("Incorrect ", "54321", str1);
    }

    @Test
    public void sum() {
        char arr[]={'2','4','5'};
        String str=obj.sum(arr);
        assertEquals("incorrect","false",str);
    }
    @Test
    public void sum1() {
        char arr[]={'2','6','5','8'};
        String str=obj.sum(arr);
        assertEquals("incorrect","true",str);
    }
}