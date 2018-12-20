package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class reversestringTest {
    Reverse_string obj;

    @Before
    public void setUp() throws Exception {
        obj=new Reverse_string();
    }

    @After
    public void tearDown() throws Exception {
        obj=null;
    }

    @Test
    public void reverse() {
        char []arr ={'l','o','n','d','o','n'};
        String str=obj.Reverse(arr);
        assertEquals("incorrect","nodnol",str);
    }
    @Test
    public void reverse1() {
        char []arr ={'l','o','n','d','o'};
        String str=obj.Reverse(arr);
        assertEquals("incorrect","odnol",str);
    }
    @Test
    public void reverse2() {
        char []arr ={'o','n','d','o'};
        String str=obj.Reverse(arr);
        assertEquals("incorrect","odno",str);
    }
}