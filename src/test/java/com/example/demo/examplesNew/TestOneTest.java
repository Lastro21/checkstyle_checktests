package com.example.demo.examplesNew;

import org.junit.Assert;
import org.junit.Test;

public class TestOneTest {

    @Test
    public void anyName() {
        TestOne testOne = new TestOne();

        Assert.assertEquals("newnew", testOne.anyName(""));
    }
}