package com.bridgelaz;

public class Converion {

    public  enum Convertor {

        Feet {
            public double convertUnits(double input) {
                return input * 12;
            }
        },
        Yard {
            public double convertUnits(double input) {
                return input * 3 * 12;
            }
        },
        Centimeters {
            public double convertUnits(double input) {
                return input / 2.54;
            }
        },
        Inch {
            public double convertUnits(double input) {
                return input;
            }
        },
        Gallon {
            public double convertUnits(double input) {
                return input * 3.78;
            }
        },
        Liters{
            public double convertUnits(double input) {
                return input;
            }
        },
        Ml {
            public double convertUnits(double input){
                return input / 1000;
            }
        };

        public double convertUnits(double value) {
            return 0;
        }
    }


}
