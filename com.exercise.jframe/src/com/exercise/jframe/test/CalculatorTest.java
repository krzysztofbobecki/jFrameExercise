package com.exercise.jframe.test;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Test;
import com.exercise.jframe.frame.calculator.Calculator;

public class CalculatorTest {

    @Test
    public void addingMethodCheck() {

        Calculator calc = new Calculator();
        String expected = "6.8";
        String actual = calc.calcMathOperation(new BigDecimal(2.3), new BigDecimal(4.5), "+");
        assertEquals("OK", expected, actual);
    }
    
    @Test
    public void addingNegativNumber() {
        
        Calculator calc = new Calculator();
        String expected  = "-2.1";
        String actual = calc.calcMathOperation(new BigDecimal(-4.1), new BigDecimal(2.0), "+");
        assertEquals("OK", expected, actual);
    }

    @Test
    public void substracionMethodCheck() {
        Calculator calc = new Calculator();
        String expected = "-2.2";
        String actual = calc.calcMathOperation(new BigDecimal(2.3), new BigDecimal(4.5), "-");
        assertEquals("OK", expected, actual);
    }

    @Test
    public void multiplicationMethodCheck() {
        Calculator calc = new Calculator();
        String expected = "10.35";
        String actual = calc.calcMathOperation(new BigDecimal(2.3), new BigDecimal(4.5), "*");
        assertEquals("OK", expected, actual);
    }

    @Test
    public void divisionMethodCheck() {
        Calculator calc = new Calculator();
        String expected = "0.5111111111111111";
        String actual = calc.calcMathOperation(new BigDecimal(2.3), new BigDecimal(4.5), "/");
        assertEquals("OK", expected, actual);
    }

}
