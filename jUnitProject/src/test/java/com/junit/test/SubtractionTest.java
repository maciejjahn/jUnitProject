package com.junit.test;

import com.junit.classes.Subtraction;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class SubtractionTest {
    Subtraction subtraction;
    @Before
    public void initialize(){
        subtraction = new Subtraction();
    }

    @Test
    public void testSub(){
        assertFalse(subtraction.subResult(5,1));

    }



}
