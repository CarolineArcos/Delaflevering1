package org.example.Sensors;

public class SensorTester {

    public static void main(String[] args) {
        TemperatureSensor ts = new TemperatureSensor();
        SpO2sensor spO2sensor= new SpO2sensor();

        System.out.println("Fra TS: "+ts.getValue()+"C og fra SpO2: "+spO2sensor.getValue()+"%");

    }
}
