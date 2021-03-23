package org.example.Sensors;

public class SensorTester {

    public static void main(String[] args) {
        Temperaturesensor ts = new Temperaturesensor();
        SpO2sensor spO2sensor= new SpO2sensor();

        System.out.println("Fra TS:"+ts.getValue()+" og fra Spo2:"+spO2sensor.getValue());

        //Test fra Mia 2 og 3
        //Emilie was here
        //Halløjsa
    }
}
