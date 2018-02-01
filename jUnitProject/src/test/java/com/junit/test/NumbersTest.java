package com.junit.test;

import com.junit.classes.numberList;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;


public class NumbersTest {
    numberList nl;

    @Before
    public void initalizeList(){
        nl = new numberList();
        nl.addNumbers(5);
        nl.addNumbers(3);
    }

    @Test
    public void testIfNull(){
        assertNotNull(nl.getItem(1));
    }


}
