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
}
