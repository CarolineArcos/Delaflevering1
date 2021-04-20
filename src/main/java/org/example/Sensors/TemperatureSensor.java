package org.example.Sensors;


public class TemperatureSensor extends Sensor {


    public TemperatureSensor() {
        System.out.println("Temp. sensor established");


    }

    @Override
    public double getValue() {

        value = Math.round((40.1 - (Math.random() * 5.0)) * 100);
        value = value / 100;
        // tal mellem 40 og 35 afrundet til 2 decimaler
        return value;
    }


}
