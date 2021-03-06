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

    @Test
    public void givenOneGallonAndLiters_shouldBeReturntrue() {
        QuantityMeasure value = new QuantityMeasure(Converion.Convertor.Gallon,1);
        QuantityMeasure value1 = new QuantityMeasure(Converion.Convertor.Liters,3.78);
        boolean check=value.covertFeetToYard(value1);
        Assert.assertTrue(check);
    }

    @Test
    public void givenOneLitersAnd1000Ml_shouldBeReturntrue() {
        QuantityMeasure value = new QuantityMeasure(Converion.Convertor.Liters,1);
        QuantityMeasure value1 = new QuantityMeasure(Converion.Convertor.Ml,1000);
        boolean check=value.covertFeetToYard(value1);
        Assert.assertTrue(check);
    }

    @Test
    public void givenOneGallonAndLiters_shouldBeReturnSeven() {
        QuantityMeasure value = new QuantityMeasure(Converion.Convertor.Gallon,1);
        QuantityMeasure value1 = new QuantityMeasure(Converion.Convertor.Liters,3.78);
        int  check=value.addition(value1);
        Assert.assertEquals(7,check);
    }

    @Test
    public void givenOneLitersAnd1000Ml_shouldBeReturnTwoLiters() {
        QuantityMeasure value = new QuantityMeasure(Converion.Convertor.Liters,1);
        QuantityMeasure value1 = new QuantityMeasure(Converion.Convertor.Ml,1000);
        int check=value.addition(value1);
        Assert.assertEquals(2,check);
    }

    @Test
    public void givenOneKgsAndThousnadGm_shouldBeReturntrue() {
        QuantityMeasure value = new QuantityMeasure(Converion.Convertor.Kg,1);
        QuantityMeasure value1 = new QuantityMeasure(Converion.Convertor.Gram,1000);
        boolean check=value.covertFeetToYard(value1);
        Assert.assertTrue(check);
    }

    @Test
    public void givenOneTonneAndThousnadkg_shouldBeReturntrue() {
        QuantityMeasure value = new QuantityMeasure(Converion.Convertor.Tonne,1);
        QuantityMeasure value1 = new QuantityMeasure(Converion.Convertor.Kg,1000);
        boolean check=value.covertFeetToYard(value1);
        Assert.assertTrue(check);
    }

    @Test
    public void givenOneTonneAndThoundGm_shouldBeReturn101() {
        QuantityMeasure value = new QuantityMeasure(Converion.Convertor.Tonne,1);
        QuantityMeasure value1 = new QuantityMeasure(Converion.Convertor.Gram,1000);
        int check=value.addition(value1);
        Assert.assertEquals(1001,check);
    }

    @Test
    public void givenFahrenheitTempratureEqualCelsius_shouldBeReturnTrue() {
        QuantityMeasure value = new QuantityMeasure(Converion.Convertor.Fahrenheit,212F);
        QuantityMeasure value1 = new QuantityMeasure(Converion.Convertor.Celsius,100);
        boolean check=value.covertFeetToYard(value1);
        Assert.assertTrue(check);
    }
}
