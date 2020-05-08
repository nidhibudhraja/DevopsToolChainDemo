package com.spe;

import org.junit.*;

import java.io.IOException;

public class CalculatorTests {
    private Calculator calc;
    @Before
    public void init(){
        calc=new Calculator();
    }
    @Test
    public void addTest()throws IOException{
        int a= 7;
        int b=9;
        int expected_sum=16;
        long obtained_sum=calc.add(a,b);
        Assert.assertEquals(expected_sum,obtained_sum);
    }
}
