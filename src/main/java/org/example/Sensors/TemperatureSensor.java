package org.example.Sensors;

public class TemperatureSensor extends Sensor{


    public TemperatureSensor(){
        System.out.println("Temp. sensor established");

    }

    @Override
    public double getValue(){
       value = (40 - (Math.random() * 5));

        return value;
    }



}
