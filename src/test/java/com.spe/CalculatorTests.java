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
    @Test
    public void subtractTest()throws IOException{
        int a= 7;
        int b=9;
        int expected_diff=-2;
        long obtained_diff=calc.subtract(a,b);
        Assert.assertEquals(expected_diff,obtained_diff);
    }
    @Test
    public void multiplyTest()throws IOException{
        int a= 7;
        int b=9;
        int expected_product=63;
        long obtained_product=calc.multiply(a,b);
        Assert.assertEquals(expected_product,obtained_product);
    }
    @Test
    public void divideTest()throws IOException{
        int a= 27;
        int b=9;
        int expected_q=3;
        long obtained_q=calc.divide(a,b);
        Assert.assertEquals(expected_q,obtained_q);
    }
    @Test
    public void nonZeroDivisorTest() throws IOException{
        int a=4;
        int b=0;
        Assert.assertEquals("Divisor should be a non zero number",0,calc.divide(a,b));
    }
}
