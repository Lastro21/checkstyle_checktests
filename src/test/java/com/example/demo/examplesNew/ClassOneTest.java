package com.example.demo.examplesNew;

import org.junit.Test;

import static org.junit.Assert.*;

public class ClassOneTest {

    ClassOne classOne = new ClassOne();

    @Test
    public void anyMethodOne() {
        assertEquals(false, classOne.anyMethodOne());
    }

    @Test
    public void anyMethodTwo() {
        assertEquals(true, classOne.anyMethodTwo());
    }
}