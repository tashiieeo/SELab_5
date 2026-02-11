package com.example.lab_5;

import static org.junit.Assert.assertEquals;

import junit.framework.TestCase;

import org.junit.Test;

public class MathUtilTest {
    @Test
    public void TestAbsofPositiveNumber() {
        double inputvalue=3;
        double actualabsvalue=MathUtil.abs(inputvalue);
        double expectedvalue=inputvalue;
        assertEquals(expectedvalue, actualabsvalue, 0.0005 );
    }
    @Test
    public void TestAbsofNegativeNumber(){
        double inputvalue=-2;
        double actualabsvalue=MathUtil.abs(inputvalue);
        double expectedvalue=inputvalue*-1;
        assertEquals(expectedvalue, actualabsvalue, 0.0005);
    }
    @Test
    public void TestCalculatorpositive(){
        double a= 3;
        double b= 5;


    }


}