package com.example.lab_5;

import static org.junit.Assert.assertEquals;

import junit.framework.TestCase;

import org.junit.Test;

public class TestCalculator  {
    @Test
    public void TestCalculatorpositive(){
        double a= 3;
        double b= 5;
        double expectedvalue=8;
        double actualvalue=Calculator.add(a,b);
        assertEquals(expectedvalue, actualvalue, 0.0005);
    }
    @Test
    public void testSub() {
        double a = 10;
        double b = 4;
        double expected = 6;
        double actual = Calculator.sub(a, b);

        assertEquals(expected, actual, 0.0005);
    }


}