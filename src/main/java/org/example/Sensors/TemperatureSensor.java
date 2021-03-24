package org.example.Sensors;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class TemperatureSensor extends Sensor {


    public TemperatureSensor() {
        System.out.println("Temp. sensor established");

    }

    @Override
    public double getValue() {
        value = ((40.0 - (Math.random() * 5.0)) * 100);
        value = value / 100;
        return value;
    }


}
