package com.codekatas.stringcalculator;

import com.codekatas.stringcalculator.StringCalculator;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by hari on 01-04-2017.
 */
public class StringCalculatorSpec {

    @Test
    public void return0WhenAddingNullString(){
        Assert.assertEquals(0, StringCalculator.add(null));
    }

    @Test
    public void return0WhenAddingEmptyString(){
        Assert.assertEquals(0, StringCalculator.add(""));
    }

    @Test
    public void returnNumberWhenAddingStringWithOneNumber(){
        Assert.assertEquals(1, StringCalculator.add("1"));
    }

    @Test
    public void returnSumWhenAddingStringWithTwoNumbers(){
        Assert.assertEquals(4, StringCalculator.add("1,3"));
    }

    @Test
    public void returnSumWhenAddingStringWithThreeNumbers(){
        Assert.assertEquals(8, StringCalculator.add("1,3,4"));
    }

    @Test
    public void returnSumWhenAddingStringWithNegativeNumbers(){
        Assert.assertEquals(-8, StringCalculator.add("-1,-3,-4"));
    }



}