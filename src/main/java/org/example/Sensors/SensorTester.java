package org.example.Sensors;

public class SensorTester {

    public static void main(String[] args) {
        Temperaturesensor ts = new Temperaturesensor();
        SpO2sensor spO2sensor= new SpO2sensor();

        System.out.println("Fra TS:"+ts.getValue()+" og fra Spo2:"+spO2sensor.getValue());

        /* Emilie was here */
    }
}
