package com.bridgelaz;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasureTest {
    @Test
    public void givenNumber_convertFeetToYard() {
        QuantityMeasure quantityMeasure = new QuantityMeasure();
        int result=quantityMeasure.covertFeetToYard(3);
        Assert.assertEquals(1,result);
    }
}
