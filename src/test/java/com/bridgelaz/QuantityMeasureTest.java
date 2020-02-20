package com.bridgelaz;


import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasureTest {

    @Test
    public void givenThreeFeetToOneyard_shouldBeReturntrue() {
        QuantityMeasure value = new QuantityMeasure(Converion.Convertor.Feet,3);
        QuantityMeasure value1 = new QuantityMeasure(Converion.Convertor.Yard,1);
        boolean check=value.covertFeetToYard(value1);
        Assert.assertTrue(check);
    }

    @Test
    public void givenOneFeetToOneYard_shouldBeReturenFalse() {
        QuantityMeasure value = new QuantityMeasure(Converion.Convertor.Feet,1);
        QuantityMeasure value1 = new QuantityMeasure(Converion.Convertor.Yard,1);
        boolean check=value.covertFeetToYard(value1);
        Assert.assertFalse(check);
    }

    @Test
    public void givenOneInchToOneYard_shouldBeReturnFalse() {
        QuantityMeasure value = new QuantityMeasure(Converion.Convertor.Inch,1);
        QuantityMeasure value1 = new QuantityMeasure(Converion.Convertor.Yard,1);
        boolean check=value.covertFeetToYard(value1);
        Assert.assertFalse(check);
    }

    @Test
    public void givenOneYardToThirtySixInch_shouldBeReturnTrue() {
        QuantityMeasure value1 = new QuantityMeasure(Converion.Convertor.Yard,1);
        QuantityMeasure value = new QuantityMeasure(Converion.Convertor.Inch,36);
        boolean check=value.covertFeetToYard(value1);
        Assert.assertTrue(check);
    }

    @Test
    public void givenOneYardToThreeInch_shouldBeReturnTrue() {
        QuantityMeasure value1 = new QuantityMeasure(Converion.Convertor.Yard,1);
        QuantityMeasure value = new QuantityMeasure(Converion.Convertor.Feet,3);
        boolean check=value.covertFeetToYard(value1);
        Assert.assertTrue(check);
    }

    @Test
    public void givenTwoInchToFiveCentimeters_shouldBeReturnTrue() {
        QuantityMeasure value1 = new QuantityMeasure(Converion.Convertor.Inch,2);
        QuantityMeasure value = new QuantityMeasure(Converion.Convertor.Centimeters,5.08);
        boolean check=value.covertFeetToYard(value1);
        Assert.assertTrue(check);
    }

    @Test
    public void givenTwoInchAddTwoInch_shouldBeReturnTrue() {
        QuantityMeasure value1 = new QuantityMeasure(Converion.Convertor.Inch,2);
        QuantityMeasure value = new QuantityMeasure(Converion.Convertor.Inch,2);
        int  check=value.addition(value1);
        Assert.assertEquals(4,check);
    }

    @Test
    public void givenOneFtAddTwoInch_shouldBeReturnTrue() {
        QuantityMeasure value1 = new QuantityMeasure(Converion.Convertor.Feet,1);
        QuantityMeasure value = new QuantityMeasure(Converion.Convertor.Inch,2);
        int  check=value.addition(value1);
        Assert.assertEquals(14,check);
    }

    @Test
    public void givenOneFtAddOneFt_shouldBeReturnTrue() {
        QuantityMeasure value1 = new QuantityMeasure(Converion.Convertor.Feet,1);
        QuantityMeasure value = new QuantityMeasure(Converion.Convertor.Feet,1);
        int  check=value.addition(value1);
        Assert.assertEquals(24,check);
    }

    @Test
    public void givenTwoInchAddTwo_FiveCentimeters_shouldBeReturnTrue() {
        QuantityMeasure value1 = new QuantityMeasure(Converion.Convertor.Inch,2);
        QuantityMeasure value = new QuantityMeasure(Converion.Convertor.Centimeters,2.6);
        int  check=value.addition(value1);
        Assert.assertEquals(3,check);
    }
}
