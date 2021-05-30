package org.example.Sensors;


public class TemperatureSensor extends Sensor {


    public TemperatureSensor() {
        System.out.println("Temp. sensor established");


    }

    @Override
    public double getValue() {

        value = (42.1 - (Math.random() * 7.0));

        // tal mellem 40 og 35 afrundet til 2 decimaler
        return value;
    }


}
