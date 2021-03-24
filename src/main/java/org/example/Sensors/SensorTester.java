package org.example.Sensors;

public class SensorTester {

    public static void main(String[] args) {
        TemperatureSensor ts = new TemperatureSensor();
        SpO2sensor spO2sensor= new SpO2sensor();
        HRSensor hrSensor = new HRSensor();

        System.out.println("Temperatur: "+ts.getValue()+"C");
        System.out.println("SpO2:       "+spO2sensor.getValue()+"%");
        System.out.println("Heartrate:  "+hrSensor.getValue() + " BPM");

    }
}
