package org.example.Sensors;

public class SpO2sensor extends Sensor {


    @Override
    public double getValue() {

        value = Math.round((100.1 - (Math.random() * 6)) * 10);
        value = value / 10;

        return value;
    }

}
