package org.example.Sensors;

public class Temperaturesensor extends Sensor{


    public Temperaturesensor(){
        System.out.println("Temp. sensor established");

    }

    @Override
    public double getValue(){
       double value = 70.0;

        return value;
    }



}
