package com.bridgelaz;

public class QuantityMeasure {

    private final Converion.Convertor unit;
    private final double value;

    public QuantityMeasure(Converion.Convertor unitValue, double input) {
        this.unit=unitValue;
        this.value=input;
    }

    public boolean covertFeetToYard(QuantityMeasure quantityMeasure) {
        Double result=this.unit.convertUnits(this.value);
        Double result1=quantityMeasure.unit.convertUnits(quantityMeasure.value);
        return result.equals(result1);
    }

}
