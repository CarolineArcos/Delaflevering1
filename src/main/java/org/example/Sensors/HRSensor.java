package org.example.Sensors;

 // public class HRSensor extends Sensor {
public class HRSensor extends Sensor{

    @Override
    public double getValue() {

        value = Math.round(110 - (Math.random() * 60));

        // tal mellem 110 og 50 afrundet

        return value;

    }
}
