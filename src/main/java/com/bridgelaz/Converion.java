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
        Inch {
            public double convertUnits(double input) {
                return input ;
            }
        };

        public double convertUnits(double value) {
            return 0;
        }
    }


}
