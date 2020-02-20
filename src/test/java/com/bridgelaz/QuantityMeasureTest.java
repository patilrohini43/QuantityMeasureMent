package com.bridgelaz;


import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasureTest {

    @Test
    public void givenNumber_convertFeetToYard() {
        QuantityMeasure value = new QuantityMeasure(Converion.Convertor.Feet,3);
        QuantityMeasure value1 = new QuantityMeasure(Converion.Convertor.Yard,1);
         boolean check=value.covertFeetToYard(value1);
         Assert.assertTrue(check);

    }
}
